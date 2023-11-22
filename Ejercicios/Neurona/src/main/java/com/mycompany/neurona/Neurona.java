/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.neurona;

import Model.Neuron;
import java.util.ArrayList;

/**
 *
 * @author 57312
 */
public class Neurona {

    public static void main(String[] args) {
        runTests();
    }
    
    private static void runTests() {
        System.out.println("NOT");
        test1();
        System.out.println("OR");
        test2();
        System.out.println("AND");
        test3();
        System.out.println("XOR");
        test4();
        System.out.println("Comparador de magnitud");
        test5();
    }
    
    private static void test1() { //NOT
        System.out.println("0 --> " + Not(0));
        System.out.println("1 --> " + Not(1));
    }
    
    private static void test2() { //OR
        System.out.println("0 0 --> " + Or(0, 0));
        System.out.println("0 1 --> " + Or(0, 1));
        System.out.println("1 0 --> " + Or(1, 0));
        System.out.println("1 1 --> " + Or(1, 1));
    }
    
    private static void test3() { //AND
        System.out.println("0 0 --> " + And(0, 0));
        System.out.println("0 1 --> " + And(0, 1));
        System.out.println("1 0 --> " + And(1, 0));
        System.out.println("1 1 --> " + And(1, 1));
        
    }
    
    private static void test4() { //XOR
        System.out.println("0 0 --> " + Xor(0, 0));
        System.out.println("0 1 --> " + Xor(0, 1));
        System.out.println("1 0 --> " + Xor(1, 0));
        System.out.println("1 1 --> " + Xor(1, 1));
    }
    
    private static void test5() { //ComparadorMagnitud
        ComparadorMagnitud(0, 0);
        ComparadorMagnitud(0, 1);
        ComparadorMagnitud(1, 0);
        ComparadorMagnitud(1, 1);
    }
    
    private static void ComparadorMagnitud(int a, int b) {
        int mayorA = And(a, Not(b)); // Comprueba si A > B
        int mayorB = And(Not(a), b); // Comprueba si B > A

        if (mayorA == 1) {
            System.out.println("A es mayor que B");
        } else if (mayorB == 1) {
            System.out.println("B es mayor que A");
        } else {
            System.out.println("A y B son iguales");
        }
    }

    
    private static int Not(int a) {
        Neuron compuerta = new Neuron(new ArrayList<Double>() {{
            add((double) -2);
        }}, (double) -0.5);
        
        return compuerta.activar(new ArrayList<>(){{
            add((double) a);
        }});
    }
    
    private static int Or(int a, int b) {
        Neuron compuerta = new Neuron(new ArrayList<Double>() {{
            add(1.2);
            add(1.3);
        }}, 1.02);
        
        return compuerta.activar(new ArrayList<>(){{
            add((double) a);
            add((double) b);
        }});
    }
    
    private static int And(int a, int b) {
        Neuron compuerta = new Neuron(new ArrayList<Double>() {{
            add(1.0);
            add(1.0);
        }}, 1.5);
        
        return compuerta.activar(new ArrayList<>(){{
            add((double) a);
            add((double) b);
        }});
    }
    
    private static int Xor(int a, int b) {
        return Or(And(a, Not(b)),And(Not(a), b));
    }

}
