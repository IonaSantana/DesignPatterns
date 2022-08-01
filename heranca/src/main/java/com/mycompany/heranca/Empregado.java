/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;


public class Empregado extends Pessoa {
    
    protected double salario;
    protected String matricula;
    
    public Empregado() {
        salario = 0;
        matricula = "";
    }

    public Empregado(String nome, int idade, String sexo,double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
  
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    protected double valorInss()
    {
        return (salario - salario*0.05);
    }
    
    @Override
    public String imprime()
    {
        return super.imprime() + "\nSalario:" + this.salario + "\nMatricula: " + this.matricula + "\nValorInss: " + valorInss();
    }
}
