/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Player {
    private int punctuation;
    private final String name;
    
    public Player(String name) {
        this.punctuation = 0;
        this.name = name;
    }
    
    public String getPunctuation() {
        return ""+this.punctuation;
    }
    
    public void addOnePoint() {
        this.punctuation += 1;
    }
    
    public String getName() {
        return this.name;
    }
}
