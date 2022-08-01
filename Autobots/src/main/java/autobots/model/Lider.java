/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobots.model;

/**
 *
 * @author ionasantana
 */
public class Lider extends Autobot{
    
    public Lider() {
        super();
    }

    public Lider(String nome, int ataque, int vida, int defesa, String especialidade) {
        super(nome, ataque, vida, defesa, especialidade);
    }
    
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int getAtaque() {
        return this.ataque;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    @Override
    public int getVida() {
        return this.vida;
    }
    
    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getDefesa() {
        return this.defesa;
    }
    
    @Override
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    @Override
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    @Override
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    @Override
    public void printCardAutobot(String nome) {
        System.out.println(nome);
        System.out.println(this.getNome());
        System.out.println("LIDER AUTOBOT");
        System.out.println("Ataque: " + this.getAtaque());
        System.out.println("Vida: " + this.getVida());
        System.out.println("Defesa: " + this.getDefesa());
        System.out.println("Especialidade: " + this.getEspecialidade() + ".");
        System.out.println("");
    }
}
