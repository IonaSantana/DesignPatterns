/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cestacafemanha.Fabricas;

import com.mycompany.cestacafemanha.Fabricas.produtos.Coxinha;
import com.mycompany.cestacafemanha.Fabricas.produtos.Esfirra;
import com.mycompany.cestacafemanha.Fabricas.produtos.Quibe;

/**
 *
 * @author ionasantana
 */
public abstract class FabricaSalgados implements Produto{

    private String tipo;
        
     public enum tipos{
        Quibe, Esfirra, Coxinha
    }
    
    public static FabricaSalgados getSalgados(String salgado) {
        tipos escolhe = tipos.valueOf(salgado);
        switch (escolhe) {
            case Quibe:               
                return new Quibe();
            case Esfirra:
                return new Esfirra();
            case Coxinha:
                return new Coxinha();
        }
        return null;
    }
    
    @Override
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
         this.tipo = tipo;
    }
    
    @Override
    public String listar() {
        return "   |---Produtos = " + this.tipo;
    }
    
}
