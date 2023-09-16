/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Logic {
    private double a, b;
    
    public Logic() {
        
    }

    public Logic(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
    
    public double sum() {
        return this.a + this.b;
    }
    
    public double dif() {
        return this.a - this.b;
    }
}
