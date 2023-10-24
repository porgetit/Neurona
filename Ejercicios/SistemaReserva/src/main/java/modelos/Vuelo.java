/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Vuelo {
    private final LocalTime HoraSalida;
    private LocalTime HoraLlegada;
    private String IdVuelo;
    private final List<Asiento> Asientos;

    public Vuelo() {
        this.HoraSalida = LocalTime.of(new Random().nextInt(1,25), new Random().nextInt(1, 61));
        this.HoraLlegada = HoraSalida.plusHours(new Random().nextInt(1,25));
        this.HoraLlegada = HoraLlegada.plusMinutes(new Random().nextInt(1, 61));
        
        this.IdVuelo = "VV-" + (new Random()).nextInt(100, 1000);
        
        this.Asientos = new ArrayList<>() {{
            for (int i = 0; i < 8; i++) {
                add(new Asiento(false)); // Creamos asientos de clase ejecutiva
            }
            
            for (int i = 0; i < 42; i++) {
                add(new Asiento(true)); // Creamos asientos de clase economica
            }
        }};        
    }
    
    public Asiento buscarPasajero(String Nombre) {
        for(Asiento asiento : Asientos) {
            if (Nombre.equalsIgnoreCase(asiento.getNombre())) {
                return asiento;
            }
        }
        
        throw new RuntimeException("Pasajero no registrado");
    }
    
    public Asiento buscarAsiento(int IdAsiento) {
        return Asientos.get(IdAsiento);
    }
    
    public void ocuparAsiento(int IdAsiento, String NUIP, String Nombre) {
        buscarAsiento(IdAsiento).setNUIP(NUIP);
        buscarAsiento(IdAsiento).setNombre(Nombre);
    }
    
    public void desocuparAsiento(int IdAsiento) {
        buscarAsiento(IdAsiento).setNUIP("");
        buscarAsiento(IdAsiento).setNombre("");
    }
    
    public void generarBoleto(int IdAsiento) {
        try {
            Boleto.generarBoleto(IdVuelo, HoraSalida, HoraLlegada, IdAsiento, Asientos.get(IdAsiento));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vuelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
