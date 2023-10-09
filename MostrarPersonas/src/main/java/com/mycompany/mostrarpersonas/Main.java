/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mostrarpersonas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int cantidadpersona = 1;
        ArrayList<Persona> personas = new ArrayList();

        for (int i = 0; i < cantidadpersona; i++) {
            Scanner e = new Scanner(System.in);
            System.out.println("INGRESE LOS DATOS " + (i + 1) + ":");
            System.out.println("NOMBRE: ");
            String nombre = e.nextLine();
            System.out.println("APELLIDO: ");
            String apellido = e.nextLine();
            System.out.println("GENERO(M/F): ");
            String genero = e.next().toUpperCase();
            System.out.println("EDAD: ");
            int edad = e.nextInt();
            System.out.println("\n");

            Persona persona1 = new Persona(nombre, apellido, genero, edad);
            personas.add(persona1);
        }

        retornarNombreGenero(personas);
        retornarPromedioEdad(personas);
        retornarGeneroMasculino(personas);
        retornarGeneroFemenino(personas);

    }

    public static void retornarNombreGenero(ArrayList<Persona> personas) {
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("NOMBRE: " + personas.get(i).getNombre() + "APELLIDO: " + personas.get(i).getApellido() + "GENERO: " + personas.get(i).getGenero());
        }

    }

    public static void retornarPromedioEdad(ArrayList<Persona> personas) {
        double sumaEdades = 0.0;
        double promedio;
        for (int i = 0; i < personas.size(); i++) {
            sumaEdades = sumaEdades + personas.get(i).getEdad();

        }
        promedio = sumaEdades / personas.size();
        System.out.println("PROMEDIO DE EDADES: " + promedio);
    }

    public static void retornarGeneroMasculino(ArrayList<Persona> personas) {
        int cantidadmasculino = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getGenero().equals("M")) {
                cantidadmasculino += 1;

            }

        }
        System.out.println("PERSONAS DE GENERO MASCULINO: " + cantidadmasculino);
    }

    public static void retornarGeneroFemenino(List<Persona> personas) {
        int cantidadfemenino = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getGenero().equals("F")) {
                cantidadfemenino += 1;

            }

        }
        System.out.println("PERSONAS DE GENERO FEMENINO: " + cantidadfemenino);

    }
}
