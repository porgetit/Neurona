/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wezeparking;

import controllers.MainViewController;
import models.Cinema;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class WezeParking {

    public static void main(String[] args) {        
        MainViewController mainViewCtrl = new MainViewController(new Cinema());
        mainViewCtrl.init();
    }
}
