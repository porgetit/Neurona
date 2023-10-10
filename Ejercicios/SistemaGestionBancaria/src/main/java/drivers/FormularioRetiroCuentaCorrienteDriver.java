/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.forms.FormularioRetiroCuentaCorriente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class FormularioRetiroCuentaCorrienteDriver implements ActionListener{
    FormularioRetiroCuentaCorriente view;
    Cliente cliente;

    public FormularioRetiroCuentaCorrienteDriver(Cliente cliente) {
        this.view = new FormularioRetiroCuentaCorriente();
        this.cliente = cliente;
        
        this.view.CampoMonto.addActionListener(this);
        this.view.Retirar.addActionListener(this);
        this.view.Cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double monto;
        
        try {
            monto = Double.parseDouble(this.view.CampoMonto.getText());
        } catch (NumberFormatException exception) {
            monto = 0;
        }
        Object event = e.getSource();
        
        if (event == this.view.Retirar && this.view.Retirar.getText().equals("Retirar")) {
            this.view.CampoMonto.setEnabled(false);
            this.view.Retirar.setText("Confirmar");
        } else if (event == this.view.Retirar && this.view.Retirar.getText().equals("Confirmar")) {
            try {
                this.cliente.getCuentaCorriente().retirar(monto);
                this.view.dispose();
                MenuGestionCuentaClienteDriver nextDriver = new MenuGestionCuentaClienteDriver(cliente);
                nextDriver.init();
            } catch (RuntimeException exception) {
                this.view.CampoMonto.setText(""+exception);
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
    }
}
