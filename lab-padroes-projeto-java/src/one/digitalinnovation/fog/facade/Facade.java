package one.digitalinnovation.fog.facade;

import subsistema1.crm.CepApi;
import subsistema1.crm.CrmService;

/*
 * Ideia: vc tem uma base de clientes, e que vc
 * deseja fazer uma migração desses clientes para
 * uma nova base, ou incrementar a sua base atual.
 * Sua base tem só nome e cep por exemplo. E vc
 * quer consumir uma api de CEP, para que a partir
 * do cep que você já tem, ela consuma essa api
 * e consolide as informações com o cep (rua, cidade,
 * complemento, estado...)
 */
public class Facade {
    
    public void migrarCliente(String nome, String cep){

        String recuperarCidade = CepApi.getInstancia().recuperarCidade(cep);
        String recuperarEstado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, recuperarCidade, recuperarEstado);
    }
}
