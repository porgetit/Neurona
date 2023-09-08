/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_3;

/**
 *
 * @author xdpor
 */
public class NonPerishableProduct extends Product{
    private String type;

    public NonPerishableProduct(String type, String name, double price) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNonPerishableProduct{" + "type=" + type + '}';
    }
}
