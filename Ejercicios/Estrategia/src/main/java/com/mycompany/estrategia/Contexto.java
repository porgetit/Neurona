/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.estrategia;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Contexto {
    public double operacion(double a, double b, String opcion) {
        ICalculadora calculadora = null;
        
        switch (opcion) {
            case "+" -> {
                calculadora = new Suma();
            }
            
            case "-" -> {
                calculadora = new Resta();
            }
            
            case "*" -> {
                calculadora = new Producto();
            }
            
            case "/" -> {
                calculadora = new Cociente();
            }
            
            default -> {
                throw new RuntimeException("Operador desconocido");
            }
        }
        
        return calculadora.operacion(a, b);
    }
}
