/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CuentaCorriente{
    private double saldo;

    public CuentaCorriente(double saldoInicial) {
        this.saldo = saldoInicial;
    }    
    
    public void depositar(double monto) {
        this.saldo += monto;
    }
    
    public void retirar(double monto) {
        if (this.saldo < monto) {
            throw new RuntimeException("Fondos insuficiente");
        }
        
        this.saldo -= monto;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
