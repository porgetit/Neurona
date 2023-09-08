/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

/**
 *
 * @author athirtro
 */
public class Jugador {
    private int id_jugador;
    private String nombre;
    private int puntuacion;
    
    public Jugador() {
        
    }

    public Jugador(int id_jugador, String nombre) {
        this.id_jugador = id_jugador;
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID: " + id_jugador + ", nombre: " + nombre + ", puntuacion: " + puntuacion + '}';
    }
   
    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
