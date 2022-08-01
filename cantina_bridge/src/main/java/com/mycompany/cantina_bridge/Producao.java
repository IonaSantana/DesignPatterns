/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cantina_bridge;

import bridge.Recheio;
import classes.Carne;
import classes.Coxinha;
import classes.Esfirra;
import classes.Frango;
import classes.Queijo;
import classes.Salgado;

/**
 *
 * @author ionasantana
 */
public class Producao {

    public static void main(String[] args) {
       Recheio frango = new Frango(); 
       Recheio carne = new Carne(); 
       Recheio queijo = new Queijo();
       
       Salgado coxinha1 = new Coxinha(frango);
       Salgado coxinha2 = new Coxinha(carne);
       Salgado esfirra = new Esfirra(queijo);
       
       System.out.println(coxinha1.recheiar());
       System.out.println(coxinha2.recheiar());
       System.out.println(esfirra.recheiar());
    }
    
}
