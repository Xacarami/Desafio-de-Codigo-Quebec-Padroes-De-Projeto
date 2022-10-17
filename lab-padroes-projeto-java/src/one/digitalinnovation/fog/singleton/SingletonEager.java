package one.digitalinnovation.fog.singleton;

/**
 * Singleton "apressado"
 * @author Xacarami
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}

// //private garante que ngm conseguirá instanciar o singleton
// super(); //com super ou sem o resultado seria o mesmo