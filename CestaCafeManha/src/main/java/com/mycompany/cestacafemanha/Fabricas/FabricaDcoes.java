/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cestacafemanha.Fabricas;

import com.mycompany.cestacafemanha.Fabricas.produtos.Bolo;
import com.mycompany.cestacafemanha.Fabricas.produtos.Brigadeiro;
import com.mycompany.cestacafemanha.Fabricas.produtos.Sorvete;

/**
 *
 * @author ionasantana
 */
public abstract class FabricaDcoes implements Produto{
    private String tipo;
 
    public enum tipos{
        Bolo, Brigadeiro, Sorvete
    }
    
    public static FabricaDcoes getDoces(String doce) {
        tipos escolhe = tipos.valueOf(doce);
        switch (escolhe) {
            case Bolo:
                return new Bolo();
            case Brigadeiro:
                return new Brigadeiro();
            case Sorvete:
                return new Sorvete();
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
