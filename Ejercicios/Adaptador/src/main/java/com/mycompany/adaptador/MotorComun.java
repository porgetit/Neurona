/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.adaptador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MotorComun extends Motor{

    public MotorComun() {
        System.out.println("Creadon un motor común...");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor común, acelerar.");
    }

    @Override
    public void apagar() {
        System.out.println("Motor común, apagar.");
    }

    @Override
    public void encender() {
        System.out.println("Motor común, encender.");
    }
    
    
}
