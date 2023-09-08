/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_3;

/**
 *
 * @author xdpor
 */
public class PerishableProduct extends Product{
    private int daysToPerish;

    public PerishableProduct(int daysToPerish, String name, double price) {
        super(name, price);
        this.daysToPerish = daysToPerish;
    }

    public int getDaysToPerish() {
        return daysToPerish;
    }

    public void setDaysToPerish(int daysToPerish) {
        this.daysToPerish = daysToPerish;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPerishableProduct{" + "daysToPerish=" + daysToPerish + '}';
    }
    
    @Override
    public double calculate(int amount) {
        double price = super.calculate(amount);
        
        if (daysToPerish <= 10) {
            return price * 0.5;
        }
        
        return price;
    }
}
