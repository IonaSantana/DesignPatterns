/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobots.model;

/**
 *
 * @author ionasantana
 */
public abstract class Autobot {

    protected String nome;
    protected int ataque;
    protected int vida;
    protected int defesa;
    protected String especialidade;

    Autobot() {
        this.nome = "";
        this.ataque = 0;
        this.vida = 0;
        this.defesa = 0;
        this.especialidade = "";
    }

    Autobot(String nome, int ataque, int vida, int defesa, String especialidade) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
        this.defesa = defesa;
        this.especialidade = especialidade;
    }
    
    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract int getAtaque();

    public abstract void setAtaque(int ataque);

    public abstract int getVida();

    public abstract void setVida(int vida);

    public abstract int getDefesa();

    public abstract void setDefesa(int defesa);

    public abstract String getEspecialidade();

    public abstract void setEspecialidade(String especialidade);
    
    public void assembleAutobot() {
        System.out.println("Invocando Autobot");
    }

    public abstract void printCardAutobot(String nome);
}
