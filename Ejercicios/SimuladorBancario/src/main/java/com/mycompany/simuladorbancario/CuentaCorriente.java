/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CuentaCorriente implements ProductoFinanciero {
    private float saldo;

    public CuentaCorriente(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public float calcularInteresMensual() {
        return 0; // No genera intereses
    }

    public void realizarDeposito(float monto) {
        saldo += monto;
    }

    public void realizarRetiro(float monto) {
        saldo -= monto;
    }
}

