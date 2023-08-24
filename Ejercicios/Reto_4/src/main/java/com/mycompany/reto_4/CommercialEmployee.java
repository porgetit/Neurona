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
public class CommercialEmployee extends Employee{
    private double commission;

    public CommercialEmployee(double commission, String name, int age, double salary) {
        super(name, age, salary);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return super.toString() + " is CommercialEmployee{" + "commission=" + decimalFormat.format(commission) + '}';
    }
    
    public boolean doesPlusApply() {
        return super.getAge() > 30 && this.commission > 200;
    }
}
