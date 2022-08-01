/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.um_e_99_so_a_caneta.decorators;

import models.Brinde;

/**
 *
 * @author puc
 */
public class Adesivo extends BrindeDecorator{

    public Adesivo(Brinde presente){
        super(presente);
    }
    @Override
    public double getPreco() {
        return presente.getPreco() * 1.05;
    }

    @Override
    public String customizar() {
        return presente.customizar() + "  |-> Adesivo transformers\n";
    }
    
}
