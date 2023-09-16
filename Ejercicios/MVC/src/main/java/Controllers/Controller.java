/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;


import Views.View;
import Models.Logic;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Controller implements ActionListener{
    View view;
    Logic logic;

    public Controller(View view, Logic logic) {
        this.view = view;
        this.logic = logic;
        
        this.view.Num1.addActionListener(this);
        this.view.Num2.addActionListener(this);
        this.view.Result.addActionListener(this);
        this.view.Sum.addActionListener(this);
        this.view.Dif.addActionListener(this);
        this.logic.sum();
        this.logic.dif();        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        logic.setA(Double.parseDouble(view.Num1.getText()));
        logic.setB(Double.parseDouble(view.Num2.getText()));
        
        if (e.getSource() == view.Sum) {
            view.Result.setText(String.valueOf(logic.sum()));
        } else if (e.getSource() == view.Dif) {
            view.Result.setText(String.valueOf(logic.dif()));
        }
    }
    
    public void init() {
        view.setTitle("wenas pah!");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
