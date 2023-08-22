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
        
        String nombre;
        int edad;
        char sexo;
        double peso, altura;
        
        System.out.println("Ingrese los siguientes datos:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Edad: ");
        edad = scanner.nextInt();
        // System.out.print("Sexo: ");
        sexo = 'h';
        System.out.print("Peso (kilos, gramos): ");
        peso = scanner.nextDouble();
        System.out.print("Altura (metros,centimetros): ");
        altura = scanner.nextDouble();
        
        Persona persona_1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona_2 = new Persona(nombre, edad, sexo, 70, 1.65);
        Persona persona_3 = new Persona();
        
        persona_3.setNombre("June");
        persona_3.setEdad(18);
        persona_3.setSexo('h');
        persona_3.setPeso(65.61);
        persona_3.setAltura(1.86);
        
        System.out.println("""
                           %s: Mayor de edad? %s, peso: %s
                           """.formatted(persona_1.getNombre(), persona_1.MayorEdad() ? "Si" : "No", persona_1.ICM() == -1 ? "bajo" : persona_1.ICM() == 0 ? "ideal" : "alto"));
        
        System.out.println("""
                           %s: Mayor de edad? %s, peso: %s
                           """.formatted(persona_2.getNombre(), persona_2.MayorEdad() ? "Si" : "No", persona_2.ICM() == -1 ? "bajo" : persona_2.ICM() == 0 ? "ideal" : "alto"));
        
        System.out.println("""
                           %s: Mayor de edad? %s, peso: %s
                           """.formatted(persona_3.getNombre(), persona_3.MayorEdad() ? "Si" : "No", persona_3.ICM() == -1 ? "bajo" : persona_3.ICM() == 0 ? "ideal" : "alto"));
        
        persona_1.toString();
        persona_2.toString();
        persona_3.toString();
        
        scanner.close();
    }
}
