/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.prototype;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class PC_Portatil extends PC{
    private String garantia;

    public PC_Portatil(String garantia, int pulgadas, String procesador, double precio, int memoria) {
        super(pulgadas, procesador, precio, memoria);
        this.garantia = garantia;
    }    
}
