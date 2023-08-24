/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_4;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class DeliveryEmployee extends Employee{
    private String zone;

    public DeliveryEmployee(String zone, String name, int age, double salary) {
        super(name, age, salary);
        this.zone = zone;
    }
  
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return super.toString() + " is DeliveryEmployee{" + "zone=" + zone + '}';
    }
    
    public boolean doesPlusApply() {
        return super.getAge() < 25 && this.zone.equals("zona 3");
    }    
}
