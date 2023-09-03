/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Pinguino extends Aves implements Nadar{

    public Pinguino(String nombre, double peso, int edad) {
        super(nombre, peso, edad);
    }

    @Override
    public String comer() {
        return super.getNombre() + " comiendo";
    }

    @Override
    public String dormir() {
        return super.getNombre() + " durmiendo";
    }

    @Override
    public String nadar() {
        return super.getNombre() + " nadando";
    }
    
    
}
