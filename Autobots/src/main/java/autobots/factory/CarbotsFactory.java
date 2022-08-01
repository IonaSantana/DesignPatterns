/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobots.factory;

import autobots.model.Autobot;
import autobots.model.Carbots;
/**
 *
 * @author ionasantana
 */
public class CarbotsFactory implements AutobotFactory{

    public static Autobot createCarbotsFactory(String robot)
    {
        CarbotsFactory  aux = new CarbotsFactory ();
        Autobot gera = aux.summonAutobot(robot);
        return gera;
    }
    @Override
    public Autobot summonAutobot(String robot) {
        Autobot aux = createAutobot(robot);
        aux.assembleAutobot();
        return aux;
    }

    @Override
    public Autobot createAutobot(String robot) {
        return new Carbots();
    }
    
}
