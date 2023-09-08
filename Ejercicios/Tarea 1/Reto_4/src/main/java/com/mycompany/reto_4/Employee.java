/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_4;

import java.text.DecimalFormat;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Employee {
    private String name;
    private int age;
    private double salary;
    private final int PLUS = 300;

    protected Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getPLUS() {
        return PLUS;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + decimalFormat.format(salary) + '}';
    }
}
