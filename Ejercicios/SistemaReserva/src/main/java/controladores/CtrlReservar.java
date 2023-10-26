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
    
    public CtrlReservar(Vuelo vuelo) {
        this.vista = new ViewReservar();
        this.vuelo = vuelo;
        
        vista.Reservar.addActionListener(this);
        vista.Cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        
        if (event == vista.Reservar && vista.Reservar.getText().equals("Reservar")) {
            if (!vuelo.getAsientos().get(IdAsientoReserva).esOcupado()) {
                vista.CampoNUIP.setEnabled(false);
                vista.CampoNombre.setEnabled(false);
                vista.Reservar.setText("Confirmar");
                String txt = "Asiento: " + String.valueOf(IdAsientoReserva);
                txt += "\nClase: " + vuelo.getAsientos().get(IdAsientoReserva).getClase();
                txt += "\nEsta a punto de reservar este asiento.";
                responder(txt);
            } else {
                IdAsientoReserva = vuelo.proxAsientoLibre(getClaseSeleccionada());
                
                if (IdAsientoReserva == -1) {
                    responder("Lo sentimos, no quedan asiento disponibles.");
                    vista.CampoNUIP.setEnabled(false);
                    vista.CampoNombre.setEnabled(false);
                    vista.CheckClaseEco.setEnabled(false);
                    vista.CheckClaseEje.setEnabled(false);
                    vista.Reservar.setEnabled(false);
                } else {
                    
                }
            }
            
            
            
        } else if (event == vista.Reservar) {
            vista.dispose();
            vuelo.ocuparAsiento(IdAsientoReserva, vista.CampoNUIP.getText(), vista.CampoNombre.getText());
            new CtrlVuelo(vuelo).init();
        }
    }
    
    public void init() {
        vista.setTitle("Viajes Tur S.A.S");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.CheckClaseEco.setSelected(true);
    }
    
    public void init(int IdAsiento) {
        init();
        this.IdAsientoReserva = IdAsiento;
        vista.CheckClaseEco.setEnabled(false);
        vista.CheckClaseEje.setEnabled(false);
        if (vuelo.getAsientos().get(IdAsiento).getClase().equals("Ejecutiva")) {
            vista.CheckClaseEco.setSelected(false);
            vista.CheckClaseEje.setSelected(true);
        }
    }
    
    private void responder(String mensaje) {
        vista.Respuesta.setText(mensaje);
    }
    
    private String getClaseSeleccionada() {
        return vista.CheckClaseEco.isSelected() ? "Economica" : "Ejecutiva";
    }
}
