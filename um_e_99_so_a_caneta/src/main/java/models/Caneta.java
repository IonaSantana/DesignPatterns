/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author puc
 */
public class Caneta implements Brinde{

    @Override
    public double getPreco() {
        return 2.0;
    }

    @Override
    public String customizar() {
        return "Caneta\n";
    }
    
}
