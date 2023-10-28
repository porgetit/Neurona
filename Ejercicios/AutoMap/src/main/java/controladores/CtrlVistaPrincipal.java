/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;
import modelos.Cristalizado;
import modelos.Encerado;
import modelos.EntregaDomicilio;
import modelos.Lavado;
import modelos.LavadoLlantas;
import modelos.LavadoMotor;
import modelos.Ticket;
import modelos.iServicios;
import vistas.VistaPrincipal;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlVistaPrincipal implements ActionListener {
    private VistaPrincipal vista;
    private iServicios lavado;
    private List<JRadioButton> radioButtons;

    public CtrlVistaPrincipal() {
        vista = new VistaPrincipal();
        lavado = new Lavado();
        
        vista.Ingresar.addActionListener(this);
        vista.Cancelar.addActionListener(this);
        
        radioButtons = new ArrayList<>() {{
            add(vista.CheckLavadoLlantas);
            add(vista.CheckLavadoMotor);
            add(vista.CheckEncerado);
            add(vista.CheckCristalizado);
            add(vista.CheckDomicilio);
        }};
    }

    @Override
    public void actionPerformed(ActionEvent e){        
        if (e.getSource() == vista.Cancelar) {
            vista.dispose();
        } else if (e.getSource() == vista.Ingresar) {
            String matricula = vista.CampoMatricula.getText();
            if (!matricula.matches("[A-Z]{3}[\\d]{3}")) {
                vista.CampoMatricula.setText("Revise el formato de la matrícula.");
                return;
            }
            
            for (JRadioButton button : radioButtons) {
                if (button.isSelected()) {
                    if (button == vista.CheckLavadoLlantas) {
                        lavado = new LavadoLlantas(lavado);
                    } else if (button == vista.CheckLavadoMotor) {
                        lavado = new LavadoMotor(lavado);
                    } else if (button == vista.CheckEncerado) {
                        lavado = new Encerado(lavado);
                    } else if (button == vista.CheckCristalizado) {
                        lavado = new Cristalizado(lavado);
                    } else if (button == vista.CheckDomicilio) {
                        lavado = new EntregaDomicilio(lavado);
                    }
                }
            }
            vista.dispose();
            try {
                generarTicket(matricula);
            } catch (IOException ex) {
                Logger.getLogger(CtrlVistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
    private void generarTicket(String matricula) throws FileNotFoundException, IOException {
        new Ticket(matricula, lavado).mostrar();
    }    
    
    public void init() {
        vista.setTitle("LavaAutos AutoMap");
        vista.setResizable(false);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

}
