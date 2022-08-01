/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cerveja_e_quase_cervejas;

import facade.Ales;
import facade.Lagers;

/**
 *
 * @author ionasantana
 */
public class consagrado_desce_mais_uma {

    
    public static void main(String[] args) {
        Ales ales = new Ales();
        System.out.println("Partiu Ales");
        ales.pedirAle();
        ales.pedirStout();
        ales.pedirTrigo();
        ales.pedirPorter();
        
        
        Lagers lagers = new Lagers();
        System.out.println("\n\nPartiu Lagers");
        lagers.pedirLager();
        lagers.pedirMunich();
        lagers.pedirVienna();
    }
    
}
