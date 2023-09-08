/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Reto_4 {

    public static void main(String[] args) {
        Random random = new Random();
        
        List<CommercialEmployee> commercialEmployees = new ArrayList<>();
        List<DeliveryEmployee> deliveryEmployees = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            double commission = random.nextDouble(501);
            String name = "Empleado " + i;
            int age = 16 + random.nextInt(80);
            double salary = 1000 + random.nextDouble(2501);
            
            commercialEmployees.add(new CommercialEmployee(commission, name, age, salary));
        }
        
        for (int i = 0; i < 10; i++) {
            String zone = "zona " + (1 + random.nextInt(4));
            String name = "Empleado " + i;
            int age = 16 + random.nextInt(80);
            double salary = 1000 + random.nextDouble(2501);
            
            deliveryEmployees.add(new DeliveryEmployee(zone, name, age, salary));
        }
        
        for (CommercialEmployee employee : commercialEmployees) {
            System.out.println(employee.toString() + (employee.doesPlusApply() ? " aplica aumento" : " no aplica aumento"));
        }
        
        for (DeliveryEmployee employee : deliveryEmployees) {
            System.out.println(employee.toString() + (employee.doesPlusApply() ? " aplica aumento" : " no aplica aumento"));
        }
    }
}
