/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.forms.FormularioAbrirCDT;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class FormularioAbrirCDTDriver implements ActionListener{
    FormularioAbrirCDT view;
    Cliente cliente;

    public FormularioAbrirCDTDriver(Cliente cliente) { 
        this.view = new FormularioAbrirCDT();
        this.cliente = cliente;
        
        this.view.Abrir.addActionListener(this);
        this.view.Cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double montoInicial = (int) this.view.CampoMontoInicial.getValue();
        double cuotaRetorno = (double) this.view.CampoCuotaInteresMensual1.getValue();
        int plazo = (int) this.view.CampoCantidadMeses.getValue();
        String nombre = this.view.CampoNombre.getText();
        Object event = e.getSource();
        
        if (event == this.view.Abrir && this.view.Abrir.getText().equals("Abrir")) {
            this.view.CampoMontoInicial.setEnabled(false);
            this.view.CampoCuotaInteresMensual1.setEnabled(false);
            this.view.CampoCantidadMeses.setEnabled(false);
            this.view.CampoNombre.setEnabled(false);
            this.view.Abrir.setText("Confirmar");
        } else if (event == this.view.Abrir && this.view.Abrir.getText().equals("Confirmar")) {
            try {
                this.cliente.abrirCDT(nombre, montoInicial, cuotaRetorno, plazo);
                this.view.dispose();
                MenuGestionCuentaClienteDriver nextDriver = new MenuGestionCuentaClienteDriver(cliente);
                nextDriver.init();
            } catch (RuntimeException exception) {
                this.view.AreaTexto.setText(""+exception);
                this.view.CampoMontoInicial.setEnabled(true);
                this.view.CampoCuotaInteresMensual1.setEnabled(true);
                this.view.CampoCantidadMeses.setEnabled(true);
                this.view.CampoNombre.setEnabled(true);
                this.view.Abrir.setText("Abrir");                
            }
        } else if (event == this.view.Cancelar) {
            this.view.dispose();
            MenuGestionCuentaClienteDriver nextDriver = new MenuGestionCuentaClienteDriver(cliente);
            nextDriver.init();
        }
    }
    
    public void init() {
        this.view.setTitle("Simulador Bancario");
        this.view.setResizable(false);
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        
        this.view.AreaTexto.setText("El monto inicial para su nueva cuenta de inversión (CDT), será descontado del saldo de su cuenta corriente.");
    }
}
