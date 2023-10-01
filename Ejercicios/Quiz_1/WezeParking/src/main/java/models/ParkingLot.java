/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class ParkingLot extends Vehicle{

    public ParkingLot(String plate) {
        super.licensePlate = plate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
