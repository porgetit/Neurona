/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tictactoe;

import java.util.regex.Pattern;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Game {
    private final Board board;
    private int winner;
    
    public Game() {
        this.board = new Board();
        this.winner = 0;
    }
    
    public String getState() {
        return board.getState();
    }
    
    public int getWinner() {
        return winner;
    }
    
    public void setBox(String location, int id) {
        boolean value = id == 1;
        board.setBox(location, value); // Manejar esta excepcion en la vista para imprimir directamente el mensaje
        doesGameEnd();
    }
    
    public boolean doesGameEnd() {
        if (Pattern.compile("^(111[012]{6}|[012]{3}111[012]{3}|[012]{6}111|(1[012]{2}){3}|([012]1[012]){3}|([012]{2}1){3}|1[012]{2}[012]1[012][012]{2}1|[012]{2}1[012]1[012]1[012]{2})$").matcher(this.getState()).matches()) {
            this.winner = 1;
            return true;
        } else if (Pattern.compile("^(222[012]{6}|[012]{3}222[012]{3}|[012]{6}222|(2[012]{2}){3}|([012]2[012]){3}|([012]{2}2){3}|2[012]{2}[012]2[012][012]{2}2|[012]{2}2[012]2[012]2[012]{2})$").matcher(this.getState()).matches()) {
            this.winner = 2;
            return true;
        } else if (board.freeBoxes().isEmpty()) {
            this.winner = 0;
            return true;
        }
        
        return false;     
    }
}
