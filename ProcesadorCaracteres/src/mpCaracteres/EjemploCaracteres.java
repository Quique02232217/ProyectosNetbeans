package mpCaracteres;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.logging.Level;
import java.util.logging.Logger;

//Importación de una clase del módulo de datos
import mdCaracteres.Data;

//Importación clases del módulo de negocio
import mnCaracteres.Caracter;
import mnCaracteres.Parrafo;

/**
 *
 * @author Emerson
 */
public class EjemploCaracteres {

    public static void main(String[] args) {

        //Crea una instancia de la clase Data
        Data objData = new Data();
        
        String contenidoTextoProcesar = "";
        
        try {
            //Lectura de datos desde un archivo plano
            contenidoTextoProcesar = objData.getFileContent("contenido.txt");
            
            //Lectura desde un método con información estática en una variable
            //contenidoTextoProcesar = objData.getContent();
            
        } catch (Exception ex) {
            System.out.println("Error:" + ex.getMessage());
        }        
        
        //Crea una instancia de la Clase Parrafo
        Parrafo objParrafo = new Parrafo();
        
        if (!("".equals(contenidoTextoProcesar))){
            //Se asigna el contenido
            objParrafo.asignarContenido(contenidoTextoProcesar);
            
            //Se procesa el contenido
            objParrafo.recorrerDetectarCaracter();
        
            //Se presentan los resultados de ocurrencias
            System.out.println(objParrafo.retornarEstadisticas());
        }
    }
}
