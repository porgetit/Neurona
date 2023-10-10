/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.menus.MenuGestionCuentaCliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cliente;

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
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void init() {
        
    }
}
