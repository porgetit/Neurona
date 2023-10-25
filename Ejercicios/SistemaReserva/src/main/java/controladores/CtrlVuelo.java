/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Vuelo;
import vistas.ViewVuelo;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlVuelo implements ActionListener {
    ViewVuelo vista;
    Vuelo vuelo;
    
    public CtrlVuelo() {
        vista = new ViewVuelo();
        vuelo = new Vuelo();
        
        
        vista.InfoReservas.addActionListener(this);
        vista.Button1.addActionListener(this);
        vista.Button2.addActionListener(this);
        vista.Button3.addActionListener(this);
        vista.Button4.addActionListener(this);
        vista.Button5.addActionListener(this);
        vista.Button6.addActionListener(this);
        vista.Button7.addActionListener(this);
        vista.Button8.addActionListener(this);
        vista.Button9.addActionListener(this);
        vista.Button10.addActionListener(this);
        vista.Button11.addActionListener(this);
        vista.Button12.addActionListener(this);
        vista.Button13.addActionListener(this);
        vista.Button14.addActionListener(this);
        vista.Button15.addActionListener(this);
        vista.Button16.addActionListener(this);
        vista.Button17.addActionListener(this);
        vista.Button18.addActionListener(this);
        vista.Button19.addActionListener(this);
        vista.Button20.addActionListener(this);
        vista.Button21.addActionListener(this);
        vista.Button22.addActionListener(this);
        vista.Button23.addActionListener(this);
        vista.Button24.addActionListener(this);
        vista.Button25.addActionListener(this);
        vista.Button26.addActionListener(this);
        vista.Button27.addActionListener(this);
        vista.Button28.addActionListener(this);
        vista.Button29.addActionListener(this);
        vista.Button30.addActionListener(this);
        vista.Button31.addActionListener(this);
        vista.Button32.addActionListener(this);
        vista.Button33.addActionListener(this);
        vista.Button34.addActionListener(this);
        vista.Button35.addActionListener(this);
        vista.Button36.addActionListener(this);
        vista.Button37.addActionListener(this);
        vista.Button38.addActionListener(this);
        vista.Button39.addActionListener(this);
        vista.Button40.addActionListener(this);
        vista.Button41.addActionListener(this);
        vista.Button42.addActionListener(this);
        vista.Button43.addActionListener(this);
        vista.Button44.addActionListener(this);
        vista.Button45.addActionListener(this);
        vista.Button46.addActionListener(this);
        vista.Button47.addActionListener(this);
        vista.Button48.addActionListener(this);
        vista.Button49.addActionListener(this);
        vista.Button50.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
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
