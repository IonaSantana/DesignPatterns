/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author puc
 */
public class Caneca implements Brinde{

    @Override
    public double getPreco() {
        return 10.0;
    }

    @Override
    public String customizar() {
        return "Canequinha\n";
    }
    
}
