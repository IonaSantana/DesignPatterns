/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.correcorreplus;

import modelos.Pilotos;
import modelos.Pista;

/**
 *
 * @author ionasantana
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            Pilotos a = new Pilotos("Japa", Pista.getIdPista());
            System.out.println(a.FichaPiloto() + "\n");

            Pilotos b = new Pilotos("Goku", Pista.getIdPista());
            System.out.println(b.FichaPiloto() + "\n");

            Pilotos c = new Pilotos("Jaspion", Pista.getIdPista());
            System.out.println(c.FichaPiloto() + "\n");

            Pilotos d = new Pilotos("Camarada", Pista.getIdPista());
            System.out.println(d.FichaPiloto() + "\n");

            Pilotos e = new Pilotos("Atrasado", Pista.getIdPista());
            System.out.println(e.FichaPiloto() + "\n");
        }catch(NullPointerException e)
        {
            System.out.println("Intruso tentou correr");
           
        }
//        
    }
    
}
