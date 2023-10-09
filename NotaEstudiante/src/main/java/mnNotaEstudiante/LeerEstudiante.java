package mnNotaEstudiante;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerEstudiante {

    String nombre;
    ArrayList<String> nombres = new ArrayList();

    public String leerNombre() throws FileNotFoundException, IOException {

        BufferedReader br;
        try {
            File archivo = new File("SeccionNombre.txt");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                nombres.add(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
            e.printStackTrace();
        }
        

        return nombre;

    }

}
