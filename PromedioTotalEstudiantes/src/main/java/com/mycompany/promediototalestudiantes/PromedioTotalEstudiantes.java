/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.promediototalestudiantes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author VALERIN CARDENAS V2.0
 *
 */
public class PromedioTotalEstudiantes {

    public static void main(String[] args) {
        LectorDeArchivo nuevolectordearchivo;
        nuevolectordearchivo = new LectorDeArchivo();
        ArrayList<String> listaNombresEstudiantes;
        listaNombresEstudiantes = nuevolectordearchivo.leerArchivo();

        String[] nombresasignaturas = new String[5];
        nombresasignaturas[0] = "ESTADISTICA";
        nombresasignaturas[1] = "PROGRAMACION II";
        nombresasignaturas[2] = "INGLES II";
        nombresasignaturas[3] = "CALCULO INTEGRAL";
        nombresasignaturas[4] = "FISICA MECANICA Y ELECTRICA";

        Seccion grupoestudiantes = new Seccion();

        for (int i = 0; i < listaNombresEstudiantes.size(); i++) {
            String nombreactual = listaNombresEstudiantes.get(i);
            System.out.println("ESTUDIANTE:  " + nombreactual);

            Estudiante estudianteactual = new Estudiante();
            estudianteactual.setNombreestudiante(nombreactual);

            Asignatura[] listadeasignaturas = new Asignatura[nombresasignaturas.length];

            for (int a = 0; a < nombresasignaturas.length; a++) {
                String nombreasignatura = nombresasignaturas[a];
                listadeasignaturas[a] = crearasignatura(nombreasignatura);
            }

            estudianteactual.setListadeasignaturas(listadeasignaturas);
            grupoestudiantes.getListadeestudiantes().add(estudianteactual);

            System.out.println("EL PROMEDIO DEL ESTUDIANTE ES: "
                    + estudianteactual.obtenerNotapromedio());
        }

        System.out.println("EL PROMEDIO DE LA SECCION FUE DE:"
                + grupoestudiantes.calcularnotapromedio());

        System.out.println("LOS ESTUDIANTES APROBADOS DE LA SECCION 4 FUERON: "
                + grupoestudiantes.obtenerestudiantesaprobados());

        System.out.println("LOS ESTUDIANTES NO APROBADOS DE LA SECCION 4 FUERON: "
                + grupoestudiantes.obtenerestudiantesnoaprobados());

        escribirenexcel(grupoestudiantes, nombresasignaturas);
    }

    public static Asignatura crearasignatura(String nombreasignatura) {

        Asignatura asignaturaactual = new Asignatura();
        asignaturaactual.setNombreasignatura(nombreasignatura);

        boolean existenerrores = false;

        do {
            try {
                Scanner lector = new Scanner(System.in);

                System.out.println("ASIGNATURA: " + nombreasignatura);

                System.out.println("ingrese la nota de la valoracion docente:");

                float notavaloraciondocente = lector.nextFloat();
                asignaturaactual.setNotavaloraciondocente(notavaloraciondocente);

                System.out.println("ingrese la nota del proyecto de aula :");
                float notaproyectodeaula = lector.nextFloat();
                asignaturaactual.setNotaproyectodeaula(notaproyectodeaula);

                System.out.println("ingrese la nota de la autoevaluacion:");
                float notaautoevaluacion = lector.nextFloat();
                asignaturaactual.setNotaautoevaluacion(notaautoevaluacion);
                existenerrores = false;

            } catch (Exception e) {
                existenerrores = true;
                System.out.println("EL VALOR A INGRESAR DEBE SER UN NUMERO ENTRE 0.0 Y 5.0");
            }
        } while (existenerrores);

        if (asignaturaactual.esaprobado() == true) {
            System.out.println("EL ESTUDIANTE APPROBO LA ASIGNATURA");
        } else {
            System.out.println("EL ESTUDIANTE NO APPROBO LA ASIGNATURA");
        }

        return asignaturaactual;
    }

    //ESCRIBIR EN EXCEL
    public static void escribirenexcel(
            Seccion grupodeestudiantes, String[] nombresasignaturas) {

        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Persons");

        Row header = sheet.createRow(0);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFFont font = ((XSSFWorkbook) workbook).createFont();
        font.setFontName("Arial");
        font.setFontHeightInPoints((short) 16);
        font.setBold(true);
        headerStyle.setFont(font);

        //creacion de la cabecera del excel
        sheet.setColumnWidth(0, 6000);
        Cell headerCell = header.createCell(0);
        headerCell.setCellValue("ESTUDIANTE");
        headerCell.setCellStyle(headerStyle);

        for (int i = 0; i < nombresasignaturas.length; i++) {
            String asignaturaactual = nombresasignaturas[i];

            sheet.setColumnWidth(1 + i, 6000);
            headerCell = header.createCell(1 + i);
            headerCell.setCellValue(asignaturaactual);
            headerCell.setCellStyle(headerStyle);
        }

        sheet.setColumnWidth(1 + nombresasignaturas.length, 6000);
        headerCell = header.createCell(1 + nombresasignaturas.length);
        headerCell.setCellValue("PROMEDIO");
        headerCell.setCellStyle(headerStyle);

        //contenido de la tabla
        CellStyle style = workbook.createCellStyle();
        style.setWrapText(true);

        ArrayList<Estudiante> listadeestudiantes
                = grupodeestudiantes.getListadeestudiantes();

        for (int i = 0; i < listadeestudiantes.size(); i++) {
            Estudiante estudianteactual = listadeestudiantes.get(i);
            Asignatura[] listadeasignaturas = estudianteactual.getListadeasignaturas();
            Row row = sheet.createRow(1 + i);

            Cell cell = row.createCell(0);
            cell.setCellValue(estudianteactual.getNombreestudiante());
            cell.setCellStyle(style);

            for (int a = 0; a < nombresasignaturas.length; a++) {
                String asignaturaactual = nombresasignaturas[a];
                String estadodeasignatura = "";

                for (int b = 0; b < listadeasignaturas.length; b++) {
                    Asignatura asignaturaestudiante = listadeasignaturas[b];
                    if (asignaturaestudiante.getNombreasignatura().equalsIgnoreCase(asignaturaactual)) {
                        boolean esaprobado = asignaturaestudiante.esaprobado();

                        if (esaprobado) {
                            estadodeasignatura = "APROBADO";
                        } else {
                            estadodeasignatura = "NO APROBADO";
                        }
                        break;
                    }
                }

                cell = row.createCell(1 + a);
                cell.setCellValue(estadodeasignatura);
                cell.setCellStyle(style);
            }

            cell = row.createCell(1 + nombresasignaturas.length);
            cell.setCellValue(estudianteactual.obtenerNotapromedio());
            cell.setCellStyle(style);
        }

        //el promedio de la seccion
        Row row = sheet.createRow(3 + listadeestudiantes.size());

        Cell cell = row.createCell(0);
        cell.setCellValue("PROMEDIO DE LA SECCION");
        cell.setCellStyle(headerStyle);
        
        cell = row.createCell(1);
        cell.setCellValue(grupodeestudiantes.calcularnotapromedio());
        cell.setCellStyle(style);
        
        //se crea el archivo de destido y se escribe el excel
        File dirreccionactual = new File(".");
        String path = dirreccionactual.getAbsolutePath();
        String fileLocation = path.substring(0, path.length() - 1) + "LISTAFINAL-ESTUDIANTES.xlsx";

        //flujo de salida
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(fileLocation);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PromedioTotalEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PromedioTotalEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
