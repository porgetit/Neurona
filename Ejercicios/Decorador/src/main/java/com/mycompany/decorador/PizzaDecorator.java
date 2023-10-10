/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.decorador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public abstract class PizzaDecorator implements Ingredientes{
    private Ingredientes ingredientes;

    public PizzaDecorator(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }
}
