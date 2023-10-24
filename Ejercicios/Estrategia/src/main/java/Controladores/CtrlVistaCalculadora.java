/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controladores;

import Vistas.VistaCalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelos.Contexto;

import java.text.DecimalFormat;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CtrlVistaCalculadora implements ActionListener {
    VistaCalculadora vista;
    Contexto calculadora;

    public CtrlVistaCalculadora() {
        this.vista = new VistaCalculadora();
        this.calculadora = new Contexto();
        
        this.vista.Button0.addActionListener(this);
        this.vista.Button1.addActionListener(this);
        this.vista.Button2.addActionListener(this);
        this.vista.Button3.addActionListener(this);
        this.vista.Button4.addActionListener(this);
        this.vista.Button5.addActionListener(this);
        this.vista.Button6.addActionListener(this);
        this.vista.Button7.addActionListener(this);
        this.vista.Button8.addActionListener(this);
        this.vista.Button9.addActionListener(this);
        this.vista.ButtonCociente.addActionListener(this);
        this.vista.ButtonProducto.addActionListener(this);
        this.vista.ButtonResta.addActionListener(this);
        this.vista.ButtonSuma.addActionListener(this);
        this.vista.ButtonResultado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object action = e.getSource();
        Boolean testigoOperandoA = false;
        String operacion = "";
        String OperandoA = "1";
        String OperandoB = "1";
        String Resultado = "";
        
        if (action == this.vista.Button0) {
            if (!testigoOperandoA) {
                OperandoA += "0";
            } else {
                OperandoB += "0";
            }
        } else if (action == this.vista.Button1) {
            if (!testigoOperandoA) {
                OperandoA += "1";
            } else {
                OperandoB += "1";
            }           
        } else if (action == this.vista.Button2) {
            if (!testigoOperandoA) {
                OperandoA += "2";
            } else {
                OperandoB += "2";
            }          
        } else if (action == this.vista.Button3) {
            if (!testigoOperandoA) {
                OperandoA += "3";
            } else {
                OperandoB += "3";
            }     
        } else if (action == this.vista.Button4) {
            if (!testigoOperandoA) {
                OperandoA += "4";
            } else {
                OperandoB += "4";
            }             
        } else if (action == this.vista.Button5) {
            if (!testigoOperandoA) {
                OperandoA += "5";
            } else {
                OperandoB += "5";
            }           
        } else if (action == this.vista.Button6) {
            if (!testigoOperandoA) {
                OperandoA += "6";
            } else {
                OperandoB += "6";
            }           
        } else if (action == this.vista.Button7) {
            if (!testigoOperandoA) {
                OperandoA += "7";
            } else {
                OperandoB += "7";
            }            
        } else if (action == this.vista.Button8) {
            if (!testigoOperandoA) {
                OperandoA += "8";
            } else {
                OperandoB += "8";
            }             
        } else if (action == this.vista.Button9) {
            if (!testigoOperandoA) {
                OperandoA += "9";
            } else {
                OperandoB += "9";
            }          
        } else if (action == this.vista.ButtonCociente) {
            testigoOperandoA = true;
            operacion = "/";
        } else if (action == this.vista.ButtonProducto) {
            testigoOperandoA = true;
            operacion = "*";
        } else if (action == this.vista.ButtonSuma) {
            testigoOperandoA = true;
            operacion = "+";
        } else if (action == this.vista.ButtonResta) {
            testigoOperandoA = true;
            operacion = "-";
        } else if (action == this.vista.ButtonResultado) {
            Resultado = String.valueOf(calculadora.operacion(Double.parseDouble(OperandoA), Double.parseDouble(OperandoB), operacion));
            setDisplay(Resultado);
            System.out.println(Resultado);
            testigoOperandoA = false;
        }
    }
    
    public void init() {
        this.vista.setTitle("Calculadora");
        this.vista.setResizable(false);
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    private String getDisplay() {
        return this.vista.Display.getText();
    }    
    
    private void setDisplay(String text) {
        this.vista.Display.setText(text);
    }
}
