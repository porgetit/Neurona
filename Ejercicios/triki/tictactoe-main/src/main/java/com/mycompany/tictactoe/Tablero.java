/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author athirtro
 */
public class Tablero{
    private final String[] casillas = new String[9];
    private final Map<String, Integer> tabla_coordenadas = new HashMap<>();

    public  Tablero() {
        for (int i = 0; i < 9; i++) {
            casillas[i] = "0";
        }
        
        tabla_coordenadas.put("11",0);
        tabla_coordenadas.put("12",1);
        tabla_coordenadas.put("13",2);
        tabla_coordenadas.put("21",3);
        tabla_coordenadas.put("22",4);
        tabla_coordenadas.put("23",5);
        tabla_coordenadas.put("31",6);
        tabla_coordenadas.put("32",7);
        tabla_coordenadas.put("33",8);
    }
    
    public String estadoTablero() {
        String tablero = "";
        
        for (String i : casillas) {
            tablero += i;
        }
        
        return tablero;
    }
    
    private boolean existeCoordenada(String coordenada) {
        return tabla_coordenadas.get(coordenada) != null;
    }
    
    private String estadoCasilla(String coordenada) {
        return !existeCoordenada(coordenada) ? "Coordenada desconocida" : ""+casillas[tabla_coordenadas.get(coordenada)];
    }
    
    public boolean setCasilla(String coordenada, int value) {
       if (!existeCoordenada(coordenada)) {
           return false;
       }
       
       if (!esCasillaLibre(coordenada)) {
           return false;
       }
       
       casillas[tabla_coordenadas.get(coordenada)] = ""+value;
       return true;
    }
    
    public boolean hayCasillasVacias() {
        return estadoTablero().contains("0");
    }
    
    public boolean esCasillaLibre(String coordenada) {
        return estadoCasilla(coordenada).equals("0");
    }
    
    public List<String> casillasLibres() {
        List<String> libres = new ArrayList<>();
        Set<String> keys = tabla_coordenadas.keySet();
        
        for (String casilla : keys) {
            if (esCasillaLibre(casilla)) {
                libres.add(casilla);
            }
        }
        
        return libres;
    }
    
}
