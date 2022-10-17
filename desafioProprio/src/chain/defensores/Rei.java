package chain.defensores;

import chain.Defende;

public class Rei implements Defende{

    @Override
    public void defende() {
        System.out.println("O Rei defenderá!");        
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
