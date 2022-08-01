/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author ionasantana
 */
public class PopularCarroBuilder extends CarroBuilder{
    
    @Override
    public void buildTipo() {
        hotwheels.setTipo("Popular");
    }

    @Override
    public void buildTransmissao() {
        hotwheels.setTransmissao("Manual");
    }

    @Override
    public void buildBanco() {
        hotwheels.setBancos("Tecido");
    }

    @Override
    public void buildAcessorio() {
        hotwheels.setAcessorio("");
    }

    @Override
    public void buildSensor() {
        hotwheels.setSensor("");
    }
    
}
