/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recoleccionmanzana;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RecoleccionManzana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10; //Numero de granja
        int p = 10;//Energia
        int[] Apples = new int[n];
        int[] Milk = new int[p];

        System.out.println("Menu");
        System.out.println("Estas en tu casa, dale a 1 para avanzar a la primera granja");
        int opcion = sc.nextInt();

        do {
            if (opcion == 1) {
                for (int i = 1; i < n; i++) {
                    System.out.println("Bienvenido a la granja " + i);
                    System.out.println("1. manzana");
                    System.out.println("2. leche");
                    int op = sc.nextInt();

                    if (p > 0) {
                        if (op == 1) {
                            Apples[i] = 1 + i;
                            Milk[i] = 1 - i;
                            p--;
                            System.out.println("---" + Milk[i]);
                            System.out.println("---" + Apples[i]);
                        } else if (op == 2) {
                            Milk[i] = 1 + i;
                            p++;

                            System.out.println("---" + Milk[i]);
                        }
                    }
                }
            }

        } while (p > 0);

    }

}
