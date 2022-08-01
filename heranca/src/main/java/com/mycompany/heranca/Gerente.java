/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author ionasantana
 */
public class Gerente extends Empregado{
    
    private String nomeGerencia;
    
    
    Gerente(){
        this.nomeGerencia = "";
    }
    
    Gerente(String nome, int idade, String sexo,double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }
    
    public String getNomeGerencia() {
        return nomeGerencia;
    }

   
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    @Override
    public String imprime(){
        return super.imprime() + "\nNome gerência: " + this.nomeGerencia;
    }
}
