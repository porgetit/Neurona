/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Pattern;

/**
 *
 * @author athirtro
 */
public class Juego {
    private final Tablero tablero = new Tablero();
    private final Jugador jugador1 = new Jugador();
    private final Jugador jugador2 = new Jugador();
    private final Map<Pattern, Integer> tabla_estados_victoria = new HashMap<>();
    private int ganador;
    
    public Juego(String nombre_jugador1, String nombre_jugador2) {
        jugador1.setId_jugador(1);
        jugador1.setNombre(nombre_jugador1);
        
        jugador2.setId_jugador(2);
        jugador2.setNombre(nombre_jugador2);
        
        tabla_estados_victoria.put(Pattern.compile("^(111[012]{6}|[012]{3}111[012]{3}|[012]{6}111|(1[012]{2}){3}|([012]1[012]){3}|([012]{2}1){3}|1[012]{2}[012]1[012][012]{2}1|[012]{2}1[012]1[012]1[012]{2})$"), 1);
        tabla_estados_victoria.put(Pattern.compile("^(222[012]{6}|[012]{3}222[012]{3}|[012]{6}222|(2[012]{2}){3}|([012]2[012]){3}|([012]{2}2){3}|2[012]{2}[012]2[012][012]{2}2|[012]{2}2[012]2[012]2[012]{2})$"), 2);
        
        ganador = 0;
    }

    public int getGanador() {
        return ganador;
    }
    
    public String estadoJuego() {
        return "{Tablero actual: " + tablero.estadoTablero() + ", Puntuacion Jugador 1: " + jugador1.getPuntuacion() + ", Puntuacion Jugador 2: " + jugador2.getPuntuacion() + "}";
    }
    
    public boolean terminoJuego() {
        Set<Pattern> keys = tabla_estados_victoria.keySet();
        
        for (Pattern pattern : keys) {
            if (pattern.matcher(tablero.estadoTablero()).matches()) {
                return true;
            }
        }
        
        return !tablero.hayCasillasVacias();
    }
    
    public String ganadorJuego() {
        if (terminoJuego()) {
            Set<Pattern> keys = tabla_estados_victoria.keySet();
            
            for (Pattern pattern : keys) {
                if (pattern.matcher(tablero.estadoTablero()).matches()) {
                    if (tabla_estados_victoria.get(pattern) == 1) {
                        jugador1.setPuntuacion(jugador1.getPuntuacion() +1);
                        ganador = jugador1.getId_jugador();
                        return jugador1.getNombre();
                    } else {
                        jugador2.setPuntuacion(jugador2.getPuntuacion() +1);
                        ganador = jugador2.getId_jugador();
                        return jugador2.getNombre();
                    }
                }
            }
            
            return "Empate";
        }
        
        return "El juego no ha terminado";
    }
    
    public boolean mover(String coordenada, int id) {
        return tablero.setCasilla(coordenada, id);
    }
    
    public String casillasLibres() {
        String libres = "{";
        
        for (String casilla : tablero.casillasLibres()) {
            libres += " " + casilla + " ";
        }
        
        return libres + "}";
    }
}
