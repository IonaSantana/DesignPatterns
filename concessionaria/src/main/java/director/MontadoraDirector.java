/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package director;

import builder.CarroBuilder;
import model.Carro;

/**
 *
 * @author ionasantana
 */
public class MontadoraDirector {

    private CarroBuilder builder;
    
    public MontadoraDirector(CarroBuilder builder){
        this.builder = builder;
    }
    
    public void constroiCarro(){
        builder.buildTipo();
        builder.buildAcessorio();
        builder.buildBanco();
        builder.buildTransmissao();
        builder.buildSensor();
    }
    
    public Carro getCarro(){
        return builder.getCarro();
    }
}
