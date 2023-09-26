/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladorbancario;

import java.util.List;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class SimuladorBancario {
    public static void main(String[] args) {
        SimuladorBancario simulador = new SimuladorBancario();

        // Crear un cliente
        Cliente cliente = new Cliente("John Doe", "123456789");

        // Crear una cuenta
        Cuenta cuenta = new Cuenta();

        // Agregar productos financieros a la cuenta
        ProductoFinanciero cuentaAhorro = new CuentaAhorro(1000);
        ProductoFinanciero cuentaCorriente = new CuentaCorriente(500);
        ProductoFinanciero cdt = new CertificadoDepositoTermino(2000, 5);

        cuenta.agregarProducto(cuentaAhorro);
        cuenta.agregarProducto(cuentaCorriente);
        cuenta.agregarProducto(cdt);

        // Realizar simulación avanzando mes a mes
        for (int mes = 1; mes <= 12; mes++) {
            simulador.avanzarMes(cliente);
            float saldoTotal = cuenta.calcularSaldoTotal();
            System.out.println("Mes " + mes + ": Saldo total = $" + saldoTotal);
        }
    }

    public Cliente crearCliente(String nombre, String cedula) {
        return new Cliente(nombre, cedula);
    }

    public Cuenta crearCuenta() {
        return new Cuenta();
    }

    public void avanzarMes(Cliente cliente) {
        
    }
}

