/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Asiento extends Pasajero {
    private final Boolean clase;

    public Asiento(Boolean clase) {
        this.clase = clase;
        this.NUIP = "";
        this.Nombre = "";
    }
    
    public double obtenerCosto() {
        return clase ? 10 : 100; // ejecutiva -> 100 || economica -> 10
    }

    public String getClase() {
        return clase ? "Economica" : "Ejecutiva";
    }

    public String getNUIP() {
        return NUIP;
    }

    public void setNUIP(String NUIP) {
        if (!NUIP.equals("")) {
            throw new RuntimeException("Asiento ocupado.");
        }
        
        this.NUIP = NUIP;
    }

    public String getNombre() {
        if (!Nombre.equals("")) {
            throw new RuntimeException("Asiento ocupado.");
        }
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }    

    public boolean esOcupado() {
        return !(NUIP.equals("") || Nombre.equals(""));
    }
    
    public void liberar() {
        this.NUIP = "";
        this.Nombre = "";
    }
}
