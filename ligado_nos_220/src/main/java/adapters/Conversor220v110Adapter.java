/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

import Interface.Voltagem110;
import Interface.Voltagem220;

/**
 *
 * @author ionasantana
 */
public class Conversor220v110Adapter extends Voltagem110{
    
    private Voltagem220 energia220;
    
    public Conversor220v110Adapter(Voltagem220 energia220){
        super();
        System.out.println("Adaptando 220v para 110v"); 
        this.energia220 = energia220;
    }
   
}
