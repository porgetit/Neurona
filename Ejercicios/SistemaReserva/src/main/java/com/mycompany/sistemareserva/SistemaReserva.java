/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemareserva;

import controladores.CtrlVuelo;
import java.io.FileNotFoundException;
import modelos.Vuelo;

/**
 *
 * @author athirtro
 */
public class SistemaReserva {

    public static void main(String[] args) throws FileNotFoundException {
        CtrlVuelo inicio = new CtrlVuelo(new Vuelo());
        inicio.init();
    }
}
