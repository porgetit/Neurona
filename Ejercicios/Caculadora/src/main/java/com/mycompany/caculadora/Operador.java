/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caculadora;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import java.text.DecimalFormat;
/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Operador{
    private final DoubleEvaluator evaluator;
    private final DecimalFormat decimalFormat;
    private double resultado;
    
    public Operador(){
        evaluator = new DoubleEvaluator();
        decimalFormat = new DecimalFormat("#.####");
    }

    public Operador(String entrada) {
        evaluator = new DoubleEvaluator();
        decimalFormat = new DecimalFormat("#.####");
    }
    
    public String operar(String entrada) {
        try {
            this.resultado = evaluator.evaluate(entrada);
            return decimalFormat.format(this.resultado);
        } catch (IllegalArgumentException exception) {
            return "Error de sintaxis";
        }
    }
}
