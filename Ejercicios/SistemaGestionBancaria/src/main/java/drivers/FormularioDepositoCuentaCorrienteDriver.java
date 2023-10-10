/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.forms.FormularioDepositoCuentaCorriente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class FormularioDepositoCuentaCorrienteDriver implements ActionListener{
    FormularioDepositoCuentaCorriente view;
    Cliente cliente;

    public FormularioDepositoCuentaCorrienteDriver(Cliente cliente) {
        this.view = new FormularioDepositoCuentaCorriente();
        this.cliente = cliente;
        
        this.view.CampoMonto.addActionListener(this);
        this.view.Depositar.addActionListener(this);
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
        if (event == this.view.Depositar && this.view.Depositar.getText().equals("Depositar")) {
            this.view.CampoMonto.setEnabled(false);
            this.view.Depositar.setText("Confirmar");
        } else if (event == this.view.Depositar && this.view.Depositar.getText().equals("Confirmar")) {
            this.cliente.getCuentaCorriente().depositar(monto);
            this.view.dispose();
            MenuGestionCuentaClienteDriver nextDriver = new MenuGestionCuentaClienteDriver(cliente);
            nextDriver.init();
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
