/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bolsinha;

/**
 *
 * @author ionasantana
 */
public class Giz implements Caneta{

    private String cor;

    public Giz(String cor) {
        this.cor = cor;
    }
    @Override
    public void escrever(String texto) {
        System.out.println("Usando " + texto + " com giz");
    }

    @Override
    public String getCor() {
       return this.cor;
    }
    
}
