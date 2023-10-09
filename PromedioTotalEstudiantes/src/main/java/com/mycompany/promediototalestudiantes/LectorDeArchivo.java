/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promediototalestudiantes;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author VALERIN CARDENAS V
 */
public class LectorDeArchivo {

    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;

    public ArrayList<String> leerArchivo() {
        ArrayList<String> lineasdeltexto = new ArrayList<>();

        try {
            // Apertura del texto y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("C:\\Users\\VALERIN CARDENAS V\\Documents\\listado-seccion4.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del texto
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasdeltexto.add(linea);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return lineasdeltexto;
    }
}
