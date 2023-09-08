/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author athirtro
 */
public class Partida {
    List<Juego> juegos = new ArrayList<>();
    
    public Partida(int cantidad_juegos) {
        System.out.println("BIENVENIDO A TRES EN RAYA");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();
        
        for (int i = 0; i < cantidad_juegos; i++) {
            juegos.add(new Juego(nombre1, nombre2));
        }
    }
    
    public void Jugar() {
        
    }
}
