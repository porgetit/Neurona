/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Vuelo;
import vistas.ViewConsultarReservas;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlConsultarReservas implements ActionListener {
    private final ViewConsultarReservas vista;
    private final Vuelo vuelo;
    
    public CtrlConsultarReservas(Vuelo vuelo) {
        vista = new ViewConsultarReservas();
        this.vuelo = vuelo;
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
