/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bolsinha;

/**
 *
 * @author ionasantana
 */
public class Estojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta compacter = new Esferografica("azul");
        Caneta gizes = new Giz("verde");
        Caneta lapise = new Lapis("preto");
        
        escreverTexto(compacter, "escrevendo um texto");
        escreverTexto(gizes, "colorido de verde");
        escreverTexto(lapise, "e contornando de preto");
    }
    
    public static void escreverTexto(Caneta c, String texto){
        System.out.println("Teste de Escrita: " );
        c.escrever(texto);
        System.out.println("Cor: " + c.getCor());
       
    }
    
}
