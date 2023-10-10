/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drivers;

import views.lists.ListaCDT;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Map;

import models.Cliente;
import models.CDT;
/**
 *
 * @author Kevin Esguerra Cardona
 */
public class ListaCDTDriver implements ActionListener{
    ListaCDT view;
    Cliente cliente;

    public ListaCDTDriver(Cliente cliente) {
        this.view = new ListaCDT();
        this.cliente = cliente;
        
        this.view.Salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.view.Salir) {
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
        
        this.cliente.getCuentasCDT().entrySet().forEach(entry -> {
            CDT cdt = entry.getValue();
            this.view.AreaTexto.setText(this.view.AreaTexto.getText() + "Nombre: " + entry.getKey() + "\n\tInversión: " + cdt.getSaldo() + "\n\tCuota de retorno: " + cdt.getPorcentajeInteres() + "\n\tRetorno acumulado: " + cdt.getInteresAcumulado() + "\n\tPlazo hasta cierre: " + cdt.getMesesRestantes() + "\n");
        });
    }
}
