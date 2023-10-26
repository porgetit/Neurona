/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Asiento;
import modelos.Vuelo;
import vistas.ViewModificar;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlModificar implements ActionListener{
    private ViewModificar vista;
    private Vuelo vuelo;
    private Asiento asiento;

    public CtrlModificar(Vuelo vuelo, int idAsiento) {
        vista = new ViewModificar();
        this.vuelo = vuelo;
        asiento = vuelo.getAsientos().get(idAsiento);
        
        vista.CampoNUIP.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
    }
    
    public void init() {
        
    }
}
