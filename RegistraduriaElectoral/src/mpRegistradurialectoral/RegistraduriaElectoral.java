/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpRegistradurialectoral;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import mnRegistraduriaElectoral.BuscarCiudadano;
import mnRegistraduriaElectoral.Ciudadano;
import mnRegistraduriaElectoral.DatosCiudadano;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class RegistraduriaElectoral {

    public static void menuCiudadano() {
        System.out.println("ELIGE UNA OPCION: ");
        System.out.println("1. MOSTRAR INFORMACION PERSONA");
        System.out.println("2.LLLL");
        System.out.println("3.LLLLJ");
    }
    public static void salir(){
        System.out.println("---------");
        System.out.println("SALIENDO...");
        System.out.println("----------");
    
    
    }
    public static void main(String[] args) {
        DatosCiudadano c = new DatosCiudadano();
        BuscarCiudadano b = new BuscarCiudadano();
        
        c.cargarInformacionCiudadanos();
        b.mostrarDatosCiudadano();
    }
    
}
