/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.adaptador;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MotorElectrico {
    private boolean conectado;

    public MotorElectrico() {
        System.out.println("Creando motor eléctrico...");
        this.conectado = false;
    }
    
    public void conectar() {
        System.out.println("Motor eléctrico, conectar.");
        this.conectado = true;
    }
    
    public void activar() {
        if (conectado) {
            System.out.println("Motor eléctrico, activando");
            return;
        }
        
        System.out.println("Motor eléctrico, motor no conectado.");
    }
    
    public void moverMasRapido() {
        if (conectado) {
            System.out.println("Motor eléctrico, mover más rápido.");
            return;
        }
        
        System.out.println("Motor eléctrico, motor no conectado.");
    }
    
    public void detener() {
        if (conectado) {
            System.out.println("Motor eléctrico, detener.");
            return;
        }
        
        System.out.println("Motor eléctrico, motor no conectado.");
    }
    
    public void desconectar() {
        System.out.println("Motor eléctrico, desconectar.");
        this.conectado = false;
    }
}
