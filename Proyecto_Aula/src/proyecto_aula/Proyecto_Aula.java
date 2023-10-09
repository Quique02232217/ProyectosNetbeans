/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/*
    Proyecto de aula Ciudad inteligente
*/
package proyecto_aula;
import java.io.*;
import java.util.Scanner;
import mnCiudadInteligente.Servicio;

public class Proyecto_Aula {
    /*declaracion de variables*/
    String res = "si"; 
    Scanner leer = new Scanner (System.in);
    Servicio s = new Servicio();
    
    public void ejecutar() throws IOException{
        /*donde ejecutamos y llamamos los otros paquetes */
        do{
            s.beneficios();
            System.out.println("\n¿Quiere digitar otra persona?");
            res = leer.nextLine(); /*preguntamos si quiere digitar otra persona, 
            en caso tal no, se cierra el programa*/
            System.out.println("\n\n");
        }while("si".equals(res));
    }
    
    public static void main(String[] args) throws IOException {
        
        Proyecto_Aula p = new Proyecto_Aula();
        p.ejecutar(); /*llamamos la función que ejecuta todo.*/
       System.out.println("\nSaliendo del programa, tenga buen dia");
        
    }
}
