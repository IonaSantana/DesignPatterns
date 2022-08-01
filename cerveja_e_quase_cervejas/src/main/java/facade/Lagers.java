/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import models.Cerveja;
import models.Lager;
import models.Munich;
import models.Vienna;

/**
 *
 * @author ionasantana
 */
public class Lagers {

    private Cerveja lager;
    private Cerveja munich;
    private Cerveja vienna;
    
    public Lagers() {
        this.lager = new Lager();
        this.munich = new Munich();
        this.vienna = new Vienna();
    }
    
    public void pedirLager(){
        lager.produzir();
    }
    
    public void pedirMunich(){
        munich.produzir();
    }
    
    public void pedirVienna(){
        vienna.produzir();
    }
}
