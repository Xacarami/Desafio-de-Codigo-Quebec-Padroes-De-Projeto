package subsistema1.crm;

public class CepApi {
    
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }
    //acima desde o inicio da classe é o Singelton

    public String recuperarCidade(String cep){
        return "Araraquara";
    }
    
    public String recuperarEstado(String cep){
        return "SP";
    }
}
