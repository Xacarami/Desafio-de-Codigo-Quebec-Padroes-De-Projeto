package chain.atacantes;

import chain.Ataca;

public class PequenaTropa implements Ataca{

    @Override
    public void ataca() {
        System.out.println("A pequena tropa atacarĂ¡!");
        
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
