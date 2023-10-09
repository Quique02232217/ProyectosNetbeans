/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mdCaracteres;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Emerson
 */
public class Data {

    public Data() {
    }
    
    public List<String> retornarAlfabeto(){
        List<String> alfabeto = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z");
        
        return alfabeto;
    }
    
    public List<String> retornarNumeros(){
        List<String> numeros = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
        
        return numeros;
    }
    
    public List<String> retornarSignosPuntuacion(){
        List<String> signos = Arrays.asList("!","¡","'",",",";",":",".","¿","?");
        
        return signos;
    }
    
    public String getContent(){
        String contenido = "Publicar el proyecto Netbeans con la codificación en Java empleando programación orientada a objetos que permite leer un párrafo y generar como salida un conteo de la cantidad de ocurrencias de cada caracter (letra, número, símbolo) que se encuentra.";
        return contenido;
    }
    
    public String getFileContent(String fileFullName) throws IOException, Exception{
        String contenido = "";
        String contenidoArchivo;
        
        try {
            FileReader f = new FileReader(fileFullName);
            BufferedReader b = new BufferedReader(f);
            
            while ((contenidoArchivo = b.readLine()) != null){
                contenido += contenidoArchivo; 
            }
        } catch (FileNotFoundException ex) {
            throw new Exception(ex.getMessage());
        }
        return contenido;
    }

}
