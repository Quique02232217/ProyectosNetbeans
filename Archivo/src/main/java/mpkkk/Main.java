/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpkkk;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner f = new Scanner(System.in);
        int dato;
        System.out.println("ESCRIBE: ");
        dato = f.nextInt();

        if (dato == 1) {
            
                FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\lili\\ARTICULOSTIENDA.txt");
                BufferedReader br = new BufferedReader(fr);

                String cadena;

                while ((cadena = br.readLine()) != null) {
                    System.out.println("" + cadena);

                }

            
        }else{
            System.out.println("SAPA");
        
        }

    }

}

