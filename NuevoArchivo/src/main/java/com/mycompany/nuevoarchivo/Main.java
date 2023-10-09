/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevoarchivo;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        FileWriter archivo = null;
        PrintWriter escritor = null;
        
        try {
            archivo = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\NuevoArchivo");
            escritor = new PrintWriter(archivo);
            
            escritor.println("hola mundi");
            escritor.print("saludos");
        
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        
        }
        
    }
    
}
