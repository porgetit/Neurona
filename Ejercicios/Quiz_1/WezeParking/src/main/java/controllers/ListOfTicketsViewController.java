/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.ListOfTicketsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Cinema;
import models.Ticket;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class ListOfTicketsViewController implements ActionListener{
    ListOfTicketsView view;
    Cinema cinema;

    public ListOfTicketsViewController(Cinema cinema) {
        view = new ListOfTicketsView();
        this.cinema = cinema;
        
        this.view.goBackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.goBackButton) {
            this.view.dispose();
            ManageTicketsViewController manageTicketsViewController = new ManageTicketsViewController(cinema);
            manageTicketsViewController.init();
        }
    }
    
    public void init() {        
        view.setTitle("Weze Parking [Cinema Tickets Management / List Of Tickets]");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        
        view.title.setText("List Of Tickets");
        
        String listOf = "";
        
        for (Ticket ticket : cinema.getTickets()) {
            listOf += "PERSON: " + ticket.getName()+ "\n";
        }
        
        view.listOf.setText(listOf);
    }
}
