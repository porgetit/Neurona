/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto_3;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Reto_3 {

    public static void main(String[] args) {
        Map<PerishableProduct, Integer> perishableProducts = new HashMap<>();
        Map<NonPerishableProduct, Integer> nonPerishableProducts = new HashMap<>();
        
        PerishableProduct product1 = new PerishableProduct(15, "Leche", 5.50);
        perishableProducts.put(product1, 2);
        PerishableProduct product2 = new PerishableProduct(5, "Huevos", 7.75);
        perishableProducts.put(product2, 1);
        PerishableProduct product3 = new PerishableProduct(25, "Arroz", 2.50);
        perishableProducts.put(product3, 5);
        PerishableProduct product4 = new PerishableProduct(10, "Pan Dulce", 1.50);
        perishableProducts.put(product4, 1);
        PerishableProduct product5 = new PerishableProduct(175, "Panela", 0.60);
        perishableProducts.put(product5, 2);
        
        NonPerishableProduct product6 = new NonPerishableProduct("Tipo 1", "Carro a control remoto", 15);
        nonPerishableProducts.put(product6, 1);
        NonPerishableProduct product7 = new NonPerishableProduct("Tipo 2", "Sabana de cama matrimonial", 35);
        nonPerishableProducts.put(product7, 2);
        NonPerishableProduct product8 = new NonPerishableProduct("Tipo 3", "Carpa cubre moto", 75.85);
        nonPerishableProducts.put(product8, 2);
        NonPerishableProduct product9 = new NonPerishableProduct("Tipo 1", "Televisor LG 50\"", 1500);
        nonPerishableProducts.put(product9, 1);
        NonPerishableProduct product10 = new NonPerishableProduct("Tipo 4", "Juego cubiertos plata negra", 250);
        nonPerishableProducts.put(product10, 1);
        
        double totalPerishableTicket = 0;
        for (Map.Entry<PerishableProduct, Integer> entry : perishableProducts.entrySet()) {
            System.out.println(entry.getKey().toString() + " x" + entry.getValue() + " : " + entry.getKey().calculate(entry.getValue()));
            totalPerishableTicket += entry.getKey().calculate(entry.getValue());
        }
        
        double totalNonPerishableTicket = 0;
        for (Map.Entry<NonPerishableProduct, Integer> entry : nonPerishableProducts.entrySet()) {
            System.out.println(entry.getKey().toString() + " x" + entry.getValue() + " : " + entry.getKey().calculate(entry.getValue()));
            totalNonPerishableTicket += entry.getKey().calculate(entry.getValue());
        }
        
        System.out.println("Subtotal: $ " + (totalPerishableTicket + totalNonPerishableTicket));
    }
}
