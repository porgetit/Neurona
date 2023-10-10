/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.decorador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Pizza implements Ingredientes{

    @Override
    public String getDescripcion() {
        return "Queso + Mortadela";
    }

    @Override
    public int getPrecio() {
        return 3000;
    }
}
