/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.adaptador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MotorEconomico extends Motor {

    public MotorEconomico() {
        System.out.println("Creando motor económico...");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor económico, acelerar.");
    }

    @Override
    public void apagar() {
        System.out.println("Motor económico, apagar.");
    }

    @Override
    public void encender() {
        System.out.println("Motor económico, encender.");
    }
    
    
}
