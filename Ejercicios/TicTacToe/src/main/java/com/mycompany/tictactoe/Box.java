/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Box {
    private boolean state;
    private boolean value;
    
    public Box() {
        this.state = false; // Occupied?
        this.value = false; // true := player 1 && false := player 2
    }
    
    public boolean getValue() {
        return this.value;
    }
    
    public boolean isFree() {
        return !this.state;
    }
    
    public void setValue(boolean newValue) {
        if (isFree()) {
            this.state = true;
            this.value = newValue;
        }
        
        throw new RuntimeException("This box is occupied");
    }
}
