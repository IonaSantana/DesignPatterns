/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediator;

import models.Caixa;

/**
 *
 * @author ionasantana
 */
public interface MediatorInterface {
    public abstract void criaFilaPoupanca(Caixa p);
    public abstract void criaFilaSaque(Caixa p);
    public abstract void criaFilaCheque(Caixa p);
    public abstract void criaFilaDeposito(Caixa p);
    public abstract void controlaFila (int fila, int senha);
      
}
