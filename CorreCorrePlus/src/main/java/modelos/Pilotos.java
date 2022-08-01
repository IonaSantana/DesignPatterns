/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ionasantana
 */
public class Pilotos {

    private String nome;
    private Pista pistaCorrida;
    
    public Pilotos(String nome, Pista pistaCorrida) {
        this.nome = nome;
        this.pistaCorrida = pistaCorrida;
        if (this.pistaCorrida != null)
            if(this.pistaCorrida.setQuantidadeCorredores() == false)
                System.out.println("Pista cheia");    
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pista getPistaCorrida() {
        return pistaCorrida;
    }

    public void setPistaCorrida(Pista pistaCorrida) {
        this.pistaCorrida = pistaCorrida;
    }
    
    public String FichaPiloto(){
        return "Dados do Corredor\nNome: " + this.nome + "\nNome da Pista: " + this.pistaCorrida.getNome() + "\nID Pista: " + this.pistaCorrida.hashCode() + "\nQuantidade de Corredores: " + Pista.getQuantidadeCorredores();
    }
}
