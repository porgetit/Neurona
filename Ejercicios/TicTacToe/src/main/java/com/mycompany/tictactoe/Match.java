/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tictactoe;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Match {
    private final Map<Integer, Player> players;
    private List<Game> games;
    
    public Match(String namePlayer1, String namePlayer2) {
        players = new LinkedHashMap<>() {{
            put(1, new Player(namePlayer1));
            put(2, new Player(namePlayer2));
        }};
        
        games = new ArrayList<>();
    }
    
    public String getPlayerName(int id) {
        return players.get(id).getName();
    }
    
    public String getPlayerPunctuation(int id) {
        return players.get(id).getPunctuation();
    }
    
    public void addOnePoint(int id) {
        players.get(id).addOnePoint();
    }
    
    public void toPlay(String typeOfGame, boolean VSMachine) {
        switch (typeOfGame) {
            case "Unique" -> uniqueGame(VSMachine);
            case "2 of 3" -> atLeastTwoGame(VSMachine);
            case "DeathMatch" -> deathMatchGame(VSMachine);
            default -> {
                throw new IllegalArgumentException("That type of game does not exist");
            }
        }
    }
    
    public void uniqueGame(boolean VSMachine) {
        games = new ArrayList<>() {{add(new Game());}};
        if (VSMachine) {
            // vs machine behavior
            uniqueGameVSMachine();
        } else {
            // vs human behavior
            uniqueGameVSHuman();
        }
    }
    
    public void uniqueGameVSMachine() {
        for (Game game : games) {
            int turn = 1;
            
            while (!game.doesGameEnd()) {
                // Toda la funcionalidad de esta clase debe ser implementada dentro de GameView, ya que esta clase trabaja el comportamiento por medio de los valores pasados por el usuario
            }
        }
    }
    
    public void uniqueGameVSHuman() {
        
    }
    
    public void atLeastTwoGame(boolean VSMachine) {
        games = new ArrayList<>() {{
            add(new Game());
            add(new Game());
        }};
        if (VSMachine) {
            // vs machine behavior
            atLeastTwoGameVSMachine();
        } else {
            // vs human behavior
            atLeastTwoGameVSHuman();
        }
    }
    
    public void atLeastTwoGameVSMachine() {
        // If there is not a winner with just two games, add one more game, play it and finish
    }
    
    public void atLeastTwoGameVSHuman() {
        // If there is not a winner with just two games, add one more game, play it and finish
    }
    
    public void deathMatchGame(boolean VSMachine) {
        games = new ArrayList<>() {{
            add(new Game());
            add(new Game());
        }};
        if (VSMachine) {
            // vs machine behavior
            deathMatchGameVSMachine();
        } else {
            // vs human behavior
            deathMatchGameVSHuman();
        }
    }
    
    public void deathMatchGameVSMachine() {
        // If there is no a winner with just two games, add one game, play it, and continue adding and playing games util get a winner or get 100 games
    }
    
    public void deathMatchGameVSHuman() {
        // If there is no a winner with just two games, add one game, play it, and continue adding and playing games util get a winner or get 100 games
    }
}
