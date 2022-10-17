package chain;

import chain.atacantes.Dragoes;
import chain.atacantes.GrandeTropa;
import chain.atacantes.PequenaTropa;
import chain.defensores.Comandante;
import chain.defensores.Rei;
import chain.defensores.Soldados;

public class CampoDeBatalha {
    public static void main(String[] args) {
        
            Dragoes dragoes = new Dragoes();
            GrandeTropa grandeTropa = new GrandeTropa();
            PequenaTropa pequenaTropa = new PequenaTropa();
    
            Rei rei = new Rei();
            Comandante comandante = new Comandante();
            Soldados soldados = new Soldados();

            System.out.println("Acho que vejo inimigos... Oh não!");

            System.out.println(dragoes.vindo());
            if (dragoes.vindo() == true){
                dragoes.ataca();
                System.out.println("O único que poderá vencer os dragões é o Rei!");
                rei.defende();
            }

            System.out.println(grandeTropa.vindo());
            if (dragoes.vindo() == true){
                grandeTropa.ataca();
                System.out.println("Os únicos que poderão vencer a grande tropa são os comandantes!");
                if (comandante.naoVindo() == false){
                    System.out.println("Os comandantes não virão! FUGIRAM!");
                }
                System.out.println("Com a falta de dos comandantes, devemos de torcer para que os soldados possam segurar, e ajudar o rei");
            }

            System.out.println(pequenaTropa.naoVindo());
            if(pequenaTropa.naoVindo() == false){
                System.out.println("A pequena tropa não está vindo, os soldados, em maior quantidade mas com menos poder poderão defender!");
                soldados.defende();
            }

            System.out.println("Tudo acaba. Os inimigos, os aliados, os dragões, o rei...");
        };
}