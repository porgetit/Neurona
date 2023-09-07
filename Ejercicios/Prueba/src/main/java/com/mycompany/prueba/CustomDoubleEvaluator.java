/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;


import com.fathzer.soft.javaluator.Function;
import com.fathzer.soft.javaluator.Parameters;
import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Operator;
import java.util.Iterator;

public class CustomDoubleEvaluator extends DoubleEvaluator {
    public CustomDoubleEvaluator() {
        super(getCustomParameters());
    }

    private static Parameters getCustomParameters() {
        Parameters parameters = DoubleEvaluator.getDefaultParameters();
        // Agregar la función de raíz cuadrada personalizada
        parameters.add(new Function("sqrt", 1));
        parameters.add(new Function("csc", 1));
        parameters.add(new Function("sec", 1));
        parameters.add(new Function("cot", 1));
        parameters.add(new Function("acsc", 1));
        parameters.add(new Function("asec", 1));
        parameters.add(new Function("acot", 1));
        parameters.add(new Operator("!", 1, Operator.Associativity.LEFT, 3));
        return parameters;
    }

    @Override
    protected Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
        String functionName = function.getName();
        if (null != functionName) switch (functionName) {
            case "sqrt" -> {
                double argument = arguments.next();
                if (argument < 0) {
                    throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
                }
                return Math.sqrt(argument);
            }
            case "csc" -> {
                double argument = arguments.next();
                if (Math.sin(argument) == 0) {
                    throw new IllegalArgumentException("La función csc no está definida para este valor");
                }
                return 1 / Math.sin(argument);
            }
            case "sec" -> {
                double argument = arguments.next();
                if (Math.cos(argument) == 0) {
                    throw new IllegalArgumentException("La función sec no está definida para este valor");
                }
                return 1 / Math.cos(argument);
            }
            case "cot" -> {
                double argument = arguments.next();
                if (Math.tan(argument) == 0) {
                    throw new IllegalArgumentException("La función cot no está definida para este valor");
                }
                return 1 / Math.tan(argument);
            }
            case "acsc" -> {
                double argument = arguments.next();
                if (Math.asin(argument) == 0) {
                    throw new IllegalArgumentException("La funcion acsc no esta definida para este valor");
                }
                return 1 / Math.asin(argument);
            }
            case "asec" -> {
                double argument = arguments.next();
                if (Math.acos(argument) == 0) {
                    throw new IllegalArgumentException("La función asec no está definida para este valor");
                }
                return 1 / Math.acos(argument);
            }
            case "acot" -> {
                double argument = arguments.next();
                if (Math.atan(argument) == 0) {
                    throw new IllegalArgumentException("La función acot no está definida para este valor");
                }
                return 1 / Math.atan(argument);
            }
            default -> {
            }
        }
        
        
        return super.evaluate(function, arguments, evaluationContext);
    }
    
    @Override
    protected Double evaluate(Operator operator, Iterator<Double> operands, Object evaluationContext) {
        if ("!".equals(operator.getSymbol())) {
            double operand = operands.next();
            if (operand < 0) {
                throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");
            }
            int n = (int) operand;
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return (double) result;
        }
        return super.evaluate(operator, operands, evaluationContext);
    }
}
