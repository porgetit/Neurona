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
    
    /*public List<Double> ajustarPesosYUmbral(List<List<Double>> entradas, List<Integer> salidasEsperadas) {
        List<Double> pesos = new ArrayList<>(this.pesos); // Obtiene una copia de los pesos para trabajar
        double umbral = this.umbral;

        double tasaAprendizaje = 0.1; // Tasa de aprendizaje arbitraria

        for (int i = 0; i < entradas.size(); i++) {
            List<Double> entrada = entradas.get(i);
            int salidaEsperada = salidasEsperadas.get(i);
            int salidaCalculada = this.activar(entrada);

            if (salidaEsperada != salidaCalculada) {
                // Ajusta los pesos y el umbral según el error
                for (int j = 0; j < pesos.size(); j++) {
                    double nuevoPeso = pesos.get(j) + tasaAprendizaje * (salidaEsperada - salidaCalculada) * entrada.get(j);
                    pesos.set(j, nuevoPeso);
                }
                // Ajusta el umbral
                umbral += tasaAprendizaje * (salidaEsperada - salidaCalculada);
            }
        }

        // Retorna los nuevos pesos y el umbral
        List<Double> nuevosPesosYUmbral = new ArrayList<>(pesos);
        nuevosPesosYUmbral.add(umbral);

        return nuevosPesosYUmbral;
    }*/

}
