/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lavadora;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Ensambladora implements Ensamblar{

    @Override
    public lavadoras toBuild(String marca) {
        return switch (marca) {
            case "Marca 1" -> new Marca1(marca);
            case "Marca 2" -> new Marca2(marca);
            default -> new Marca3(marca);
        };
    }
}
