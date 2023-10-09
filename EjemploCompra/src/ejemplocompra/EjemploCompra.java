/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocompra;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjemploCompra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PRECIO = 21.52;
        Compra compra = new Compra();
        System.out.println("Ingrese los datos: ");

        System.out.println("Id: ");
        int id = entrada.nextInt();
        System.out.println("Nombre: ");
        String nombre = entrada.next();
        
        Articulo articulo = new Articulo(nombre, PRECIO, id);

        
        if(articulo.getId()== 1 && articulo.getNombre() == "tv" ){
            compra.AgregarArticulos(articulo);
            articulo.toString();
        }else{
            System.out.println("Articulo no existe"
                    );
        
        }
        

    }

}
