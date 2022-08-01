/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xepa.model;

import java.util.List;

/**
 *
 * @author ionasantana
 */
public class Caixa implements Composite{
    private String nome;
    private List<Composite>comidas;
    
    public Caixa (String nome, List<Composite>comidas){
        this.nome = nome;
        this.comidas = comidas;
    }
    
    @Override
    public void print() {
        System.out.println(this.nome + "[Valor: R$ " + this.getValor() + "]");
        for (Composite comidas: comidas) {
            comidas.print();
        }
    }

    @Override
    public double getValor() {
        double soma = 0;
        for (Composite comidas: comidas) {
            soma = soma + comidas.getValor();
        }
        return soma;
    }
    
}
