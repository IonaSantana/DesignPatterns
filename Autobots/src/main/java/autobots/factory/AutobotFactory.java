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
public interface AutobotFactory {   
    public Autobot summonAutobot(String robot);  
    public abstract Autobot createAutobot(String robot);
}
