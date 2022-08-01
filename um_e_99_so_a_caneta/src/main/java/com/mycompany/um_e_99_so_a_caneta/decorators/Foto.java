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
public class Foto extends BrindeDecorator{

    public Foto(Brinde presente){
        super(presente);
    }

    @Override
    public double getPreco() {
       return presente.getPreco() * 1.5;
    }

    @Override
    public String customizar() {
        return presente.customizar() + "  |-> Com foto\n";
    }
    
}
