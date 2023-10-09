package com.mycompany.arreglounidimensional;

import java.util.Scanner;

public class ArregloUnidimensional {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numeros[] = new int[10];
        double promedio = 0;
        //Agregar numeros
        System.out.println("*****Agrega los datos al arreglo*****");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero --> " + (i + 1));
            int numero = keyboard.nextInt();
            System.out.println("Ingrese la posicion donde quiere que vaya al numero (0-9)");
            int posicion = keyboard.nextInt();
            numeros[posicion] = numero;
        }

        System.out.println("------NUMEROS DENTRO DEL ARREGLO------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("--------------------------------------");
            System.out.println("POSICION ---> " + i + ":" + numeros[i]);
            

        }
        //Calcular promedio de numeros
        for (int i = 0; i < numeros.length; i++) {
            promedio += numeros[i];
        }
        System.out.println("--------------------------------------");
        System.out.println("PROMEDIO DE NUMEROS ---> " + promedio / numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("-------------------------------------");
            System.out.println("Ingrese la posicion que quiera saber: ");
            int posicion = keyboard.nextInt();

            if (posicion > numeros.length) {
                System.out.println("El numero se excede al tamaño del arreglo");
            } else {
                System.out.println("------------------------------------------");
                System.out.println("numero ---> " + numeros[posicion]);
                System.out.println("------------------------------------------");
            }
            break;
        }
        //Borrar elementos pidiendole la posicion
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese la posicion donde quiere que borre el numero (0-9)");
            int posicion = keyboard.nextInt();
            numeros[posicion] = 0;

            break;
        }
        System.out.println("ARREGLO SIN EL NUMERO QUE QUISISTES ELIMINAR SEGUN LA POSICION");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("--------------------------------------");
            System.out.println("POSICION ---> " + i + ":" + numeros[i]);
        
        }
        //Borrar todos los elementos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
        System.out.println("------------------------------------------");
        System.out.println("TODOS LOS ELEMENTOS DEL ARREGLO BORRADOS");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("--------------------------------------");
            System.out.println("POSICION ---> " + i + ":" + numeros[i]);
        

    }
        System.out.println("SUBIENDO EN LA CONSOLA PUEDE VER LO QUE SE HIZO");
}
}