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
public class Esfirra extends Salgado{
    public Esfirra(Recheio huum) {
        super(huum);
    }

    @Override
    public String recheiar() {
        return "Salgado produzido: esfirra" + nhamenhame.recheiar();
    }
}
