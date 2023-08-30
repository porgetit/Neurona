/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caculadora;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author athirtro
 */
public class Caculadora {

    public static void main(String[] args) {
        Operador operador = new Operador();
        List<String> expresiones = new ArrayList<>();
        
        expresiones.add("2+3");
        expresiones.add("2*3");
        expresiones.add("2-3");
        expresiones.add("2/3");
        expresiones.add("1+(2*(3-(4/5)))");
        expresiones.add("2^2");
        
        for (String expresion : expresiones) {
            operador.operar(expresion);
            System.out.println(expresion + "=" + operador.getResult());
        }
    }
}
