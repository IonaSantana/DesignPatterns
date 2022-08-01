/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autobots.factory;

import autobots.model.Autobot;

/**
 *
 * @author ionasantana
 */
public class SelectAutobot implements AutobotFactory{

    public SelectAutobot(){}
    @Override
    public Autobot summonAutobot(String robot) {  
        return createAutobot(robot);    
    }

    @Override
    public Autobot createAutobot(String robot) {
        Autobot aux  = null;
        robot = robot.toUpperCase();
        if(robot.equals("LIDER"))
            return aux = LiderFactory.createLiderFactory(robot);
        else if(robot.equals("MEDICO"))
            return aux = MedicoFactory.createMedicoFactory(robot);
        else if(robot.equals("AERIALBOTS"))
            return aux = AerialbotsFactory.createAerialbotsFactory(robot);
        else if(robot.equals("CARBOTS"))
            return aux = CarbotsFactory.createCarbotsFactory(robot);
        
        System.out.println("Não temos essa classe");
        return aux;
    }
    
}
