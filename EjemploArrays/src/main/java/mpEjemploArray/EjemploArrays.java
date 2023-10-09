package mpEjemploArray;

import java.util.Scanner;


public class EjemploArrays {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String nombreproductos[] = new String[10];
        double preciosproductos[] = new double[10];
        
        
        for(int i = 0 ; i < nombreproductos.length && i < preciosproductos.length;i++){
            System.out.println("***************************************************");
            System.out.println("Escriba el nombre del producto: ");
            String nombre = keyboard.next();
            System.out.println("Escriba el precio de: " + nombre);
            double precio = keyboard.nextDouble();
        
            nombreproductos[i] = nombre;
            preciosproductos[i] = precio;
        }
        
        for(int a = 0 ; a < nombreproductos.length && a < preciosproductos.length;a++){
            System.out.println(a +". Nombre del producto ---> " + nombreproductos[a] + " / Precio ---> " + preciosproductos[a]);
           
        }
        
        

    }
}
