/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array;
import java.util.*;
/**
 *
 * @author User
 */
public class Array {

    public static void main(String[] args) {
        ArrayList<Persona> listaPersona = new ArrayList();
        Scanner s = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        System.out.println("NOMBREs: ");
        String nom = s.nextLine();
        String nom2 = s.nextLine();
        System.out.println("APELLIDOs: ");
        String ape = s.nextLine();
        String ape2 = s.nextLine();
        System.out.println("EDADes: ");
        int ed = in.nextInt();
        int ed2 = in.nextInt();
        Persona persona = new Persona(nom, ape, ed);
        Persona persona2 = new Persona(nom2, ape2, ed2);
        
        listaPersona.add(persona);
        listaPersona.add(persona2);
        
        
        for(int i = 0; i < listaPersona.size();i++){
            System.out.println("PERSONAS: " + listaPersona.get(i).getApellido());
        
        }
        
        
        for(Persona perso:listaPersona){
            System.out.println("PERSONAS: " + perso.getNombre());
        
        }
    }
}
