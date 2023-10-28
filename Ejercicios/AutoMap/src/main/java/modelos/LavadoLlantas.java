/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class LavadoLlantas extends LavadoDecorador {
    private iServicios servicios;

    public LavadoLlantas(iServicios servicios) {
        super(servicios);
        this.servicios = servicios;
    }

    @Override
    public String getDescription() {
        return servicios.getDescription() + "\nLavado llantas, cepillo lava-ruedas Multi-disk. Cepillo lava-ruedas con ocho cepillos $123.000";
    }

    @Override
    public double getPrice() {
        return servicios.getPrice() + 123000;
    }
    
}
