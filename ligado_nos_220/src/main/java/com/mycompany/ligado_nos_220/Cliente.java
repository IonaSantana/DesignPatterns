/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ligado_nos_220;

import Interface.Voltagem110;
import Interface.Voltagem220;
import adapters.Conversor220v110Adapter;
import Interface.ArCondicionado;

/**
 *
 * @author ionasantana
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voltagem110 tomada10 = new Voltagem110();
        ArCondicionado ar = new ArCondicionado(tomada10);
        
        if (ar.testeLigacao()) {
            System.out.println("O ar condicionado ligado.");
        } else {
            System.out.println("vai dar ruim isso ai.");
        }
        
        Voltagem220 tomada20 = new Voltagem220();
//        ArCondicionado ar2 = new Arcondicionado(tomada220);
        
     
        Voltagem110 tomada = new Conversor220v110Adapter(tomada20);
        ArCondicionado ar2 = new ArCondicionado(tomada);
        System.out.println("Ligação na tomada de 220v com adaptador: ");
        if (ar2.testeLigacao()) {
            System.out.println("O ar condicionado ligado.");
        } else {
            System.out.println("vai dar ruim isso ai.");
        }
    }
    
}
