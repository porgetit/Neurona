/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasificadorusuarios;

/**
 *
 * @author Kevin Esguerra Cardona
 * Este programa busca cumplir con los objetivos del siguiente enunciado:
 * 
 * Una página web maneja dos tipos de usuarios: normal y Premium. Cada usuario ve 
 * diferentes opciones y características por lo tanto se le ha pedido que diseñe un 
 * software que muestre las diferentes vistas según el tipo de usuario y que además 
 * sea extendible en caso de que se agreguen mas usuarios.
 * 
 * Se realizará una aproximación a una solución mediante el patrón de comportamiento
 * Estrategia.
 */
public class ClasificadorUsuarios {

    public static void main(String[] args) {
        Contexto clasificador = new Contexto();
        try {
            System.out.println(clasificador.mostrarVista("Normal"));
            System.out.println(clasificador.mostrarVista("Premium"));
            System.out.println(clasificador.mostrarVista("Libre"));
        } catch (RuntimeException e) {
            System.out.println(""+e.getMessage());
        }
    }
}
