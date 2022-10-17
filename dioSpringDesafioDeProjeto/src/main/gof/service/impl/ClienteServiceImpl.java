package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author falvojr
 */
@Service
public class ClienteServiceImpl implements ClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	// Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;


	private void salvarClienteComCep(Cliente cliente){
		String cep = cliente.getEndereco().getCep(); //sei la, só foi uma ideia //legal ver que foi usado logo depois
		// Verificar se o Endereço do Cliente já existe (pelo CEP)
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(()-> {
			// Caso não exista, integrar com o ViaCep e persistir o retorno
			Endereco novoEndereco = viaCepService.consultarCep(cep); //Se achar pelo cep/id, endereço recebe o Endereco. Caso não, cai aqui dentro
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		}); //aqui você vê se o repositório de endereço existe, e se é encontrável esse Id
		// Inserir Cliente, vinculando o Endereco (novo ou existente)

		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
		// Buscar todos os Clientes.
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> acharPorId = clienteRepository.findById(id);
		return acharPorId.get();
		// if (clienteRepository.findById(id) == null){
		// 	return null;
		// } else {
		// 	return clienteRepository.findById(id).get();
		// }
		//Assim não precisa de Optional
		// Buscar Cliente por ID.
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// Buscar Cliente por ID, caso exista:
		Optional<Cliente> acharPorIdAtualizar = clienteRepository.findById(id);
		if (acharPorIdAtualizar.isPresent()){
			// Verificar se o Endereço do Cliente já existe (pelo CEP)
			// Caso não exista, integrar com o ViaCep e persistir o retorno
			// Alterar Cliente, vinculando o Endereço (novo ou existente)
			salvarClienteComCep(cliente);
		}
		
	}

	@Override
	public void deletar(Long id) {
		// Deletar Cliente por ID.
		clienteRepository.deleteById(id);
	}

}