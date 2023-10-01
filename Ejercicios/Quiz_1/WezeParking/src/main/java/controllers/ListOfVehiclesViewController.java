/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.ListOfVehiclesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Cinema;
import models.ParkingLot;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class ListOfVehiclesViewController implements ActionListener{
    ListOfVehiclesView view;
    Cinema cinema;

    public ListOfVehiclesViewController(Cinema cinema) {
        this.view = new ListOfVehiclesView();
        this.cinema = cinema;
        
        this.view.goBackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.goBackButton) {
            this.view.dispose();
            ManageVehiclesViewController manageVehiclesViewController = new ManageVehiclesViewController(cinema);
            manageVehiclesViewController.init();
        }
    }    
    
    public void init() {
        view.setTitle("Weze Parking [.. / Vehicle Management / List Of Vehicles]");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        view.title.setText("List Of Vehicles");
        
        String listOf = "";
        
        for (ParkingLot lot : cinema.getParkingLots()) {
            listOf += "PLATE: " + lot.getLicensePlate() + "\n";
        }
        
        view.listOf.setText(listOf);
    }
}
