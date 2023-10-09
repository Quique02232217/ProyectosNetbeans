/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpPersona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mnPersona.Persona;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Camila", "vargas", 25);
        Persona p2 = new Persona("Camilo", "meza", 30);
        Persona p3 = new Persona("Andrea", "vanegas", 24);
        List<Persona> lista = Arrays.asList(p1, p2, p3);
        
        
        
        
        for (Persona p : lista){
            System.out.println("Nombre: " +p.getNombre()+" Apellido: "+p.getApellido()+" Edad: "+p.getEdad());
            
        
        }
    
    
    
    
    }
    
    
    
}
