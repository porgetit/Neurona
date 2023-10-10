/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorador;

/**
 *
 * @author xdpor
 */
public class Decorador {

    public static void main(String[] args) {
        Ingredientes pizza = new Pizza();
        out(pizza);
        pizza = new Piña(pizza);
        out(pizza);
        pizza = new Champiñones(pizza);
        out(pizza);
        pizza = new Salsa(pizza);
        out(pizza);
        
    }
    
    private static void out(Ingredientes pizza) {
        System.out.println(pizza.getDescripcion() + "\n" + pizza.getPrecio());
    }
}
