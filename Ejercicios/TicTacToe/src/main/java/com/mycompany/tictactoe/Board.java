/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tictactoe;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Board {
    private String state;
    private final Map<String, Box> boxes;
    
    public Board() {
        this.state = "000000000";
        this.boxes = new LinkedHashMap<>() {{
            put("11", new Box());
            put("12", new Box());
            put("13", new Box());
            put("21", new Box());
            put("22", new Box());
            put("23", new Box());
            put("31", new Box());
            put("32", new Box());
            put("33", new Box());
        }};
    }
    
    public String getState() {
        return this.state;
    }
    
    private void setState() {
        String newState = "";
        
        for (Box box : boxes.values()) {
            newState += box.isFree() ? "0" : box.getValue() ? "1" : "2";
        }
        
        this.state = newState;
    }
    
    public void setBox(String location, boolean value) {
        boxes.get(location).setValue(value);
        setState();
    }
    
    public Map<String, Box> freeBoxes() {
        Map<String, Box> free = new LinkedHashMap<>(); // Free Boxes
        
        for (Map.Entry<String, Box> entry : boxes.entrySet()) {
            String key = entry.getKey();
            Box box = entry.getValue();
            
            if (box.isFree()) {
                free.put(key, box);
            }
        }
        
        return free;
    }
}
