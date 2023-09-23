/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.factory;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class LCD extends Televisor {

    public LCD(int inches) {
        super(inches);
    }

    @Override
    public String getDescription() {
        return "LCD Televisor";
    }        
}
