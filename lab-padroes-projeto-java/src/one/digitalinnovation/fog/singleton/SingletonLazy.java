package one.digitalinnovation.fog.singleton;

/**
 * Singleton "preguiçoso"
 * @author Xacarami
 */

public class SingletonLazy {
    
    private static SingletonLazy instancia;

    private SingletonLazy() {
        //private garante que ngm conseguirá instanciar o singleton
        super(); //com super ou sem o resultado seria o mesmo
    }
    
    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
