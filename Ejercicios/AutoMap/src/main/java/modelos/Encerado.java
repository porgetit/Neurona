/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Encerado extends LavadoDecorador {
    private iServicios servicios;

    public Encerado(iServicios servicios) {
        super(servicios);
        this.servicios = servicios;
    }

    @Override
    public String getDescription() {
        return servicios.getDescription() + "\nAplicación de Jabón, Cera Espuma, Encerado, Pulido y descontaminación de carrocería $230.000";
    }

    @Override
    public double getPrice() {
        return servicios.getPrice() + 230000;
    }
    
}
