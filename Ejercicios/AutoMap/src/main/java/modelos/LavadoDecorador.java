/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public abstract class LavadoDecorador implements iServicios {
    private iServicios servicios;

    public LavadoDecorador(iServicios servicios) {
        this.servicios = servicios;
    }

    public iServicios getServicios() {
        return servicios;
    }
    
}
