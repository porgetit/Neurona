/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CuentaCorriente {
    private float saldo;

    public CuentaCorriente(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return this.saldo;
    }

    public void realizarDeposito(float monto) {
        this.saldo += monto;
    }
    
    public void realizarRetiro(float monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
        } else {
            throw new RuntimeException("Saldo insuficiente");
        }
    }
}

