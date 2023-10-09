/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practicaarreglo;

import java.util.*;

/**
 *
 * @author User
 */
public class PracticaArreglo {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        ArrayList listado = new ArrayList();

        System.out.println("INGRESE SU DATO: ");
        int dato = e.nextInt();

        listado.add(1020);
        listado.add(55);
        if (listado.contains(dato)) {
            
            System.out.println("YA ESTA EL DATO");
            System.out.println(listado);
           
            
        }else {
            listado.add(dato);
        
        }
        
        while (dato == listado.indexOf(0)){
            listado.add(dato);
            System.out.println(listado);
            break;
        }
    
    }
}
