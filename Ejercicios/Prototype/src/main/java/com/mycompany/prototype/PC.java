/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.prototype;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public abstract class PC implements Cloneable{
    private int pulgadas;
    private String procesador;
    private double precio;
    private int memoria;

    public PC(int pulgadas, String procesador, double precio, int memoria) {
        this.pulgadas = pulgadas;
        this.procesador = procesador;
        this.precio = precio;
        this.memoria = memoria;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getProcesador() {
        return procesador;
    }

    public double getPrecio() {
        return precio;
    }

    public int getMemoria() {
        return memoria;
    }
    
    
}
