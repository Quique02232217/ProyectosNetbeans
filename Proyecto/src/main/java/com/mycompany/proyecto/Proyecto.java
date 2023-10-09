/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;


import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nom = entrada.nextLine();
        int ced = entrada.nextInt();
        String sex = entrada.nextLine();
        String Nac = entrada.nextLine();
        int ed = entrada.nextInt();
        
        Ciudadano c1 = new Ciudadano(nom, ed, ced, sex, Nac); 
    
        c1.mostrarDatos();
        
        
        
    }    
    
}
