/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import bridge.Recheio;

/**
 *
 * @author ionasantana
 */
public class Coxinha extends Salgado{

    public Coxinha(Recheio huum) {
        super(huum);
    }

    @Override
    public String recheiar() {
        return "Salgado produzido: coxinha." + nhamenhame.recheiar();
    }
}
