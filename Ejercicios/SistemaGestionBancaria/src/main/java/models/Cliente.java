/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Cliente {
    private final String cedula;
    private final String nombre;
    private final CuentaCorriente cuentaCorriente;
    private final CuentaAhorros cuentaAhorros;
    private final Map<String, CDT> cuentasCDT;

    public Cliente(String cedula, String nombre, double ccSaldoInicial, double caSaldoInicial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cuentaCorriente = new CuentaCorriente(ccSaldoInicial);
        this.cuentaAhorros = new CuentaAhorros(caSaldoInicial);
        this.cuentasCDT = new LinkedHashMap<>();
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public CuentaAhorros getCuentaAhorros() {
        return cuentaAhorros;
    }
    
    public CDT getCDT(String nombre) {
        if (!this.cuentasCDT.containsKey(nombre)) {
            throw new RuntimeException("CDT no encontrado");
        }
        
        return cuentasCDT.get(nombre);
    }
    
    public void abrirCDT(String nombre, double saldoInicial, int porcentajeInteres, int plazo) {
        this.cuentasCDT.put(nombre, new CDT(saldoInicial, porcentajeInteres, plazo));
    }
    
    public void cerrarCDT(String nombre) {
        if (!this.cuentasCDT.containsKey(nombre)) {
            throw new RuntimeException("CDT no encontrado");
        }
        
        this.cuentaCorriente.depositar(this.cuentasCDT.get(nombre).cerrar());
        this.cuentasCDT.remove(nombre);
    }
    
    public void avanzarMeses(int cantidadMeses) {
        for (int i = 0; i < cantidadMeses; i++) {
            this.cuentaAhorros.avanzarMes();
        
            List<String> paraBorrar = new ArrayList<>();

            cuentasCDT.entrySet().forEach(entry -> {
                double saldo = entry.getValue().avanzarMes();
                if (saldo > 0) {
                    this.cuentaCorriente.depositar(saldo);
                    paraBorrar.add(entry.getKey());
                }
            });

            paraBorrar.forEach(this::cerrarCDT); 
        }       
    }
    
    public double getSaldo() {
        return cuentaCorriente.getSaldo() + cuentaAhorros.getSaldo();
    }
    
}
