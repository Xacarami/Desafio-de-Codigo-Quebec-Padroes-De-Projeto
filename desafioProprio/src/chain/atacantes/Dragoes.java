package chain.atacantes;

import chain.Ataca;

public class Dragoes implements Ataca{
    
    @Override
    public void ataca() {
        System.out.println("Os dragões atacarão!");
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
