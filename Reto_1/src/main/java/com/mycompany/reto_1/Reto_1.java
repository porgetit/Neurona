/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto_1;

import java.util.Scanner;

/**
 *
 * @author xdpor
 */
public class Reto_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int age;
        char gender;
        double weight, height;
        
        System.out.println("Ingresa los siguientes datos:");
        System.out.print("Nombre: ");
        name = scanner.nextLine();
        System.out.print("Edad: ");
        age = scanner.nextInt();
        // System.out.print("Género: ");
        gender = 'h';
        System.out.print("Peso (kilogramos, gramos): ");
        weight = scanner.nextDouble();
        System.out.print("Altura (metros, centímetros): ");
        height = scanner.nextDouble();
        
        Persona persona1 = new Persona(name, age, gender, weight, height);
        Persona persona2 = new Persona(name, age, gender, 70, 1.65);
        Persona persona3 = new Persona();
        
        persona3.setName("June");
        persona3.setAge(18);
        persona3.setGender('h');
        persona3.setWeight(65.61);
        persona3.setHeight(1.86);
        
        System.out.println("""
                           %s: ¿Es adulto? %s, peso: %s
                           """.formatted(persona1.getName(), persona1.isAdult() ? "Sí" : "No", persona1.calculateBMI() == -1 ? "bajo peso" : persona1.calculateBMI() == 0 ? "saludable" : "sobrepeso"));
        
        System.out.println("""
                           %s: ¿Es adulto? %s, peso: %s
                           """.formatted(persona2.getName(), persona2.isAdult() ? "Sí" : "No", persona2.calculateBMI() == -1 ? "bajo peso" : persona2.calculateBMI() == 0 ? "saludable" : "sobrepeso"));
        
        System.out.println("""
                           %s: ¿Es adulto? %s, peso: %s
                           """.formatted(persona3.getName(), persona3.isAdult() ? "Sí" : "No", persona3.calculateBMI() == -1 ? "bajo peso" : persona3.calculateBMI() == 0 ? "saludable" : "sobrepeso"));
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        
        scanner.close();
    }
}

