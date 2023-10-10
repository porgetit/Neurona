/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class CDT {
    private final double saldo;
    private final double porcentajeInteres;
    private double interesAcumulado;
    private final int plazoTermino;
    private int mesesTranscurridos;

    public CDT(double inicial, double porcentajeInteres, int plazo) {
        this.saldo = inicial;
        this.porcentajeInteres = porcentajeInteres;
        this.interesAcumulado = 0;
        this.plazoTermino = plazo;
        this.mesesTranscurridos = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getPorcentajeInteres() {
        return String.valueOf(porcentajeInteres)+" %";
    }

    public String getInteresAcumulado() {
        return String.valueOf(interesAcumulado);
    }

    public String getMesesRestantes() {
        return String.valueOf(plazoTermino - mesesTranscurridos);
    }

    public double avanzarMes() {
        acumularInteres();
        this.mesesTranscurridos++;        
        if (debeCerrar()) {
            return saldo + interesAcumulado;
        }        
        
        return 0;
    }
    
    public double cerrar() {
        return saldo + interesAcumulado;
    }
    
    private boolean debeCerrar() {
        return mesesTranscurridos == plazoTermino;
    }
    
    private void acumularInteres() {
        this.interesAcumulado += this.getInteres();
    }
    
    private double getInteres() {
        return saldo * (porcentajeInteres / 100);
    }
}
