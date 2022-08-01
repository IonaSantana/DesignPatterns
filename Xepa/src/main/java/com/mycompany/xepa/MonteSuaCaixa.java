/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.xepa;

import com.mycompany.xepa.model.Caixa;
import com.mycompany.xepa.model.Composite;
import com.mycompany.xepa.model.Verdura;
import java.util.Arrays;

/**
 *
 * @author ionasantana
 */
public class MonteSuaCaixa {

    public static void main(String[] args) {
        Composite verduras1 = new Verdura("Alface", 7.0);
        Composite verduras2 = new Verdura("Cenoura", 9.00);
        Composite frutas1 = new Verdura("Pera", 5.55);
        Composite frutas2 = new Verdura("Banana", 6.7);
        
        
        Composite caixa1 = new Caixa("Caixa de Frutas:", Arrays.asList(frutas1,frutas2));
        Composite caixa2 = new Caixa("Caixa de Verduras:", Arrays.asList(verduras1,verduras2));
        Composite caixa3 = new Caixa("Caixa Mista:", Arrays.asList(frutas1,frutas2,verduras1,verduras2));
        Composite caixa4 = new Caixa("Caixa Mista:", Arrays.asList(caixa1,caixa2));
        Composite caixa5 = new Caixa("Caixa Mista:", Arrays.asList(caixa1,caixa2, verduras1));
        System.out.println("Composicao 1: ");
        caixa1.print();
        
        System.out.println("\nComposicao 2: ");
        caixa2.print();
        
        System.out.println("\nComposicao 3: ");
        caixa3.print();
        
        System.out.println("\nComposicao 4: ");
        caixa4.print();
        
        System.out.println("\nComposicao 5: ");
        caixa5.print();
    }
    
}
