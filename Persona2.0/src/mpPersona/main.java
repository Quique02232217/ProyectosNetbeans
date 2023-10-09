/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpPersona;

import java.util.Scanner;
import mnPersona.Persona;

/**
 *
 * @author User
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Sexo: ");
        String sexo = sc.next();
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        System.out.println("--------------");
        System.out.println("Longitud del DNI: ");
        int longitud = sc.nextInt();
        Persona persona1 = new Persona(nombre, sexo, edad, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        
        
        if(persona1.calcularIMC(peso, altura) < 20){
            System.out.println("Estas por debajo de tu peso ideal");
        }else if(persona1.calcularIMC(peso, altura) >= 20&&persona1.calcularIMC(peso, altura)<= 25){
            System.out.println("Esta en su peso ideal");
        }else if (persona1.calcularIMC(peso, altura) > 25){
            System.out.println("Tiene sobrepeso");
        }
        
        if(persona2.esMayorDeEdad(edad) == true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No eres menor de edad");
        }
        
        System.out.println("-----------------------------------");
        System.out.println(persona1.toString());
        System.out.println("DNI: "+persona1.generarDNI(longitud));
        
    }
    
}
