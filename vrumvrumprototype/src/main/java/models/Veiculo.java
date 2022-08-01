/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author ionasantana
 */
public class Veiculo {
    public ArrayList<Pneu> pneus;   
    
    Veiculo()
    {
        pneus = new ArrayList();
    }
    
    @Override public String toString()
    {
        String resp = "Pneus:\n";
        for (int i = 0; i < pneus.size(); i++) {
            resp = resp + "Pneu " + (i+1) + "\nTipo: " + pneus.get(i).getTipo() + "\nAro: " + pneus.get(i).getAro() + "\n";
        }
        return resp;
    }
}
