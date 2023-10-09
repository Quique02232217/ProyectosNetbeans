/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnRegistraduriaElectoral;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author User
 */
public class DatosCiudadano {
     ArrayList<String> personas = new ArrayList();
    static Hashtable<Integer, Ciudadano> listapersona = new Hashtable<>();

    public Ciudadano buscarCiudadano(int identificacion) {
        Ciudadano persona;

        if (listapersona.containsKey(identificacion)) {
            persona = listapersona.get(identificacion);

            System.out.println("PERSONA ENCONTRADO");

            return persona;

        } else {
            System.out.println("PERSONA NO ENCONTRADO");
        }
        return null;

    }

    public void cargarInformacionCiudadanos() {
        try {

            File data = new File("baseDatos.txt");
            FileReader frData = new FileReader(data);
            BufferedReader bfData = new BufferedReader(frData);

            String auxData;

            while ((auxData = bfData.readLine()) != null) {
                personas.add(auxData);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR, NO SE ENCUENTRA EL ARCHIVO.");
        } catch (IOException ex) {
            System.out.println("ERROR EN LA EJECUCION DEL CODIGO.");
        }

        for (int i = 0; i < personas.size(); i++) {
            String nombre = personas.get(i).split(";")[0];
            String apellido = personas.get(i).split(";")[1];
            int edad = Integer.parseInt(personas.get(i).split(";")[2]);
            String fechaDeExpedicion = personas.get(i).split(";")[3];
            int identificacion = Integer.parseInt(personas.get(i).split(";")[4]);
            String religion = personas.get(i).split(";")[5];
            String salud = personas.get(i).split(";")[6];
            String direcciondenacimiento = personas.get(i).split(";")[7];
            

            Ciudadano persona = new Ciudadano(nombre, apellido, edad, fechaDeExpedicion, identificacion,
                    religion, salud, direcciondenacimiento);

            listapersona.put(identificacion, persona);

        }
    }

    
}
