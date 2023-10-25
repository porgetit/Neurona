/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import modelos.Vuelo;
import vistas.ViewVuelo;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlVuelo implements ActionListener {
    private ViewVuelo vista;
    private Vuelo vuelo;
    private final List<JButton> Botones;
    
    public CtrlVuelo(Vuelo vuelo) {
        vista = new ViewVuelo();
        this.vuelo = vuelo;
        
        
        vista.InfoReservas.addActionListener(this);
        
        Botones = new ArrayList<>() {{
            add(vista.Button1);
            add(vista.Button2);
            add(vista.Button3);
            add(vista.Button4);
            add(vista.Button5);
            add(vista.Button6);
            add(vista.Button7);
            add(vista.Button8);
            add(vista.Button9);
            add(vista.Button10);
            add(vista.Button11);
            add(vista.Button12);
            add(vista.Button13);
            add(vista.Button14);
            add(vista.Button15);
            add(vista.Button16);
            add(vista.Button17);
            add(vista.Button18);
            add(vista.Button19);
            add(vista.Button20);
            add(vista.Button21);
            add(vista.Button22);
            add(vista.Button23);
            add(vista.Button24);
            add(vista.Button25);
            add(vista.Button26);
            add(vista.Button27);
            add(vista.Button28);
            add(vista.Button29);
            add(vista.Button30);
            add(vista.Button31);
            add(vista.Button32);
            add(vista.Button33);
            add(vista.Button34);
            add(vista.Button35);
            add(vista.Button36);
            add(vista.Button37);
            add(vista.Button38);
            add(vista.Button39);
            add(vista.Button40);
            add(vista.Button41);
            add(vista.Button42);
            add(vista.Button43);
            add(vista.Button44);
            add(vista.Button45);
            add(vista.Button46);
            add(vista.Button47);
            add(vista.Button48);
            add(vista.Button49);
            add(vista.Button50);
        }};
        
        Botones.forEach(boton -> boton.addActionListener(this));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        
        if (event == vista.InfoReservas) {
            this.vista.dispose();
            new CtrlConsultarReservas(vuelo).init();
        } else if (Botones.contains((JButton) event)) {
            int id = -1;
            
            for (JButton boton : Botones) {
                if ((JButton) event == boton) {
                    id = Integer.parseInt(boton.getText()) - 1;
                }
            }
            
            if (id == -1) {
                throw new RuntimeException("Error al seleccionar un boton");
            }
            
            new CtrlReservar(vuelo, id);
        }        
    }
    
    
    // Inicializar el color de los botones
    public void init() {
        vista.setTitle("Viajes Tur S.A.S");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        upReporte();
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
}
