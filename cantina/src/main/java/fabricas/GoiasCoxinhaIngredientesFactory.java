/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

/**
 *
 * @author ionasantana
 */
public class GoiasCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
      return "Fina";
    }

    @Override
    public String criarMolho() {
       return "Pequi";
    }

    @Override
    public String criarRecheio() {
        return "Frango";
    }
}
