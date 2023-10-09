/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpArrayListPractica;

import java.util.ArrayList;
import java.util.Scanner;
import mnArrayListPractica.Acciones;

/**
 *
 * @author User
 */
public class ArrayListPractica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Acciones objeto = new Acciones();
        int n;
        ArrayList<Integer> listaNumero = new ArrayList<>();

        int opcion;

        System.out.println("---OPCIONES---");
        System.out.println("1. Agregar");
        System.out.println("2. Borrar");
        System.out.println("3. Mostrar");
        System.out.println("4. salir");
        opcion = input.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Ingrese el numero que desee agregar: ");
                n = input.nextInt();
                objeto.agregarElemento(n, listaNumero);
                System.out.println("---OPCIONES---");
                System.out.println("1. Agregar");
                System.out.println("2. Borrar");
                System.out.println("3. Mostrar");
                System.out.println("4. salir");
                opcion = input.nextInt();
                break;
            case 2:
                System.out.println("Ingrese el numero que desee borrar: ");
                n = input.nextInt();
                objeto.borrarElemento(n, listaNumero);
                break;
            case 3:
                for (int i = 0; i < listaNumero.size(); i++) {

                    System.out.println("Elemento ---> " + objeto.mostrar(listaNumero, listaNumero.get(i)));

                }
                break;
            case 4:
                break;

            default:
                System.out.println("ERROR, NUMERO FUERA DEL RANGO");

        }

    }

}
