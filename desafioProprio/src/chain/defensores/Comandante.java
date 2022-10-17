package chain.defensores;

import chain.Defende;

public class Comandante implements Defende{

    @Override
    public void defende() {
        System.out.println("Os comandantes defenderão!");
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
