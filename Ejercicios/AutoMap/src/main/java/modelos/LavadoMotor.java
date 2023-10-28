/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class LavadoMotor extends LavadoDecorador {
    private iServicios servicios;

    public LavadoMotor(iServicios servicios) {
        super(servicios);
        this.servicios = servicios;
    }

    @Override
    public String getDescription() {
        return servicios.getDescription() + "\nLavado de motor, Lavado de vestiduras de tela o piel, Teflón en vestiduras $356.000";
    }

    @Override
    public double getPrice() {
        return servicios.getPrice() + 356000;
    }
    
}
