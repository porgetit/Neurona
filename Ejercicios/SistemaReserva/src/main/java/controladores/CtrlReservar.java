/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Vuelo;
import vistas.ViewReservar;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlReservar implements ActionListener{
    ViewReservar vista;
    Vuelo vuelo;
    int IdAsientoReserva;
    
    public CtrlReservar(Vuelo vuelo, int Id) {
        this.vista = new ViewReservar();
        this.vuelo = vuelo;
        this.IdAsientoReserva = Id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void init() {
        vista.setTitle("Viajes Tur S.A.S");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
