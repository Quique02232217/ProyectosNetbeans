package com.mycompany.ejercicio;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num1, num2, num3, suma;
        System.out.println("escribe el numero: ");
        num1 = entrada.nextInt();
        System.out.println("escribe el numero: ");
        num2 = entrada.nextInt();
        System.out.println("escribe el numero: ");
        num3 = entrada.nextInt();
        suma = num1 + num2+ num3;
        System.out.println("tu suma fue de: "+suma);
    }     
      
}
