/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ionasantana
 */
public class Salgado {
    
    protected String massa;
    protected String molho;
    protected String recheio;
    
    Salgado(){
        massa = "";
        molho = "";
        recheio = "";
    }
    
    Salgado(String massa, String molho, String recheio){
        this.massa = massa;
        this.molho = molho;
        this.recheio = recheio;
    }
    
     public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }
    
    
}
