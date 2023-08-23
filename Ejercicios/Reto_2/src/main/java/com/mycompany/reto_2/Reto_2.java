/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reto_2;

import java.util.Scanner;

/**
 *
 * @author xdpor
 */
public class Reto_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(2);        
        int choice;
        do {    
            System.out.println("Menú:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Mostrar contactos");
            System.out.println("5. Espacios libres");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            choice = scanner.nextInt();
            switch (choice) {
                    case 1 -> {
                        if (!agenda.isAgendaFull()) {
                            scanner.nextLine(); // Consume the newline left after nextInt()
                            System.out.print("Nombre del contacto: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Teléfono del contacto: ");
                            String telefono = scanner.nextLine();
                            agenda.addContact(nombre, telefono);
                        } else {
                            System.out.println("Agenda llena");
                        }
                    }
                    case 2 -> {
                        scanner.nextLine(); // Consume the newline left after nextInt()
                        System.out.print("Nombre del contacto a buscar: ");
                        String nombreBuscado = scanner.nextLine();
                        System.out.println(agenda.toFindContact(nombreBuscado));
                    }
                    case 3 -> {
                        scanner.nextLine(); // Consume the newline left after nextInt()
                        System.out.print("Nombre del contacto a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        System.out.println(agenda.deleteContact(nombreEliminar));
                    }
                    case 4 -> {
                        System.out.println("Contactos en la agenda:");
                        for (String contacto : agenda.toListContacts()) {
                            System.out.println(contacto);
                        }
                    }
                    case 5 -> {
                        System.out.println("Espacios disponibles: " + agenda.availableSpaces());                        
                    }
                    case 6 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida");
                }
            } while (choice != 6);
    }
}
