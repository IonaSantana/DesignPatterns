/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xepa.model;

/**
 *
 * @author ionasantana
 */
public class Verdura implements Composite{
    private String nome;
    private double valor;
    
    public Verdura(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
    
    @Override
    public void print() {
        System.out.println("   |--- Produto= " + this.nome + ". [Valor: R$ " + this.valor + "]");
    }   
    
     @Override
    public double getValor() {
        return this.valor;
    }
}
