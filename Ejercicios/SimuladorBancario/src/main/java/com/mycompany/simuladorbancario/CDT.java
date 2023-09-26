/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CDT {
    private float monto;
    private float tasaInteres;
    
    public CDT(float monto, float tasaInteres) {
        this.monto = monto;
        this.tasaInteres = tasaInteres;
    }
    
    public float getMonto() {
        return this.monto;
    }
    
    public float getTasaInteres() {
        return this.tasaInteres;
    }
    
    private float getIntereses(int meses) {
        return monto * tasaInteres * meses;
    }
    
    public float cerrarCDT(int meses) {
        float saldo = monto + getIntereses(meses);
        monto = 0;
        return saldo;
    }
}

