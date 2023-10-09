/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpPersonan;

import java.util.*;
import mnPersonan.Personan;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        System.out.println("INGRESE LOS DATOS: ");
        System.out.println("NOMBRE: ");
        String nombre = e.nextLine();
        System.out.println("EDAD: ");
        int edad = e.nextInt();

        System.out.println("SEXO: ");
        String sexo = e.nextLine();
        e.nextLine();

        System.out.println("PESO: ");
        double peso = e.nextFloat();
        e.nextFloat();
        System.out.println("ALTURA: ");
        double altura = e.nextFloat();
        System.out.println("\n");

        Personan persona = new Personan(nombre, sexo, edad, peso, altura);
        Personan persona2 = new Personan();
        persona2.setNombre("rafael");
        persona2.setPeso(82.2);
        persona2.setSexo("M");
        persona2.setAltura(1.75);
        persona2.setEdad(17);

        Personan persona3 = new Personan(nombre, edad, sexo);
        Random r = new Random();
        persona.calcularIMC(peso);
        persona.generaDNI(edad, r);
        System.out.println(persona2);

        System.out.println(" DNI " + persona.generaDNI(edad, r));
        persona.toString();

    }
}
