/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.MainView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import models.Cinema;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class MainViewController implements ActionListener {
    MainView view;
    Cinema cinema;

    public MainViewController(Cinema cinema) {
        this.view = new MainView();
        this.cinema = cinema;
        
        this.view.manageTickets.addActionListener(this);
        this.view.manageVehicles.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose(); // Closing the main view
        if (e.getSource() == view.manageVehicles) {
            ManageVehiclesViewController manageVehiclesViewCtrl = new ManageVehiclesViewController(cinema);
            manageVehiclesViewCtrl.init();            
        } else if (e.getSource() == view.manageTickets) {
            ManageTicketsViewController manageTicketsViewCtrl = new ManageTicketsViewController(cinema);
            manageTicketsViewCtrl.init();            
        }
    }
    
    public void init() {
        view.setTitle("Weze Parking");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        view.title.setText("Welcome to Weze Parking Management");
        view.cinemaPeople.setText(view.cinemaPeople.getText() + " " + String.valueOf(cinema.getTickets().size()));
        view.parkingVehicles.setText(view.parkingVehicles.getText() + " " + String.valueOf(cinema.getParkingLots().size()));
        view.exitedVehicles.setText(view.exitedVehicles.getText() + " " + String.valueOf(cinema.getVehiclesExitedCount()));
    }
    
}
