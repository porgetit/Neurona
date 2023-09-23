/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.factory;

/**
 *
 * @author Kevin Esguerra Cardona
 * 
 * Class Creator
 */
public class televisorFactory implements televisorFactoryMethod{

    @Override
    public Televisor createTelevisor(int inches) {
        if (inches < 20) {
            return new LCD(inches);
        } else if (inches <= 35) {
            return new LED(inches);
        } else {
            return new Plasma(inches);
        }
    }
    
}
