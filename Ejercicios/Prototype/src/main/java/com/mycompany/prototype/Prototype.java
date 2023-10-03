/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prototype;

import java.util.Arrays;

/**
 *
 * @author xdpor
 */
public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {
        PC_Prototype proto = new PC_Prototype();
        PC pc = (PC) proto.prototipo("Portatil");
        System.out.println("""
                           Portatil
                           Procesador: """+pc.getProcesador()+"\nMemoria:"+pc.getMemoria()+
    "\nPulgadas: "+pc.getPulgadas()+"\nPrecio: "+pc.getPrecio());
        
        System.out.println(Arrays.toString(args));
    }
}
