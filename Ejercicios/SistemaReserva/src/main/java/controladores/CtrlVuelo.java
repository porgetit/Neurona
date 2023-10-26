/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JButton;
import modelos.Vuelo;
import vistas.ViewVuelo;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlVuelo implements ActionListener {
    private ViewVuelo vista;
    private final Vuelo vuelo;
    private final Map<JButton, Integer> Botones;
    
    public CtrlVuelo(Vuelo vuelo) {
        vista = new ViewVuelo();
        this.vuelo = vuelo;
        
        
        vista.InfoReservas.addActionListener(this);
        
        Botones = new LinkedHashMap<>() {{
            put(vista.Button1, 0);
            put(vista.Button2, 1);
            put(vista.Button3, 2);
            put(vista.Button4, 3);
            put(vista.Button5, 4);
            put(vista.Button6, 5);
            put(vista.Button7, 6);
            put(vista.Button8, 7);
            put(vista.Button9, 8);
            put(vista.Button10, 9);
            put(vista.Button11, 10);
            put(vista.Button12, 11);
            put(vista.Button13, 12);
            put(vista.Button14, 13);
            put(vista.Button15, 14);
            put(vista.Button16, 15);
            put(vista.Button17, 16);
            put(vista.Button18, 17);
            put(vista.Button19, 18);
            put(vista.Button20, 19);
            put(vista.Button21, 20);
            put(vista.Button22, 21);
            put(vista.Button23, 22);
            put(vista.Button24, 23);
            put(vista.Button25, 24);
            put(vista.Button26, 25);
            put(vista.Button27, 26);
            put(vista.Button28, 27);
            put(vista.Button29, 28);
            put(vista.Button30, 29);
            put(vista.Button31, 30);
            put(vista.Button32, 31);
            put(vista.Button33, 32);
            put(vista.Button34, 33);
            put(vista.Button35, 34);
            put(vista.Button36, 35);
            put(vista.Button37, 36);
            put(vista.Button38, 37);
            put(vista.Button39, 38);
            put(vista.Button40, 39);
            put(vista.Button41, 40);
            put(vista.Button42, 41);
            put(vista.Button43, 42);
            put(vista.Button44, 43);
            put(vista.Button45, 44);
            put(vista.Button46, 45);
            put(vista.Button47, 46);
            put(vista.Button48, 47);
            put(vista.Button49, 48);
            put(vista.Button50, 49);
        }};
        
        Botones.keySet().forEach(boton -> boton.addActionListener(this));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.dispose();
        Object event = e.getSource();
        
        if (event == vista.InfoReservas) {
            new CtrlConsultarReservas(vuelo).init();
        } else if (Botones.keySet().contains((JButton) event)) {            
            Botones.keySet().forEach(boton -> {
                if (boton == (JButton) event) {
                    Color color = boton.getBackground();
                    if (color == Color.white) {                        
                        new CtrlReservar(vuelo, Botones.get(boton)).init();
                    } else if (color == Color.gray) {
                        new CtrlConsultarReservas(vuelo).init(Botones.get(boton));
                    }
                }
            });
        } else {
            throw new RuntimeException("Error en vista Vuelo.");
        }
    }
    
    
    // Inicializar el color de los botones
    public void init() {
        vista.setTitle("Viajes Tur S.A.S");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        upReporte();        
        Botones.keySet().forEach(boton -> boton.setBackground(Color.white));
        upEstadoBotones();
    }
    
    private void upReporte() {
        String txt = "Vuelo: " + vuelo.getMatricula();
        txt += "\nHora de salida: " + vuelo.getHoraSalida();
        txt += "\tHora de llegada: " + vuelo.getHoraLlegada();
        txt += "\nAsientos ocupados: " + vuelo.getOcupacion() + "/50 -> " + vuelo.getOcupacionPorcentaje() + "%";
        txt += "\n\tAsientos de clase ejecutiva ocupados: " + vuelo.getOcupacionEjecutiva() + "/8 -> " + vuelo.getOcupacionPorcentajeEjecutiva() + "%";
        txt += "\n\tAsientos de clase economica ocupados: " + vuelo.getOcupacionEconomica()+ "/42 -> " + vuelo.getOcupacionPorcentajeEconomica()+ "%";
        
        vista.Reporte.setText(txt);
    }
    
    private void upEstadoBotones() {
        Botones.keySet().forEach(boton -> {
            if (vuelo.getAsientos().get(Botones.get(boton)).esOcupado()) {
                boton.setBackground(Color.gray);
            }
        });
    }
        
}
