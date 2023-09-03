/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author xdpor
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loro loro = new Loro("Juan", 2.5, 2);
        Tulcan tulcan = new Tulcan("Jorge", 4.6, 1);
        Pinguino pingui = new Pinguino("Pedro", 10, 4);
        
        System.out.println(loro.comer());
        System.out.println(loro.dormir());
        System.out.println(loro.volar());
        
        System.out.println("");
        
        System.out.println(tulcan.comer());
        System.out.println(tulcan.dormir());
        System.out.println(tulcan.volar());
        
        System.out.println("");
        
        System.out.println(pingui.comer());
        System.out.println(pingui.dormir());
        System.out.println(pingui.nadar());
        
    }
    
}
