/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.ManageVehiclesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Cinema;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class ManageVehiclesViewController implements ActionListener{
    ManageVehiclesView view;
    Cinema cinema;

    public ManageVehiclesViewController(Cinema cinema) {
        this.view = new ManageVehiclesView();
        this.cinema = cinema;
        
        this.view.newVehicle.addActionListener(this);
        this.view.deleteVehicle.addActionListener(this);
        this.view.ListOfVehicles.addActionListener(this);
        this.view.goBackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
        if (e.getSource() == view.newVehicle) {
            NewVehicleViewController newVehicleViewCtrl = new NewVehicleViewController(cinema);
            newVehicleViewCtrl.init();
        } else if (e.getSource() == view.deleteVehicle) {
            DeleteVehicleViewController deleteVehicleViewCtrl = new DeleteVehicleViewController(cinema);
            deleteVehicleViewCtrl.init();
        } else if (e.getSource() == view.ListOfVehicles) {
            ListOfVehiclesViewController listOfVehiclesViewCtrl = new ListOfVehiclesViewController(cinema);
            listOfVehiclesViewCtrl.init();
        } else if (e.getSource() == view.goBackButton) {
            MainViewController mainViewCtrl = new MainViewController(cinema);
            mainViewCtrl.init();
        }
    }    
    
    public void init() {
        view.setTitle("Weze Parking [Vehicle Management]");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        view.title.setText("Vehicle Management");
    }
}
