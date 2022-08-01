/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ionasantana
 */
public class Pneu implements Cloneable{

    String tipo;
    int aro;

    public Pneu(String tipo, int aro) {
        this.tipo = tipo;
        this.aro = aro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }
    
    public Object clone()
    {
        Object clone=null;
        try
        {
            clone=super.clone();
        } catch (CloneNotSupportedException e)
        {
            System.out.println("Pneu furado");
        }
        return clone;
    }

}
