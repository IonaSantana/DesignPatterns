/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vamosusarbancodigital;

import java.util.Random;
import mediator.MediatorFilas;
import mediator.MediatorInterface;
import models.Caixa;
import models.Cheque;
import models.Deposito;
import models.Poupanca;
import models.Saque;

/**
 *
 * @author ionasantana
 */
public class oquetemosprahoje {

    public static void main(String[] args) {
        Caixa cheque = new Cheque();
        Caixa deposito = new Deposito();
        Caixa poupanca = new Poupanca();
        Caixa saque = new Saque();
        
        MediatorInterface filaBanco = new MediatorFilas();
        
        filaBanco.criaFilaCheque(cheque);
        filaBanco.criaFilaDeposito(deposito);
        filaBanco.criaFilaPoupanca(poupanca);
        filaBanco.criaFilaSaque(saque);
        
        Random gerador = new Random();
        for (int i = 1; i < 20; i++) {            
            filaBanco.controlaFila(gerador.nextInt(4) + 1, i);
        }
        
        cheque.listaFila();
        deposito.listaFila();
        poupanca.listaFila();
        saque.listaFila();
           
    }
    
}
