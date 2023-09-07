/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scientificcalculator;

import java.text.DecimalFormat;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Controller {
    private final CustomDoubleEvaluator solver;
    private final DecimalFormat formater;
    
    public Controller() {
        solver = new CustomDoubleEvaluator();
        formater = new DecimalFormat("#.########");
    }
    
    public String ToSolve(String expression) {
        try {
            return formater.format(solver.evaluate(expression));
        } catch (IllegalArgumentException exception) {
            return "Syntax Error";
        }
    }
}
