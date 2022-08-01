/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ionasantana
 */
public class Pista {

    private String nome;
    static int QuantidadeCorredores = 0;
    private static final int n = 4;  
    private static Pista pistaSo= null;
    
    private Pista(String nome) {
        this.nome = nome;
    }
    
    public static Pista getIdPista() throws NullPointerException {
        if (n == QuantidadeCorredores)
            return null;
        
        if(pistaSo == null) 
            pistaSo = new Pista("Autodromo Internacional de Goiania");
        return pistaSo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getQuantidadeCorredores() {
        return QuantidadeCorredores;
    }

    public boolean setQuantidadeCorredores() {
        if(Pista.QuantidadeCorredores==n)
            return false;
        else
            Pista.QuantidadeCorredores = (Pista.QuantidadeCorredores + 1);
        return true;
    }   
    
}
