/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author ionasantana
 */
public class EsportivoCarroBuilder extends CarroBuilder{
    
    @Override
    public void buildTipo() {
        hotwheels.setTipo("Esportivo");
    }

    @Override
    public void buildTransmissao() {
        hotwheels.setTransmissao("Paddle Shift");
    }

    @Override
    public void buildBanco() {
        hotwheels.setBancos("Couro");
    }

    @Override
    public void buildAcessorio() {
        hotwheels.setAcessorio("Aerofolio");
    }

    @Override
    public void buildSensor() {
        hotwheels.setSensor("");
    }
    
}
