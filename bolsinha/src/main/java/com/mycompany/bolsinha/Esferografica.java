/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolsinha;

/**
 *
 * @author ionasantana
 */
public class Esferografica implements Caneta{

     private String cor;
    public Esferografica(String cor) {
        this.cor = cor;
    }
    
    @Override
    public void escrever(String texto) {
        System.out.println("Usando " + texto + " à caneta esferográfica.");
    }

    @Override
    public String getCor() {
        return this.cor;
    }
    
}
