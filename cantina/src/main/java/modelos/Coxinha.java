/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import fabricas.SalgadoIngredientesFactory;

/**
 *
 * @author ionasantana
 */
public class Coxinha extends Salgado{

    private SalgadoIngredientesFactory ingredientes;
    public Coxinha() {
        super();
    }

    public Coxinha(String massa, String molho, String recheio) {
        super(massa, molho, recheio);
        
    }
    
    
}
