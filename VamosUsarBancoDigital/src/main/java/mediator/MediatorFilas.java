/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

import models.Caixa;
import models.Cheque;
import models.Deposito;
import models.Poupanca;
import models.Saque;

/**
 *
 * @author ionasantana
 */
public class MediatorFilas implements MediatorInterface {
     
    public Cheque cheque;
    public Deposito deposito;
    public Poupanca poupanca;
    public Saque saque;
    
    @Override
    public void criaFilaPoupanca(Caixa p) {
        this.poupanca = (Poupanca) p;      
    }

    @Override
    public void criaFilaSaque(Caixa p) {
        this.saque = (Saque) p;
    }

    @Override
    public void criaFilaCheque(Caixa p) {
        this.cheque = (Cheque) p;
    }

    @Override
    public void criaFilaDeposito(Caixa p) {
        this.deposito = (Deposito) p; 
    }

    @Override
    public void controlaFila(int fila, int senha) {
        switch (fila) {
            case 1:
                this.cheque.redirecionar(senha);
                break;
            case 2:
                this.deposito.redirecionar(senha);
                break;
            case 3:
                this.poupanca.redirecionar(senha);
                break;
            case 4:
                this.saque.redirecionar(senha);
                break;
            default:
                System.out.println("Que fila é essa?");
                break;
        }
    }
    
}
