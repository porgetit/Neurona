/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Lavado implements iServicios {

    @Override
    public String getDescription() {
        return "Lavado a mano y Secado (Servicio básico) $58.900";
    }

    @Override
    public double getPrice() {
        return 50000 + 8900;
    }
    
}
