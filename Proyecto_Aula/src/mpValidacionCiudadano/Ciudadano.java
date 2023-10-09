/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Proposito de este archivo: validar los ciudadanos*/

package mpValidacionCiudadano;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Ciudadano {
    
    /*declaramos las variables a utilizar.*/
ArrayList<String> personas  = new ArrayList<>(); 
    String[] nombres;
    String[] fNacimiento;
    String[] correo;
    String[] sexo;
    int[] edades;
    int[] ccs;
    
    Scanner leer = new Scanner (System.in);
    
    /*datos individuales de la persona (se usan para imprimir al final)*/
    String nombreP;
    int edadP;
    int idP;
    String email, sex, nacimiento;
    
    public Ciudadano(){ /*constructor: no se usa*/
        //System.out.println("Prueba");
    }
    
    public boolean validarRegistro(String nombre) throws IOException{ /*si está registrado o no en la base de datos*/
        for (int x = 0; x < personas.size(); x++){
            if (nombres[x].equals(nombre)){ /*asignamos los valores 
                cuando se encuentra la persona a buscar, si no, retorna falso*/
                nombreP = nombres[x];
                edadP = edades[x];
                idP = ccs[x];
                email = correo[x];
                sex = sexo[x];
                nacimiento = fNacimiento[x];
                return true;
            }
        }
        return false;
    }
    
    /*en caso tal queramos crear un archivo (no se usa porque ya se tiene 
    un archivo)*/
    public void crearArchivo (String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            System.out.println("[-] No se encontro el diccionario en la ruta estipulada, porfavor cambien la ruta o coloque el archivo en la ruta estipulada.");
            System.exit(0);
        }
    }
    
    /*leemos el archivo y añadimos la informacion a un ArrayList*/
    public void leerArchivo(String ruta)throws IOException{ 
        try {
            File names = new File(ruta);
            FileReader frNames = new FileReader(names);
            BufferedReader bfNames = new BufferedReader(frNames);

            String name;

            while ((name = bfNames.readLine()) != null) {
                personas.add(name);
                //System.out.println(name);
            }            
        } catch (FileNotFoundException ex) {
            System.out.println("[-] No se encontro el diccionario en la ruta estipulada, porfavor cambien la ruta o coloque el archivo en la ruta estipulada.");
            System.exit(0);
        }
    }
    public void separar(){ /*separamos la información del arrayList*/
        nombres = new String[personas.size()];
        edades = new int[personas.size()];
        correo = new String[personas.size()];
        sexo = new String[personas.size()];
        fNacimiento = new String[personas.size()];
        ccs = new int[personas.size()];
        
        for(int i=0; i<personas.size(); i++){
            String aux = personas.get(i); /*Joan Zarzalejo Jima, 8, 688255600, F, 21/03/2013*/
            nombres[i] = aux.split(";")[1];
            correo[i] = aux.split(";")[2];
            sexo[i] = aux.split(";")[4];
            edades[i] = Integer.parseInt(aux.split(";")[3]);
            fNacimiento[i] = aux.split(";")[5];
            ccs[i] = Integer.parseInt(aux.split(";")[6]);
        }
    }
    
    /*En caso tal queramos imprimir información del archivo*/
    public void imprimir(){
        System.out.println("\nNOMBRE: "+ nombreP +"\nSexo: "+ sex +"\nFecha de nacimiento: "+ nacimiento +"\nEDAD: " + edadP + "\nIDENTIFICACION: "+ idP + "\nCorreo: " + email);

    }
}
