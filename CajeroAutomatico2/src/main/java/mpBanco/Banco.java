/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mpBanco;

import mnbanco.Persona;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Banco {
    public static void menuDeOpciones(){
        System.out.println("1. mostrar informacion");
        System.out.println("2. retirar");
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("NOMBRE: ");
        String nombre = input.next();
       System.out.println("APELLIDO: ");
        String apellido = input.next();
       System.out.println("MONTO: ");
        int monto = input.nextInt();
       
       menuDeOpciones();
       int opcion = input.nextInt();
       
       
       switch (opcion){
           case 1: 
               
       } 
        
        
       
        Persona persona1 = new Persona();   
       
        
    }
}
