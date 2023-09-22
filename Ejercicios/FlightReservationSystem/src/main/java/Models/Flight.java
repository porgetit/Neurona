/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Flight {
    private final String flightNumber;
    private final String origin;
    private final String destination;
    private final LocalDateTime departureDateTime;
    private final LocalDateTime arrivalDateTime;
    private final List<BusinessChair> businessChairs;
    private List<EconomyChair> economyChairs;

    public Flight(LocalDateTime departureDateTime) {
        String tempFlightNumber = "AA";
        tempFlightNumber += String.valueOf(new Random().nextInt(100, 1000));
                
        this.flightNumber = tempFlightNumber;
        this.origin = "PEI (Pereira - A.I Matecaña)";
        this.destination = (String) new ArrayList<>() {{ // String casting due to avoid the "unchecked types" warning
            add("BOG - (Bogotá - A.I El Dorado)");
            add("CLO - (Cali - A.I Alfonso Bonilla Aragón");
            add("MDE - (Medellín - A.N Enrique Olaya Herrera");
            add("CTG - (Cartagena - A.I Rafael Nuñez");
        }}.get(new Random().nextInt(4));
        
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = this.departureDateTime.plus(new Random().nextInt(1, 4), ChronoUnit.HOURS);
        
        this.businessChairs = new ArrayList<>();
        businessChairs.add(new BusinessChair(1, "w")); // 'w' means window's chair
        businessChairs.add(new BusinessChair(2, "h")); // 'h' means hallway's chair
        businessChairs.add(new BusinessChair(3, "h"));
        businessChairs.add(new BusinessChair(4, "w"));
        businessChairs.add(new BusinessChair(5, "w"));
        businessChairs.add(new BusinessChair(6, "h"));
        businessChairs.add(new BusinessChair(7, "h"));
        businessChairs.add(new BusinessChair(8, "w"));
    }    
    
}
