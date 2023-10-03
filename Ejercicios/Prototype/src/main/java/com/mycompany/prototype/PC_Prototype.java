/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.prototype;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class PC_Prototype {
    private Map<String, PC> prototipos = new LinkedHashMap<>();

    public PC_Prototype() {
        PC_Mesa mesa = new PC_Mesa(18, "Core i-5", 1300000, 1000000);
        PC_Portatil portatil = new PC_Portatil("1 año", 14, "Core i-3", 1200000, 500000);
        prototipos.put("Mesa", mesa);
        prototipos.put("Portatil", portatil);
    }
    
    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
    
}
