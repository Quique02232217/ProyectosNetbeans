package com.mycompany.senten;

import java.util.Scanner;

public class Senten {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int dato;
       
       System.out.println("Escribe un numero del 1 al 5: ");
       dato = entrada.nextInt();
       
       switch (dato){
           case 1: System.out.println("Es el numero 1");
                    break;
           
        case 2: System.out.println("es el numero 2");
                    break;
          case 3: System.out.println("es el numero 2");
                    break;
          case 4: System.out.println("es el numero 2");
                    break;
          case 5: System.out.println("es el numero 2");
                    break;
          default : System.out.println("VAYA Y COMA MIERDA");
       }
    }
}
