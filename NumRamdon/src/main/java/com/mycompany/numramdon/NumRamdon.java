/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.numramdon;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NumRamdon {

    public static void main(String[] args) {
        int numero, aleatorio, contador;
        Scanner n = new Scanner(System.in);
        aleatorio = (int) (Math.random() * 100);
        System.out.println(aleatorio);
        System.out.println("Ingresa un numero: ");
        numero = n.nextInt();

        do{
        
        if (aleatorio  > numero) {
            
            System.out.println("Aleatorio: "+aleatorio+" > "+"Numero: "+numero);

        }else{
            System.out.println("Aleatorio: "+aleatorio+" < "+"Numero: "+numero);
        
        }
        break;
        }while(aleatorio != numero);
        
        
        
    
    
    }
    
}

