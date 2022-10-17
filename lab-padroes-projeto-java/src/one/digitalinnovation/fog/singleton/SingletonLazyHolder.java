package one.digitalinnovation.fog.singleton;


/**
* Singleton "Lazy Holder"
*
*@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
* @author Xacarami
*/
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        //private garante que ngm conseguirá instanciar o singleton
        super(); //com super ou sem o resultado seria o mesmo
    }
    
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}