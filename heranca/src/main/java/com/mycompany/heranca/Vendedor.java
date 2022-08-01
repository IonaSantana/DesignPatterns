/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author ionasantana
 */
public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtsVendas;
    
    
    Vendedor()
    {
        this.valorVendas = 0;
        this.qtsVendas = 0;
    }
    
    Vendedor(String nome, int idade, String sexo,double salario, String matricula, double valorVendas, int qtsVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qtsVendas = qtsVendas;
    }
    
    public double getValorVendas(){
        return this.valorVendas;
    }
    
    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }
    
    public int getQtsVendas(){
        return this.qtsVendas;
    }
    
    public void setQtsVendas(int qtsVendas){
        this.qtsVendas = qtsVendas;
    }
    
    @Override
    public String imprime(){
        return super.imprime() + "\nValor de vendas: " + this.valorVendas + "\nQuantidade de vendas: " + this.qtsVendas; 
    }
}
