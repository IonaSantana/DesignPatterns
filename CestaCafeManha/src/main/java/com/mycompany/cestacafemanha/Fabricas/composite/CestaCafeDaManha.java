/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cestacafemanha.Fabricas.composite;

import com.mycompany.cestacafemanha.Fabricas.Produto;
import java.util.ArrayList;

/**
 *
 * @author ionasantana
 */
public class CestaCafeDaManha implements Produto{
    private String tipo;
    private ArrayList<Produto> produtos;
    
    public CestaCafeDaManha(String tipo) {
	this.tipo = tipo;
        this.produtos = new ArrayList();
    }
    
    public void add(Produto prod){
      this.produtos.add(prod);
    }
    
    public void remove(Produto prod) {
        this.produtos.remove(prod);
    }
    
    public Produto get(int index) {
        if (index >= 0 && index < this.produtos.size())
            return this.produtos.get(index);
        return null;
    }

    @Override
    public String listar() {
        String lista = this.tipo + "\n";
        for (Produto i: produtos) {
            lista += i.listar() + "\n";
        }
        return lista;
    }

    @Override
    public String getTipo() {
        return "Cesta de café da manhã";
    }
}
