/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.LinkedList;
import java.util.Queue;
import mediator.MediatorInterface;

/**
 *
 * @author ionasantana
 */
public class Deposito implements Caixa{
    
    MediatorInterface controlador;
    private Queue<Integer> fila = new LinkedList();

//    public Deposito(MediatorInterface controlador){
//        this.controlador = controlador;
//    }
    
    @Override
    public void listaFila() {
        System.out.println("Fila para depositar: ");
        System.out.println(this.fila);
    }

    @Override
    public void redirecionar(int senha) {
        System.out.println("Enfileirando na fila do depósito.");
        this.fila.add(senha);
    }

    @Override
    public void atender() {
       
        System.out.println("Deposito: ");
        if (this.fila.isEmpty()) 
        {
            System.out.println("Fila vazia");
        } else 
        {
            System.out.println("Senha atendida: " + this.fila.remove());
        }
        
    }
}
