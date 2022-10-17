package subsistema1.crm;

public class CrmService {
    
    private CrmService(){
        super();
    }
    //deixando o consultor da classe CrmService privado
    //pois não tem estrutura pra ficar sendo chamada
    //garantindo que quem chamasse essa classe, use-a,
    //sem ficar chamando-a sem necessidade

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema de Crm.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
