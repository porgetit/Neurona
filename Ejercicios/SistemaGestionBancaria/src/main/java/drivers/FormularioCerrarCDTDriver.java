/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.forms.FormularioCerrarCDT;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class FormularioCerrarCDTDriver implements ActionListener{
    FormularioCerrarCDT view;
    Cliente cliente;

    public FormularioCerrarCDTDriver(Cliente cliente) {
        this.view = new FormularioCerrarCDT();
        this.cliente = cliente;
        
        this.view.Cerrar.addActionListener(this);
        this.view.Cancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = this.view.CampoNombre.getText();
        Object event = e.getSource();
        
        if (event == this.view.Cerrar && this.view.Cerrar.getText().equals("Cerrar")) {
            this.view.CampoNombre.setEnabled(false);
            this.view.Cerrar.setText("Confirmar");
        } else if (event == this.view.Cerrar && this.view.Cerrar.getText().equals("Confirmar")) {
            try {
                this.cliente.cerrarCDT(nombre);
                this.view.dispose();
                MenuGestionCuentaClienteDriver nextDriver = new MenuGestionCuentaClienteDriver(cliente);
                nextDriver.init();
            } catch (RuntimeException exception) {
                this.view.AreaTexto.setText(""+exception);
                this.view.CampoNombre.setEnabled(true);
                this.view.Cerrar.setText("Cerrar");
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
        
        this.view.AreaTexto.setText("El monto invertido y los intereses acumulados serán depositados ensu cuenta corriente.");
    }
}
