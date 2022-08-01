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
public abstract class BrindeDecorator implements Brinde{

    protected Brinde presente;
	
    public BrindeDecorator(Brinde presente) {
            this.presente = presente;
    }
    
}
