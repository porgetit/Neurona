/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.clasificadorusuarios;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Contexto {
    public String mostrarVista(String tipoUsuario) {
        IClasificador claseUsuario = null;
        
        switch (tipoUsuario) {
            case "Normal" -> {
                claseUsuario = new Normal();
            }
            case "Premium" -> {
                claseUsuario = new Premium();
            }
            default -> {
                throw new RuntimeException("Clase de usuario aún no implementada");
            }
        }
        
        return claseUsuario.mostrarVista();
    }
}
