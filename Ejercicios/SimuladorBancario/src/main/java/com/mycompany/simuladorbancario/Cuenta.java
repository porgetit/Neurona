/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;
/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Cuenta {
    private CuentaAhorro cuentaAhorro;
    private CuentaCorriente cuentaCorriente;
    private CDT cdt;
    
    public Cuenta(float montoAhorro, float montoCorriente, float montoCDT, float tasaInteres) {
        this.cuentaAhorro = new CuentaAhorro(montoAhorro);
        this.cuentaCorriente = new CuentaCorriente(montoCorriente);
        this.cdt = new CDT(montoCDT, tasaInteres);
    }
    
    public float getSaldo() {
        return this.cuentaAhorro.getSaldo() + this.cuentaCorriente.getSaldo();        
    }
    
    public void depositarCuentaAhorro(float monto) {
        this.cuentaAhorro.realizarDeposito(monto);
    }
    
    public void depositarCuentaCorriente(float monto) {
        this.cuentaCorriente.realizarDeposito(monto);
    }
    
    public void retirarCuentaAhorros(float monto) {
        try {
            this.cuentaAhorro.realizarRetiro(monto);
        } catch (RuntimeException e) {
            System.out.println(""+e);
        }
    }
    
    public void retirarCuentaCorriente(float monto) {
        try {
            this.cuentaCorriente.realizarRetiro(monto);
        } catch (RuntimeException e) {
            System.out.println(""+e);
        }
    }
}

