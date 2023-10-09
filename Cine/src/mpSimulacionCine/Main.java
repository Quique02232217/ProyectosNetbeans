/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpSimulacionCine;

import java.lang.reflect.Array;
import mnSimulacionCine.Cine;
import mnSimulacionCine.Espectador;
import mnSimulacionCine.Pelicula;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String NombreEspectador = "David"; 
        String NombreEspectador2 = "Laura";
        int EdadEspectador = 18;
        int EdadEspectador2 = 10;
        int precioE = 100;
        int precio = 10;
        String nombreP = "";
        int tiempo = 0;
        String[] Asientos = {"8A" ,"8B" ,"8C ","8D", "8E", "8F", "8G", "8H", "8I"};
        Espectador espectador = new Espectador(NombreEspectador, EdadEspectador, precioE);
        Espectador espectador1 = new Espectador(NombreEspectador2, EdadEspectador2, precio);
        
        Pelicula p1 = new Pelicula();
        Cine cine = new Cine();
        System.out.println(cine.mostrarNombrePelicula(nombreP, tiempo));
        
        
        if(espectador.getDinero() >= 90){
            for(int i = 0; i < Asientos.length;i++){
                
            }
        }
    }
    
}
