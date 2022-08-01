/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author ionasantana
 */
public class ImportadoCarroBuilder extends CarroBuilder{

    @Override
    public void buildTipo() {
        hotwheels.setTipo("Importado");
    }

    @Override
    public void buildTransmissao() {
        hotwheels.setTransmissao("Automatica");
    }

    @Override
    public void buildBanco() {
        hotwheels.setBancos("Couro");
    }

    @Override
    public void buildAcessorio() {
        hotwheels.setAcessorio("Insulfilm e Friso Lateral");
    }

    @Override
    public void buildSensor() {
        hotwheels.setSensor("Estacionamento");
    }
    
}
