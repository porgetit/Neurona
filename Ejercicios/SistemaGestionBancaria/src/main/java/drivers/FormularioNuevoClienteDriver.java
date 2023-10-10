/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.forms.FormularioNuevoCliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class FormularioNuevoClienteDriver implements ActionListener{
    FormularioNuevoCliente view;

    public FormularioNuevoClienteDriver() {
        view = new FormularioNuevoCliente();
        
        this.view.CampoNombre.addActionListener(this);
        this.view.CampoCedula.addActionListener(this);
        this.view.CampoCCSaldoInicial.addActionListener(this);
        this.view.CampoCASaldoInicial.addActionListener(this);
        this.view.CrearNuevoCliente.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cedula = this.view.CampoCedula.getText();
        String nombre = this.view.CampoNombre.getText();
        double ccSaldoInicial = Double.parseDouble(this.view.CampoCCSaldoInicial.getText());
        double caSaldoInicial = Double.parseDouble(this.view.CampoCASaldoInicial.getText());
        
        if (e.getSource() == view.CrearNuevoCliente) {
            if (!(nombre.matches("^([a-zA-Z]{1,}\s?){1,4}$") || cedula.matches("^(\\d){8,10}$")) || (ccSaldoInicial == 0 || caSaldoInicial == 0)) {
                this.view.Advertencia.setText(this.view.Advertencia.getText() + " Use los formatos adecuados.");
                return;
            }
        
            this.view.dispose();
            MenuGestionCuentaClienteDriver nextDriver = new MenuGestionCuentaClienteDriver(new Cliente(cedula, nombre, ccSaldoInicial, caSaldoInicial));
            nextDriver.init();
        }
    }
    
    public void init() {
        view.setTitle("Simulador Bancario");
        this.view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }    
}
