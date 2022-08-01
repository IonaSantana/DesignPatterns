/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import models.Ale;
import models.Cerveja;
import models.Porter;
import models.Stout;
import models.Trigo;

/**
 *
 * @author ionasantana
 */
public class Ales {

    private Cerveja ale;
    private Cerveja porter;
    private Cerveja stout;
    private Cerveja trigo;
    
    public Ales() {
        this.ale = new Ale();
        this.porter = new Porter();
        this.stout = new Stout();
        this.trigo = new Trigo();
    }
    
    public void pedirAle(){
        ale.produzir();
    }
    
    public void pedirPorter(){
        porter.produzir();
    }
    
    public void pedirStout(){
        stout.produzir();
    }
    
    public void pedirTrigo(){
        trigo.produzir();
    }
}
