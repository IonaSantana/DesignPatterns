/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

/**
 *
 * @author ionasantana
 */
public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return "Grossa";
    }

    @Override
    public String criarMolho() {
        return "Pimenta";
    }

    @Override
    public String criarRecheio() {
        return "Carne Seca";
    }
    
}
