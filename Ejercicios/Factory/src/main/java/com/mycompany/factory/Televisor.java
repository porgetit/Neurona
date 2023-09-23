/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.factory;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public abstract class Televisor {
    public int inches;

    public Televisor(int inches) {
        this.inches = inches;
    }
    
    public abstract String getDescription();
}
