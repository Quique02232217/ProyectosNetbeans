/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpClasePrincipal;

import java.util.Scanner;
import mnClasePrincipal.Pila;

/**
 *
 * @author User
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int pilaNumeros[] = new int[5];
        int tope = -1;
        int opcion ;

        do {
        System.out.println("----Menu----");
        System.out.println("1. Agregar");
        System.out.println("2. Eliminar");
        System.out.println("3. Mostrar todo");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
    
            switch (opcion) {
                case 1: 
                    if (pila.push(pilaNumeros, tope) == true) {
                        System.out.println("La pila esta llena");
                    } else {
                        tope = +1;
                        System.out.println("Ingrese un numero: ");
                        int numero = sc.nextInt();
                        pilaNumeros[tope] = numero;
                    }
                    break;
                case 2: 
                    pila.pop(pilaNumeros, tope);
                    
            }
        } while (opcion != 2);
    }

}
