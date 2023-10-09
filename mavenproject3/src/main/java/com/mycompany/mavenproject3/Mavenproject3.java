/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Mavenproject3 {
    
    public static void main(String[] args) {
    
    ArrayList <String> nombres = new ArrayList();
    String nom;
    Scanner n = new Scanner(System.in);
    nom = n.nextLine();
    
    nombres.add(nom);
        System.out.println(nombres);
    
    
    }
}
