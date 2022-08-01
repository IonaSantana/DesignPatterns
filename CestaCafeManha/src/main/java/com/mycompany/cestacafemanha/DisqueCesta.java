/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.cestacafemanha;

import com.mycompany.cestacafemanha.Fabricas.FabricaDcoes;
import com.mycompany.cestacafemanha.Fabricas.FabricaSalgados;
import com.mycompany.cestacafemanha.Fabricas.Produto;
import com.mycompany.cestacafemanha.Fabricas.composite.CestaCafeDaManha;

/**
 *
 * @author ionasantana
 */
public class DisqueCesta {


    public static void main(String[] args) {
        Produto esfirra = FabricaSalgados.getSalgados("Esfirra");
        Produto coxinha = FabricaSalgados.getSalgados("Coxinha");
        Produto quibe = FabricaSalgados.getSalgados("Quibe");
        
        Produto bolo = FabricaDcoes.getDoces("Bolo");  
        Produto sorvete = FabricaDcoes.getDoces("Sorvete");
        Produto brigadeiro = FabricaDcoes.getDoces("Brigadeiro");
        
        CestaCafeDaManha cestaSalg = new CestaCafeDaManha("Caixa 1: Salgados"); 
        cestaSalg.add(esfirra);
        cestaSalg.add(coxinha);
        cestaSalg.add(quibe);
        System.out.println(cestaSalg.listar());
        
        CestaCafeDaManha cestaDoc = new CestaCafeDaManha("Caixa 2: Doces"); 
        cestaDoc.add(bolo);
        cestaDoc.add(sorvete);
        cestaDoc.add(brigadeiro);
        System.out.println(cestaDoc.listar());
        
        CestaCafeDaManha cestaMista1 = new CestaCafeDaManha("Caixa 3: Mista"); 
        cestaMista1.add(sorvete);
        cestaMista1.add(esfirra);
        cestaMista1.add(brigadeiro);
        System.out.println(cestaMista1.listar());
        
        CestaCafeDaManha cestaMista2 = new CestaCafeDaManha("Caixa 4: Mista"); 
        cestaMista2.add(cestaDoc);
        cestaMista2.add(cestaSalg);
        cestaMista2.listar();
        System.out.println(cestaMista2.listar());
        cestaMista2.remove(cestaDoc);
        System.out.println(cestaMista2.listar());
        
        CestaCafeDaManha cestaMista3 = new CestaCafeDaManha("Caixa 5: Mista"); 
        cestaMista3.add(cestaDoc);
        cestaMista3.add(esfirra);
        cestaMista3.add(cestaSalg);
        cestaMista3.add(brigadeiro);     
        System.out.println(cestaMista3.listar());
        cestaMista3.remove(esfirra); 
        System.out.println(cestaMista3.listar());
        
        System.out.println("Get index 0 " + cestaMista3.get(0).listar());
    }
    
}
