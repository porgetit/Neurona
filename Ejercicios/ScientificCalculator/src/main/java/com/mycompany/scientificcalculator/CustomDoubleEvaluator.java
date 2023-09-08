/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scientificcalculator;


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
        parameters.add(new Function("csch", 1));
        parameters.add(new Function("sech", 1));
        parameters.add(new Function("coth", 1));
        parameters.add(new Function("asinh", 1));
        parameters.add(new Function("acosh", 1));
        parameters.add(new Function("atanh", 1));
        parameters.add(new Function("acsch", 1));
        parameters.add(new Function("asech", 1));
        parameters.add(new Function("acoth", 1));
        parameters.add(new Operator("!", 1, Operator.Associativity.LEFT, 3));
        parameters.add(new Operator("exp", 2, Operator.Associativity.LEFT, 2));
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
            case "csch" -> {
                double argument = arguments.next();
                if (Math.sinh(argument) == 0) {
                    throw new IllegalArgumentException("La funcion csch no esta definida para este numero");
                }
                return 1 / Math.sinh(argument);
            }
            case "sech" -> {
                double argument = arguments.next();
                if (Math.cosh(argument) == 0) {
                    throw new IllegalArgumentException("La funcion sech no esta definida para ese numero");
                }
                return 1 / Math.cosh(argument);
            }
            case "coth" -> {
                double argument = arguments.next();
                if (Math.tanh(argument) == 0) {
                    throw new IllegalArgumentException("La funcion tanh no esta definida para ese numero");
                }
                return 1 / Math.tanh(argument);
            }
            case "asinh" -> {
                double argument = arguments.next();
                return Math.log(argument + Math.sqrt((argument*argument) + 1));
            }
            case "acosh" -> {
                double argument = arguments.next();
                if (argument < 1) {
                    throw new IllegalArgumentException("La funcion acosh no esta definida para ese numero");
                }
                return Math.log(argument + Math.sqrt((argument * argument) - 1));
            }
            case "atanh" -> {
                double argument = arguments.next();
                if (argument <= -1 || argument >= 1) {
                    throw new IllegalArgumentException("La funcion atanh no esta definida para ese numero");
                }
                return 0.5*(Math.log((1 + argument)/(1 - argument)));
            }
            case "acsch" -> {
                double argument = arguments.next();
                if (argument == 0) {
                    throw new IllegalArgumentException("La funcion acsch no esta definida para el cero");
                }
                return Math.log((1/argument)+(Math.sqrt((1/(argument * argument))+1)));
            }
            case "asech" -> {
                double argument = arguments.next();
                if (argument <= 0 || argument > 1) {
                    throw new IllegalArgumentException("La funcion asech no esta definida para ese numero");
                }
                return Math.log((1 + Math.sqrt(1 - argument * argument))/argument);
            }
            case "acoth" -> {
                double argument = arguments.next();
                if (argument >= -1 && argument <= 1) {
                    throw new IllegalArgumentException("La funcion acoth no esta definida para ese numero");
                }
                return 0.5*Math.log((argument + 1)/(argument - 1));
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
        } else if ("exp".equals(operator.getSymbol())) {
            double leftOperand = operands.next();
            double rightOperand = operands.next();
            
            if (rightOperand < 0) {
                throw new IllegalArgumentException("La cantidad de ceros no puede ser negativa");
            }
            
            int multiplier = (int) Math.pow(10, rightOperand);
            return leftOperand * multiplier;
        }
        return super.evaluate(operator, operands, evaluationContext);
    }
}
