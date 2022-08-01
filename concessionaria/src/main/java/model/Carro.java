/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author ionasantana
 */
public class Carro 
{
    private String tipo;
    private String transmissao;
    private String bancos;
    private String acessorio;
    private String sensor;
    
    public Carro()
    {
        this. tipo = "";
        this. transmissao = "";
        this. bancos = "";
        this. acessorio = "";
        this. sensor = "";
    }
    
    public Carro(String tipo, String transmissao, String bancos, String acessorio, String sensor) 
    {
        this. tipo = tipo;
        this. transmissao = transmissao;
        this. bancos = bancos;
        this. acessorio = acessorio;
        this. sensor = sensor;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getBancos() {
        return bancos;
    }

    public void setBancos(String bancos) {
        this.bancos = bancos;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    } 
    
    @Override
    public String toString() 
    {
        return "Tipo: " + this.tipo + "\nTramissao: " + this.transmissao + "\nBancos: " + this.bancos + "\nAcessorio: " + this.acessorio + "\nSensor: " + this.sensor;
    }
}
