package one.digitalinnovation.fog;

import one.digitalinnovation.fog.facade.Facade;
import one.digitalinnovation.fog.singleton.SingletonEager;
import one.digitalinnovation.fog.singleton.SingletonLazy;
import one.digitalinnovation.fog.singleton.SingletonLazyHolder;
import one.digitalinnovation.fog.strategy.Comportamento;
import one.digitalinnovation.fog.strategy.ComportamentoAgressivo;
import one.digitalinnovation.fog.strategy.ComportamentoDefensivo;
import one.digitalinnovation.fog.strategy.ComportamentoNormal;
import one.digitalinnovation.fog.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        
            // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        //dão o mesmo local de memória, então funcionou

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        //também deveria voltar o mesmo, mas está null

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);




            // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();




            // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Gabriel", "12345678");
    }
}
