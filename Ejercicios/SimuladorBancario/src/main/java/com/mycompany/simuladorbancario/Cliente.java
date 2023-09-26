/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.simuladorbancario;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Cliente {
    private String nombre;
    private String cedula;
    private Cuenta cuenta;

    public Cliente(String nombre, String cedula, float montoInicialCuentaAhorro, float montoInicialCuentaCorriente, float montoCDT, float tasaInteresCDT) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuenta = new Cuenta(montoInicialCuentaAhorro, montoInicialCuentaCorriente, montoCDT, tasaInteresCDT);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public Cuenta getCuenta() {
        return this.cuenta;
    }
}

