/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Cristalizado extends LavadoDecorador {
    private iServicios servicios;

    public Cristalizado(iServicios servicios) {
        super(servicios);
        this.servicios = servicios;
    }

    @Override
    public String getDescription() {
        return servicios.getDescription() + "\nPorcelánica de carrocería, Cristalizado de carrocería $4'500.000";
    }

    @Override
    public double getPrice() {
        return servicios.getPrice() + 4500000;
    }
    
}
