package chain.atacantes;

import chain.Ataca;

public class GrandeTropa implements Ataca{

    @Override
    public void ataca() {
        System.out.println("A grande tropa atacará!");
        
    }
    public Boolean vindo(){
        Boolean estaVindo = true;
        return estaVindo;
    }
    public Boolean naoVindo(){
        Boolean estaVindo = false;
        return estaVindo;
    }
    
}
