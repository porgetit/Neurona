/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Cuenta {
    private List<ProductoFinanciero> productos = new ArrayList<>();

    public void agregarProducto(ProductoFinanciero producto) {
        productos.add(producto);
    }

    public float calcularSaldoTotal() {
        float saldoTotal = 0;
        for (ProductoFinanciero producto : productos) {
            saldoTotal += producto.calcularInteresMensual();
        }
        return saldoTotal;
    }

    public void realizarOperacion(ProductoFinanciero producto, float monto) {
    if (producto instanceof CuentaCorriente cuentaCorriente) {
        cuentaCorriente.realizarDeposito(monto);
    } else if (producto instanceof CuentaAhorro) {
        // Lógica para realizar operación en Cuenta de Ahorro
    } else if (producto instanceof CertificadoDepositoTermino) {
        // Lógica para realizar operación en CDT
    } else {
        System.out.println("Tipo de producto no admitido.");
    }
}

}

