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
    private final String IdVuelo;
    private final List<Asiento> Asientos;

    public Vuelo() {
        this.HoraSalida = LocalTime.of(new Random().nextInt(1,25), new Random().nextInt(1, 61));
        this.HoraLlegada = HoraSalida.plusHours(new Random().nextInt(1,25));
        
        this.IdVuelo = "VT-" + (new Random()).nextInt(100, 1000);
        
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
    
    public String getMatricula() {
        return IdVuelo;
    }
    
    public LocalTime getHoraSalida() {
        return HoraSalida;
    }
    
    public LocalTime getHoraLlegada() {
        return HoraLlegada;
    }
    
    
    public String getOcupacionPorcentaje() {
        int ocupados = 0;
        
        for (Asiento asiento : Asientos) {
            ocupados += asiento.esOcupado() ? 1 : 0;
        }
        
        return String.valueOf(ocupados * 100 / Asientos.size());
    }
    
    public String getOcupacion() {
        int ocupados = 0;
        
        for (Asiento asiento : Asientos) {
            ocupados += asiento.esOcupado() ? 1 : 0;
        }
        
        return String.valueOf(ocupados);
    }
    
    public String getOcupacionPorcentajeEjecutiva() {
        int ocupados = 0;
        
        for (Asiento asiento : Asientos) {
            ocupados += asiento.esOcupado() && asiento.getClase().equals("Ejecutiva") ? 1 : 0;
        }
        
        return String.valueOf(ocupados * 100 / 8);
    }
    
    public String getOcupacionEjecutiva() {
        int ocupados = 0;
        
        for (Asiento asiento : Asientos) {
            ocupados += asiento.esOcupado() && asiento.getClase().equals("Ejecutiva") ? 1 : 0;
        }
        
        return String.valueOf(ocupados);
    }
    
    public String getOcupacionPorcentajeEconomica() {
        int ocupados = 0;
        
        for (Asiento asiento : Asientos) {
            ocupados += asiento.esOcupado() && asiento.getClase().equals("Economica") ? 1 : 0;
        }
        
        return String.valueOf(ocupados * 100 / 42);
    }
    
    public String getOcupacionEconomica() {
        int ocupados = 0;
        
        for (Asiento asiento : Asientos) {
            ocupados += asiento.esOcupado() && asiento.getClase().equals("Economica") ? 1 : 0;
        }
        
        return String.valueOf(ocupados);
    }
    
}
