/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CuentaAhorros {
    private double saldo;

    public CuentaAhorros(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto) {
        this.saldo += monto;
    }
    
    public void retirar(double monto) {
        if (this.saldo < monto) {
            throw new RuntimeException("Saldo insuficiente");
        }
        
        this.saldo -= monto;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void avanzarMes() {
        sumarInteres();
    }
    
    private void sumarInteres() {
        this.saldo += this.getInteres();
    }
    
    private double getInteres() {
        return saldo * 0.06;
    }
}
