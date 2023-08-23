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
    
    private final String idNumber;
    private String name;
    private int age;
    private char gender;
    private double weight, height;
    
    private String generateIdNumber() {
        Random random = new Random();
        String newIdNumber = "";
        
        for (int i = 0; i < 10; i++) {
            newIdNumber += random.nextInt(10) + "";
        }
        
        return newIdNumber;        
    }
    
    public Persona() {
        this.idNumber = generateIdNumber();
        this.name = "";
        this.age = 0;
        this.gender = 'h';
        this.weight = 0;
        this.height = 0;
    }
    
    public Persona(String name, int age, char gender, double weight, double height) {
        this.idNumber = generateIdNumber();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    
    @Override
    public String toString() {
        return "Name: " + name +
               "\nID Number: " + idNumber +
               "\nAge: " + age +
               "\nGender: " + gender +
               "\nWeight: " + weight +
               "\nHeight: " + height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int calculateBMI() {
        double totalWeight = this.weight / (this.height * this.height);
        
        if (totalWeight < 20) {
            return -1;
        } else if (totalWeight <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean isAdult() {
        return this.age >= 18;
    }
    
    public boolean checkGender(char Gender) {
        return this.gender == Gender;
    }
}
