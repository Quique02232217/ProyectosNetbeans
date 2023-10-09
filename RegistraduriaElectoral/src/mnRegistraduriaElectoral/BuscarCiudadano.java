/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnRegistraduriaElectoral;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static mpRegistradurialectoral.RegistraduriaElectoral.menuCiudadano;
import static mpRegistradurialectoral.RegistraduriaElectoral.salir;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author User
 */
public class BuscarCiudadano {
    public void mostrarDatosCiudadano() {
        Workbook libro = new XSSFWorkbook();
        final String nombreArchivo = "DatosCiudadanos.xlsx";
        Sheet hoja = libro.createSheet("Hoja 1");
        Scanner entrada = new Scanner(System.in);
        DatosCiudadano mi_ciudadano = new DatosCiudadano();
        int opcion = 0;
        int indiceFila = 0;
        
        do {
            File directorioActual = new File(".");
        String ubicacion = directorioActual.getAbsolutePath();
        String ubicacionArchivoSalida = ubicacion.substring(0, ubicacion.length() - 1) + nombreArchivo;
        FileOutputStream outputStream;
            try {
                   
            outputStream = new FileOutputStream(ubicacionArchivoSalida);
            libro.write(outputStream);
            libro.close();
            System.out.println("Libro de personas guardado correctamente");
    
                menuCiudadano();
    
                opcion = entrada.nextInt();
                System.out.println("");
                Row fila = hoja.createRow(indiceFila);
                switch (opcion) {

                    case 1: {
                        int per;
                        entrada.nextLine();
                        System.out.println("-------------");
                        System.out.println("DIGITE EL NUMERO DE IDENTIFICACION: ");
                        per = entrada.nextInt();
                        Ciudadano ciudadano = mi_ciudadano.buscarCiudadano(per);
                        ArrayList <Ciudadano> agregarCiudadano = new ArrayList<>();
                        if (ciudadano != null) {
                            
                            if (ciudadano.getEdad() < 18) {
                                System.out.println("NO SE PUEDE DAR ESTA INFORMACION SIN UN PERMISO");

                            } else {
                                System.out.println("NOMBRE: " + ciudadano.getNombre() + "\nFECHA DE EXPEDICION DEL DOCUMENTO: " + ciudadano.getFechaDeExpedicion() + "\nNUMERO DE CEDULA: " + ciudadano.getIdentificacion() + "\nEDAD: " + ciudadano.getEdad()
                                        + "\nRELIGION: " + ciudadano.getReligion() + "\nSALUD: " + ciudadano.getSalud() + "\nLUGAR DE NACIMIENTO: "
                                        + ciudadano.getDireccionlugardenacimiento());
                                agregarCiudadano.add(ciudadano);
                                
                                
                                for (int i = 0; i < agregarCiudadano.size();i++ ){
                                    Ciudadano c = agregarCiudadano.get(i);
                                    Cell celda = fila.createCell(i);
                                    celda.setCellValue(ubicacion);
                                    indiceFila++;
                                
                                }
                                
            
    
                            
                            }

                        }
                        break;
                    }

                }
                break;

            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.err.println("ERROR");

            } catch (FileNotFoundException ex) {
            System.out.println("Error de filenotfound");
        } catch (IOException ex) {
            System.out.println("Error de IOException");
        } catch (NoClassDefFoundError e) {
            System.out.println("Excel");
        }
        } while (opcion != 5);
        salir();

    }
    
}
