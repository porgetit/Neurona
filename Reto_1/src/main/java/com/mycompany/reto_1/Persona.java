/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_1;

import java.util.Random;

/**
 *
 * @author xdpor
 */
public class Persona {
    
    private String dni, nombre;
    private int edad;
    private char sexo;
    private double peso, altura;
    
    private String generateDNI() {
        Random random = new Random();
        String new_dni = "";
        
        for (int i = 0; i < 10; i++) {
            new_dni += random.nextInt(10) + "";
        }
        
        return new_dni;        
    }
    
    public Persona() {
        this.dni = generateDNI();
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'h';
        this.peso = 0;
        this.altura = 0;
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.dni = generateDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nDNI: " + dni +
               "\nEdad: " + edad +
               "\nSexo: " + sexo +
               "\nPeso: " + peso +
               "\nAltura: " + altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char isSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int ICM() {
        double peso_total = this.peso / (this.altura * this.altura);
        
        if (peso_total < 20) {
            return -1;
        } else if (peso_total <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean MayorEdad() {
        return this.edad >= 18;
    }
    
    public boolean comprobarSexo(char Sexo) {
        return this.sexo == Sexo;
    }
}
