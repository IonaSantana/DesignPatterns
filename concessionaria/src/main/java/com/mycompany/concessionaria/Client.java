/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.concessionaria;

import builder.CarroBuilder;
import builder.EsportivoCarroBuilder;
import builder.ImportadoCarroBuilder;
import builder.PopularCarroBuilder;
import director.MontadoraDirector;

/**
 *
 * @author ionasantana
 */
public class Client {

    public static void monta(String name, CarroBuilder builder)
    {
        System.out.println("Pedindo carro: " + name);
        MontadoraDirector director = new MontadoraDirector(builder);
        director.constroiCarro();
        System.out.println(director.getCarro().toString());
        System.out.println("------------------");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        monta("Palio", new PopularCarroBuilder());
        monta("Civic", new ImportadoCarroBuilder());
        monta("Jaguar", new EsportivoCarroBuilder());
        
    }
    
}
