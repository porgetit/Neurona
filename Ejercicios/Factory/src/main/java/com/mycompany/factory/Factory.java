/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factory;

/**
 *
 * @author xdpor
 */
public class Factory {

    public static void main(String[] args) {
        televisorFactory factory = new televisorFactory();
        Televisor tv1 = factory.createTelevisor(32);
        Televisor tv2 = factory.createTelevisor(40);
        
        System.out.println(tv1.getDescription());
        System.out.println(tv2.getDescription());
    }
}
