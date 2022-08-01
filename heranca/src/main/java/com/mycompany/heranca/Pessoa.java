/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author ionasantana
 */
public class Pessoa {
     protected String nome;
     protected int idade;
     protected String sexo;
     
     
    Pessoa()
    {
        nome = "";
        idade = 0;
        sexo = "";
    } 
    
    Pessoa(String nome, int idade, String sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    } 
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     
    public String imprime(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo;
    }
     
}
