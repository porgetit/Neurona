/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Cinema {
    private List<ParkingLot> parkingLots;
    private int vehiclesExitedCount;
    private List<Ticket> tickets;
    
    public Cinema() {
        parkingLots = new ArrayList<>();        
        vehiclesExitedCount = 0;
        tickets = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    /**
     *
     * @return
     */
    public List<Ticket> getTickets() {
        return tickets;
    }

    /**
     *
     * @return
     */
    public int getVehiclesExitedCount() {
        return vehiclesExitedCount;
    }      
    
    /**
     *
     * @param plate
     * @return true for success and false for unsuccess
     */
    public boolean occupyParkingLot(String plate) {
        if (parkingLots.size() == 10) {
            return false;
        }
        
        parkingLots.add(new ParkingLot(plate));        
        return true;
    }
    
    /**
     *
     * @param plate
     * @return true for success and false for unsuccess
     */
    public boolean vacateParkingLot(String plate) {
        int length = parkingLots.size();
        
        for (int i = 0; i < length; i++) {
            if (parkingLots.get(i).licensePlate.equals(plate)) {
                parkingLots.remove(i);
                this.vehiclesExitedCount += 1;
                return true;
            }
        }
        
        return false;
    }
    
    /**
     *
     * @param name
     */
    public void newTicket(String name) {
        tickets.add(new Ticket(name));
    }
}
