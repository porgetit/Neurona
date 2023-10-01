/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import views.ManageTicketsView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Cinema;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class ManageTicketsViewController implements ActionListener{
    ManageTicketsView view;
    Cinema cinema;

    public ManageTicketsViewController(Cinema cinema) {
        this.view = new ManageTicketsView();
        this.cinema = cinema;
        
        this.view.newTicket.addActionListener(this);
        this.view.listOfTickets.addActionListener(this);
        this.view.goBackButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
        if (e.getSource() == view.newTicket) {
            NewTicketViewController newTicketViewCtrl = new NewTicketViewController(cinema);
            newTicketViewCtrl.init();
        } else if (e.getSource() == view.listOfTickets) {
            ListOfTicketsViewController listOfTicketsViewCtrl = new ListOfTicketsViewController(cinema);
            listOfTicketsViewCtrl.init();
        } else if (e.getSource() == view.goBackButton) {
            MainViewController mainViewCtrl = new MainViewController(cinema);
            mainViewCtrl.init();
        }
    }
    
    public void init() {
        view.setTitle("Weze Parking [Cinema Tickets Management]");
        view.setLocationRelativeTo(null);
        view.setVisible(true);

        view.title.setText("Cinema Tickets Management");
    }
}
