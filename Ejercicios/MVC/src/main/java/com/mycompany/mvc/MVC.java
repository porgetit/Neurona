/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mvc;

import Views.View;
import Models.Logic;
import Controllers.Controller;

/**
 *
 * @author xdpor
 */
public class MVC {

    public static void main(String[] args) {
        View view = new View();
        Logic logic = new Logic();
        Controller ctrl = new Controller(view, logic);
        ctrl.init();
    }
}
