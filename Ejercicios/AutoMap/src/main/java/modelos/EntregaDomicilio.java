/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class EntregaDomicilio extends LavadoDecorador {
    private iServicios servicios;

    public EntregaDomicilio(iServicios servicios) {
        super(servicios);
        this.servicios = servicios;
    }    

    @Override
    public String getDescription() {
        return servicios.getDescription() + "\nServicio a domicilio $100.000";
    }

    @Override
    public double getPrice() {
       return servicios.getPrice() + 100000;
    }
    
}
