/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lavadora;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public abstract class lavadoras {
    public String marca;

    public lavadoras(String marca) {
        this.marca = marca;
    }
    
    public abstract String getDescription();
}
