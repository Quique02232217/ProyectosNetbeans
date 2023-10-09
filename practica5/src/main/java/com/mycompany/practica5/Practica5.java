/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Practica5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float nota1, nota2, nota3, suma;
       
        
        System.out.println("digite sus notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        suma = nota2 + nota3 + nota1;
        System.out.println("sus notas son: "+suma);
        
        
        
    }
}
