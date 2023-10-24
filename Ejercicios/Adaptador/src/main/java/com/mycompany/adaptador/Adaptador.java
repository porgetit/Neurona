/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adaptador;

/**
 *
 * @author Kevin Esguerra Cardona
 * 
 */
public class Adaptador {

    public static void main(String[] args) {
        test(new MotorEconomico());
        test(new MotorComun());
        test(new MotorElectricoAdapter());
    }
    
    public static void test(Motor motor) {
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
