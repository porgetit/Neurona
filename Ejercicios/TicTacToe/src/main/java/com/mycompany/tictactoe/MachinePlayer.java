/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.List;
import java.util.Random;

/**
 *
 * @author xdpor
 */
public class MachinePlayer {    
    public static String toPlay(List<String> freeLocations) { // Return location for MatchView.toMove()
        int location = new Random().nextInt(freeLocations.size());
        return freeLocations.get(location);
    }
}
