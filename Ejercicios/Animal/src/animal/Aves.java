/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public abstract class Aves {
    private String nombre;
    private double peso;
    private int edad;

    public Aves(String nombre, double peso, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }
    
    
    
    public abstract String comer();
    public abstract String dormir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
