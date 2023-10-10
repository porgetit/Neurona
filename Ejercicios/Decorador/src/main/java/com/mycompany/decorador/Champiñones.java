/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.decorador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Champiñones extends PizzaDecorator{
    private Ingredientes ingrediente;

    public Champiñones(Ingredientes ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }

    @Override
    public String getDescripcion() {
        return this.ingrediente.getDescripcion() + " + Champiñones";
    }

    @Override
    public int getPrecio() {
        return this.ingrediente.getPrecio() + 1000;
    }
}
