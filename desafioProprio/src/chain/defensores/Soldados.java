package chain.defensores;

import chain.Defende;

public class Soldados implements Defende{

    @Override
    public void defende() {
        System.out.println("Os soldados defenderão!");
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
