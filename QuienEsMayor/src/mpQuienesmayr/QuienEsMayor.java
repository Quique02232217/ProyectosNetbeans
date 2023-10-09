/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpQuienesmayr;

import java.util.Scanner;
import mnQuienesmayor.EdadMayor;
import mnQuienesmayor.Persona;

/**
 *
 * @author User
 */
public class QuienEsMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombrePersona1 = "camilo";
        int edadPersona1 = 12;
        
        String nombrePersona2 = "maria";
        int edadPersona2 = 20;
        
        String nombrePersona3 = "julia";
        int edadPersona3 = 16;
        
        Persona p1 = new Persona(nombrePersona1, edadPersona1); 
        Persona p2 = new Persona(nombrePersona2, edadPersona2); 
        Persona p3 = new Persona(nombrePersona3, edadPersona3); 
        
        
        
        
        Persona personas[] ={p1, p2, p3};
        
        System.out.println("La edad mayor es: " + EdadMayor.personaMayor(personas));
    }
    
}
