/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CertificadoDepositoTermino implements ProductoFinanciero {
    private float saldo;
    private float tasaInteres;

    public CertificadoDepositoTermino(float saldo, float tasaInteres) {
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public float calcularInteresMensual() {
        return saldo * (tasaInteres / 100); // Interés mensual basado en la tasa
    }

    public void cerrarCDT(CuentaCorriente cuentaCorriente) {
        float intereses = calcularInteresMensual(); // Calcular intereses acumulados
        cuentaCorriente.realizarDeposito(saldo + intereses);
        saldo = 0; // Saldo del CDT se vuelve 0 al cerrarlo
    }
}

