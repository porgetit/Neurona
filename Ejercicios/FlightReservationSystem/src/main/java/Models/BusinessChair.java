/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Models;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class BusinessChair extends Chair{
    private String location;
    private double price;

    public BusinessChair(int id, String location) {
        super(id);
        this.location = location;
        this.price = 1000.00d;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}
