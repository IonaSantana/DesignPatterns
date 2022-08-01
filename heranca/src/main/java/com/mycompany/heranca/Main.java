/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author ionasantana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa Joao = new Pessoa("Joao", 33, "Masculino");
        Empregado Ana = new Empregado("Ana", 21, "Feminino", 5000.00, "1400");
        Cliente Almir = new Cliente("Almir", 40, "Masculino", 2000.00, 1976);
        Gerente Tania = new Gerente("Tania",30,"",15000.00,"1300","Atendimento");
        Vendedor Igor = new Vendedor("Igor",0,"",7000.00,"",14000.00,120);
        System.out.println(Joao.imprime() + "\n\n");
        System.out.println(Ana.imprime() + "\n\n");
        System.out.println(Almir.imprime() + "\n\n");
        System.out.println(Tania.imprime() + "\n\n");
        System.out.println(Igor.imprime() + "\n\n");
        
        //Empregado teste = new Empregado();     
//        System.out.println(teste.imprime());
    }
    
}
