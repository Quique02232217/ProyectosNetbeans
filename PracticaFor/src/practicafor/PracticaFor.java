/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicafor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PracticaFor {

    /**
     * @param args the command line arguments
     */
    //<>
    public static void main(String[] args) {
       ArrayList<Integer> numero = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
       
       int n = 0;
        int num = input.nextInt();
           
       do{
           if (num < 0){
               System.out.println("El numero es menor a 0");
           }else if(num > 0){
               System.out.println("El numero es mayor a 0");
           }else if (num == 0){
               System.out.println("Es igual a cero");
           }
           
           
       }while (num != 0);
    
    
        
       
       
       
      
        
        


    }
}
