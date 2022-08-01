/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder;

import model.Carro;

/**
 *
 * @author ionasantana
 */
public abstract class CarroBuilder {
    protected Carro hotwheels;
    
    public CarroBuilder()
    {
        hotwheels = new Carro();
    }
    
    public Carro getCarro()
    {
        return hotwheels;
    }
    
    public abstract void buildTipo();
    public abstract void buildTransmissao();
    public abstract void buildBanco();
    public abstract void buildAcessorio();
    public abstract void buildSensor();
         
}
