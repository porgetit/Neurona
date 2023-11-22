/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author 57312
 */
public class Neuron {
    private final List<Double> pesos;
    private final double umbral;

    public Neuron(List<Double> pesos, double umbral) {
        this.pesos = pesos;
        this.umbral = umbral;
    }
    
    public int activar(List<Double> entradas) {
        // Comprobamos la cantiadad de entradas
        checkEntradas(entradas);
        
        double n = 0; // Suma de energias
        for (int i = 0; i < pesos.size(); i++) {
            n += pesos.get(i) * entradas.get(i);
        }
        
        return n >= umbral ? 1 : 0; // devuelve a
    }
    
    private void checkEntradas(List<Double> entradas) {
        if(entradas.size() != pesos.size()) {
            throw new IllegalArgumentException("You have to set the same amount of entries than weights");
        }
    }
}
