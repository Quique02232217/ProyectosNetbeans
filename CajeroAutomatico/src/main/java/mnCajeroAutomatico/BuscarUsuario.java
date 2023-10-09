package mnCajeroAutomatico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BuscarUsuario {

    ArrayList<String> persona = new ArrayList();
    static Hashtable<String, Persona> listapersonas = new Hashtable<>();

    public Persona buscarPersona(String nombre) {
        Persona persona;

        if (listapersonas.containsKey(nombre)) {
            persona = listapersonas.get(nombre);

            System.out.println("PERSONA ENCONTRADO");

            return persona;

        } else {
            System.out.println("PERSONA NO ENCONTRADO");
        }
        return null;

    }

    public void cargarInformacionPersonas() {
        try {

            File data = new File("basePersonas.txt");
            FileReader frData = new FileReader(data);
            BufferedReader bfData = new BufferedReader(frData);

            String auxData;

            while ((auxData = bfData.readLine()) != null) {
                persona.add(auxData);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR, NO SE ENCUENTRA EL ARCHIVO.");
        } catch (IOException ex) {
            System.out.println("ERROR EN LA EJECUCION DEL CODIGO.");

        }

        for (int i = 0; i < persona.size(); i++) {
            String nombre = persona.get(i).split(";")[0];
            String apellido = persona.get(i).split(";")[1];
            String usuario = persona.get(i).split(";")[2];
            int contraseña = Integer.parseInt(persona.get(i).split(";")[3]);
            int saldo = Integer.parseInt(persona.get(i).split(";")[4]);

            Persona persona = new Persona(nombre, apellido, usuario, contraseña, saldo);

            listapersonas.put(nombre, persona);

        }
    }

}
