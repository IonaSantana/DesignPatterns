/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cantina;

import fabricas.SalgadosFactory;
import java.util.ArrayList;
import modelos.Salgado;

/**
 *
 * @author ionasantana
 */
public class EstouComFomeCrueldadeEssePrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SalgadosFactory> cento_mas_so_tem_4_salgados = new ArrayList();
        
        SalgadosFactory cantina = new SalgadosFactory();
        cantina.assarSalgado("COXINHA", "GOIAS");
        cento_mas_so_tem_4_salgados.add(cantina);
        System.out.println("\n\nCoxinha de Goias:");
        System.out.println(cento_mas_so_tem_4_salgados.get(0).toString());
               
        cantina.assarSalgado("COXINHA", "CEARA");
        cento_mas_so_tem_4_salgados.add(cantina);
        System.out.println("\n\nCoxinha do Ceara:");
        System.out.println(cento_mas_so_tem_4_salgados.get(1).toString());     
        
        cantina.assarSalgado("EMPADA", "GOIAS");
        cento_mas_so_tem_4_salgados.add(cantina);
        System.out.println("\n\nEmpada de Goias:");
        System.out.println(cento_mas_so_tem_4_salgados.get(2).toString());
        
        cantina.assarSalgado("EMPADA", "CEARA");
        cento_mas_so_tem_4_salgados.add(cantina);
        System.out.println("\n\nEmpada do Ceara:");
        System.out.println(cento_mas_so_tem_4_salgados.get(3).toString());      
        
    }
    
}
