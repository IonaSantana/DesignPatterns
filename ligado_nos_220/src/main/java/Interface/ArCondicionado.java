/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Interface.Voltagem110;

/**
 *
 * @author ionasantana
 */
public class ArCondicionado {
    private Voltagem110 ligacao;
    
    public ArCondicionado(Voltagem110 energia){
        this.ligacao = energia;
    }
    
    void setLigacao(Voltagem110 energia){
        this.ligacao = energia;
    }
    
    Voltagem110 getLigacao(){
        return ligacao;
    }
    
    public boolean testeLigacao(){
        return ligacao.getEnergia().equals("110v");
    }
    
}
