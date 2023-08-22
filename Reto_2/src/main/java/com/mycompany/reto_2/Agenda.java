/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xdpor
 */
public class Agenda {
    private final int capacity;
    private final List<Contacto> contacts = new ArrayList<>();
    
    public Agenda() {
        capacity = 10;
    }
    
    public Agenda(int maxContacts) {
        capacity = maxContacts;
    }
    
    public void addContact(String nombre, String telefono) {
        if (isAgendaFull()) {
            System.out.println("Agenda llena");
            return;
        }
        
        if (doesContactExist(nombre)) {
            System.out.println("Contacto existente");
            return;
        }
        
        Contacto new_contact = new Contacto(nombre, telefono);
        contacts.add(new_contact);
    }
    
    public boolean doesContactExist(String nombre) {
        for (Contacto contacto : contacts) {
            if (nombre.equals(contacto.getNombre())) {
                return true;
            }
        }
        
        return false;
    }
    
    public List<String> toListContacts() {
        List<String> listOfContacts = new ArrayList<>();
        
        for (Contacto contacto : contacts) {
            String foundContact = "%s: %s".formatted(contacto.getNombre(), contacto.getTelefono());
            listOfContacts.add(foundContact);
        }
        
        return listOfContacts;
    }
    
    public String toFindContact(String nombre) {
        for (Contacto contacto : contacts) {
            if (nombre.equals(contacto.getNombre())) {
                return contacto.getNombre() + ": " + contacto.getTelefono();
            }
        }
        
        return "Contacto no encontrado";
    }
    
    public String deleteContact(String nombre) {
        if (doesContactExist(nombre)) {
            int index = 0;
            
            for (Contacto contacto : contacts) {
                if (!nombre.equals(contacto.getNombre())) {
                    index += 1;
                } else {
                    break;
                }
            }
            
            contacts.remove(index);
            
            return "Contacto eliminado";
        }
        
        return "Contacto no encontrado";
    }
    
    public boolean isAgendaFull() {
        return availableSpaces() == 0;
    }
    
    public int availableSpaces() {
        return capacity - contacts.size();
    }
}
