/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Asiento;
import modelos.Vuelo;
import vistas.ViewConsultarReservas;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlConsultarReservas implements ActionListener {
    private ViewConsultarReservas vista;
    private Vuelo vuelo;
    private Asiento asiento;
    
    public CtrlConsultarReservas(Vuelo vuelo) { // Cuanto se presione el boton de consultas
        vista = new ViewConsultarReservas();
        this.vuelo = vuelo;
        
        vista.Buscar.addActionListener(this);
        vista.CheckAsiento.addActionListener(this);
        vista.CheckNUIP.addActionListener(this);
        vista.CheckNombre.addActionListener(this);
        vista.Volver.addActionListener(this);
        vista.Reservar.addActionListener(this);
        vista.Cancelar.addActionListener(this);
        vista.Modificar.addActionListener(this);
        vista.GenerarBoleto.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        
        if (event == vista.Buscar) {
            String entrada = vista.Entrada.getText();
            String criterio = vista.CheckAsiento.isSelected() ? "Asiento" : vista.CheckNUIP.isSelected() ? "NUIP" : "Nombre";
            buscar(entrada, criterio);
        } else if (event == vista.Volver) {
            new CtrlVuelo(vuelo).init();
        } else if (event == vista.Reservar) {
            vista.dispose();
            new CtrlReservar(vuelo, Integer.parseInt(vista.Entrada.getText())).init();
        } else if (event == vista.Modificar) {
            vista.dispose();
            new CtrlModificar(vuelo, Integer.parseInt(vista.Entrada.getText())).init();
        }
    }
    
    public void init() {
        vista.setTitle("Viajes Tur S.A.S");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.Respuesta.setTabSize(2);
        
        vista.Reservar.setEnabled(false);
        vista.Modificar.setEnabled(true);
        vista.Cancelar.setEnabled(true);
        vista.GenerarBoleto.setEnabled(true);        
        
        vista.CheckAsiento.setSelected(true);
    }
    
    public void init(int Asiento) {
        init();
        responder(Asiento);
    }
    
    private void buscar(String entrada, String criterio) {
        switch (criterio) {
            case "Asiento" -> {
                if (entrada.matches("\\d+")) {
                    int codAsiento = Integer.parseInt(entrada);
                    responder(codAsiento);
                } else {
                    responder("Error en el formato de busqueda.");
                }                
            }
            case "NUIP" -> {
                if (entrada.matches("\\d{8,10}")) {
                    String NUIP = entrada;
                    int codAsiento = 0;
                    
                    for (int i = 0; i < vuelo.getAsientos().size(); i++) {
                        if (NUIP.equals(vuelo.getAsientos().get(i).getNUIP())) {
                            codAsiento = i;
                            break;
                        }
                    }
                    
                    responder(codAsiento);                    
                } else {
                    responder("Error en el formato de busqueda.");
                }
            }
            case "Nombre" -> {
                if (entrada.matches("^[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z][a-z]+$")) {
                    String Nombre = entrada;
                    int codAsiento = 0;
                    
                    for (int i = 0; i < vuelo.getAsientos().size(); i++) {
                        if (Nombre.equals(vuelo.getAsientos().get(i).getNombre())) {
                            codAsiento = i;
                            break;
                        }
                    }
                    
                    responder(codAsiento);                    
                } else {
                    responder("Error en el formato de busqueda.");
                }
            }
            default -> {
                responder("Error en el criterio de busqueda.");
            }
        }
    }
    
    private void responder(String mensaje) {
        vista.Respuesta.setText(mensaje);
    }
    
    private void responder(int Asiento) {
        vista.Entrada.setText(String.valueOf(Asiento));
        
        try {
            asiento = vuelo.getAsientos().get(Asiento);
            
            if (asiento.esOcupado()) {
                vista.Reservar.setEnabled(false);
                vista.Modificar.setEnabled(true);
                vista.Cancelar.setEnabled(true);
                vista.GenerarBoleto.setEnabled(true);
                String dataPasajero = "Pasajero: " + asiento.getNombre();
                dataPasajero += "\nNUIP: " + asiento.getNUIP();
                dataPasajero += "\nAsiento " + String.valueOf(Asiento) + " de clase " + asiento.getClase();
                responder(dataPasajero);
            } else {
                vista.Reservar.setEnabled(true);
                vista.Modificar.setEnabled(false);
                vista.Cancelar.setEnabled(false);
                vista.GenerarBoleto.setEnabled(false);
                responder("Asiento libre.");
            }
            
        } catch (Exception e) {
            responder("Asiento no encontrado.");
        }        
        
    }
    
}
