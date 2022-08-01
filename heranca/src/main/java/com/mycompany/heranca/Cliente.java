/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;


public class Cliente extends Pessoa {
    
    private double valorDivida;
    private int anoNascim;
    
    public Cliente() {
        this.valorDivida = 0;
        this.anoNascim = 0;
    }

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascim) {
        super(nome, idade, sexo);
        this.sexo = sexo;
        this.anoNascim = anoNascim;
    }
    
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double ValorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public int getAnoNascim() {
        return anoNascim;
    }

    public void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }
    
    @Override
    public String imprime()
    {
        return super.imprime() + "\nDivida: " + this.valorDivida + "\nAno de nascimento: " + this.anoNascim;
    }
    
}
