/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tictactoe;

import java.awt.EventQueue;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class TicTacToe {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true); // MainMenu
            }
        });
    }
}
