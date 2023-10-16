/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrategia;

/**
 *
 * @author xdpor
 */
public class Estrategia {

    public static void main(String[] args) {
        Contexto calculadora = new Contexto();
        System.out.println(calculadora.operacion(3, 4, "+"));
        System.out.println(calculadora.operacion(5, 6, "*"));
    }
}
