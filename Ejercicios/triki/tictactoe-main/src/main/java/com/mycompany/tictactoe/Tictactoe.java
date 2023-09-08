/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tictactoe;

import java.util.Scanner;

/**
 *
 * @author athirtro
 */
public class Tictactoe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Juego juego = new Juego("Juan", "Pedro");
        int turno = 1;
        
        while (!juego.terminoJuego()) {
            System.out.println("Turno del jugador " + turno);
            System.out.print("Casillas libres: ");
            System.out.println(juego.casillasLibres());
            System.out.print("Escoja una casilla: ");
            int casilla = scanner.nextInt();
            
            if (juego.mover(""+casilla, turno)) {
                System.out.println("Jugador " + turno + " mueve en " + casilla);
                turno = turno == 1 ? 2 : 1;
            } else {
                System.out.println("Escoja una casilla adecuada");
            }
        }
        
        System.out.println("Ganador: " + juego.ganadorJuego());
    }
}
