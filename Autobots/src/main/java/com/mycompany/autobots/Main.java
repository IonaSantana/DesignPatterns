/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.autobots;

import autobots.factory.SelectAutobot;
import autobots.model.Autobot;
import java.util.ArrayList;
/**
 *
 * @author ionasantana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Autobot> autobots = new ArrayList();
  
       SelectAutobot aux = new SelectAutobot();  
       autobots.add(aux.summonAutobot("LIDER"));
       autobots.add(aux.summonAutobot("CARBOTS"));
       autobots.add(aux.summonAutobot("CARBOTS"));
       autobots.add(aux.summonAutobot("AERIALBOTS"));
       autobots.add(aux.summonAutobot("AERIALBOTS"));
       autobots.add(aux.summonAutobot("MEDICO"));
       
       autobots.get(0).setNome("Optimus Prime");
       autobots.get(0).setAtaque(3);
       autobots.get(0).setVida(10);
       autobots.get(0).setDefesa(2);
       autobots.get(0).setEspecialidade("estrategista em combates");
       autobots.get(0).printCardAutobot("Autobot 1:");
       
       autobots.get(1).setNome("Bumblebee");
       autobots.get(1).setAtaque(4);
       autobots.get(1).setVida(9);
       autobots.get(1).setDefesa(2);
       autobots.get(1).setEspecialidade("ataque corpo-a-corpo");
       autobots.get(1).printCardAutobot("Autobot 2:");
       
       autobots.get(2).setNome("Ironhide");
       autobots.get(2).setAtaque(5);
       autobots.get(2).setVida(12);
       autobots.get(2).setDefesa(2);
       autobots.get(2).setEspecialidade("armas pesadas");
       autobots.get(2).printCardAutobot("Autobot 3:");
       
       autobots.get(3).setNome("Sylverbolt");
       autobots.get(3).setAtaque(4);
       autobots.get(3).setVida(12);
       autobots.get(3).setDefesa(2);
       autobots.get(3).setEspecialidade("emboscadas aéreas");
       autobots.get(3).printCardAutobot("Autobot 4:");
       
       autobots.get(4).setNome("Skydive");
       autobots.get(4).setAtaque(3);
       autobots.get(4).setVida(8);
       autobots.get(4).setDefesa(2);
       autobots.get(4).setEspecialidade("táticas aéreas de guerra");
       autobots.get(4).printCardAutobot("Autobot 5:");
       
       autobots.get(5).setNome("Ratchet");
       autobots.get(5).setAtaque(3);
       autobots.get(5).setVida(14);
       autobots.get(5).setDefesa(0);
       autobots.get(5).setEspecialidade("engenharia cybertroniana");
       autobots.get(5).printCardAutobot("Autobot 6:");
       
       
    }
    
}
