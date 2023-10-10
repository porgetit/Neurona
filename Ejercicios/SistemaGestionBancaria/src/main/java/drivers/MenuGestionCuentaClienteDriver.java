/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.menus.MenuGestionCuentaCliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

import java.text.DecimalFormat;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MenuGestionCuentaClienteDriver implements ActionListener{
    MenuGestionCuentaCliente  view;
    Cliente cliente;

    public MenuGestionCuentaClienteDriver(Cliente cliente) {
        this.view = new MenuGestionCuentaCliente();
        this.cliente = cliente;
        
        this.view.DepositarCuentaCorriente.addActionListener(this);
        this.view.DepositarCuentaAhorros.addActionListener(this);
        this.view.RetirarCuentaCorriente.addActionListener(this);
        this.view.RetirarCuentaAhorros.addActionListener(this);
        this.view.ListaCDT.addActionListener(this);
        this.view.AbrirCDT.addActionListener(this);
        this.view.CerrarCDT.addActionListener(this);
        this.view.AvanzarMeses.addActionListener(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object eleccion = e.getSource();
        if (eleccion == this.view.DepositarCuentaCorriente) {
            this.view.dispose();
            FormularioDepositoCuentaCorrienteDriver nextDriver = new FormularioDepositoCuentaCorrienteDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.DepositarCuentaAhorros) {
            this.view.dispose();
            FormularioDepositoCuentaAhorrosDriver nextDriver = new FormularioDepositoCuentaAhorrosDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.RetirarCuentaCorriente) {
            this.view.dispose();
            FormularioRetiroCuentaCorrienteDriver nextDriver = new FormularioRetiroCuentaCorrienteDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.RetirarCuentaAhorros) {
            this.view.dispose();
            FormularioRetiroCuentaAhorrosDriver nextDriver = new FormularioRetiroCuentaAhorrosDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.ListaCDT) {
            this.view.dispose();
            ListaCDTDriver nextDriver = new ListaCDTDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.AbrirCDT) {
            this.view.dispose();
            FormularioAbrirCDTDriver nextDriver = new FormularioAbrirCDTDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.CerrarCDT) {
            this.view.dispose();
            FormularioCerrarCDTDriver nextDriver = new FormularioCerrarCDTDriver(cliente);
            nextDriver.init();
        } else if (eleccion == this.view.AvanzarMeses) {
            this.cliente.avanzarMeses((int) this.view.CantidadMeses.getValue());
            this.setSaldoCuentaCorriente();
            this.setSaldoCuentaAhorros();
            this.setSaldoTotal();
        }        
    }
    
    public void init() {
        this.view.setTitle("Simulador Bancario");
        this.view.setResizable(false);
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
        
        this.view.LabelSaludo.setText("Bienvenido " + this.cliente.getNombre() + " - " + this.cliente.getCedula());
        this.setSaldoCuentaCorriente();
        this.setSaldoCuentaAhorros();
        this.setSaldoTotal();        
    }
    
    private void setSaldoTotal() {
        this.view.LabelValorSaldoTotal.setText(new DecimalFormat("#.##").format(this.getSaldoCuentaCorriente() + this.getSaldoCuentaAhorros()));
    }
    
    private void setSaldoCuentaAhorros() {
        this.view.LabelValorSaldoCuentaAhorros.setText(new DecimalFormat("#.##").format(this.getSaldoCuentaAhorros()));
    }
    
    private void setSaldoCuentaCorriente() {
        this.view.LabelValorSaldoCuentaCorriente.setText(new DecimalFormat("#.##").format(this.getSaldoCuentaCorriente()));
    }
    
    private double getSaldoCuentaAhorros() {
        return this.cliente.getCuentaAhorros().getSaldo();
    }
    
    private double getSaldoCuentaCorriente() {
        return this.cliente.getCuentaCorriente().getSaldo();
    }
}
