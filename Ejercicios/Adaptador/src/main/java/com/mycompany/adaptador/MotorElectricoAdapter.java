/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.adaptador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MotorElectricoAdapter extends Motor {
    private MotorElectrico motor;

    public MotorElectricoAdapter() {
        this.motor = new MotorElectrico();
        System.out.println("Creando adaptador, motor eléctrico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Adpatador, acelerar motor eléctrico.");
        this.motor.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Adaptador, apagar motor eléctrico.");
        this.motor.detener();
        this.motor.desconectar();
    }

    @Override
    public void encender() {
        System.out.println("Adaptador, encender motor eléctrico.");
        this.motor.conectar();
        this.motor.activar();
    }
    
    
    
}
