/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lavadora;

/**
 *
 * @author xdpor
 */
public class Lavadora {

    public static void main(String[] args) {
        Ensambladora factory = new Ensambladora();
        lavadoras lv1 = factory.toBuild("Marca 1");
        lavadoras lv2 = factory.toBuild("Marca 2");
        lavadoras lv3 = factory.toBuild("Marca 3");
        
        System.out.println(lv1.getDescription());
        System.out.println(lv2.getDescription());
        System.out.println(lv3.getDescription());   
    }
}
