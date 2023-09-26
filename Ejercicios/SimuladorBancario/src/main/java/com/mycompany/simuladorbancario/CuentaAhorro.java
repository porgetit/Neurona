/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CuentaAhorro implements ProductoFinanciero {
    private float saldo;

    public CuentaAhorro(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public float calcularInteresMensual() {
        return saldo * 0.006f; // 0.6% de interés mensual
    }
}

