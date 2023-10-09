package mpNotaEstudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mnNotaEstudiante.Asignatura;
import mnNotaEstudiante.Estudiante;
import mnNotaEstudiante.LeerEstudiante;

public class NotaEstudiante {

    public static void main(String[] args) throws Exception {
        int cantidadpersona = 1;
        int cantidadasig = 5;
        List<Asignatura> notas = new ArrayList();
        ArrayList<Estudiante> alumnos = new ArrayList();
        ArrayList<Double> notafisica = new ArrayList();
        ArrayList<Double> notaingles = new ArrayList();
        ArrayList<Double> notaestadistica = new ArrayList();
        ArrayList<Double> notacalculo = new ArrayList();
        ArrayList<Double> notaprogramacion = new ArrayList();
        ArrayList<Double> promedioGeneral = new ArrayList();
        LeerEstudiante e = new LeerEstudiante();
        e.leerNombre();
        
        for (int i = 0; i < cantidadpersona; i++) {
            Scanner n = new Scanner(System.in);
            System.out.println("NOMBRES: ");
            String nombreEstudiante = n.nextLine();
            Estudiante estudiante = new Estudiante(nombreEstudiante);
            
        }

        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i).getNombre());

        }
        for (int i = 0; i < cantidadasig; i++) {
            
            Scanner entradas = new Scanner(System.in);
            System.out.println("-----------------------------------------------------");

            System.out.println("MATERIAS: ");
            String nomAsignatura = entradas.next();

            System.out.println("NOTA DOCENTE: ");
            double D = entradas.nextFloat();

            System.out.println("NOTA PROYECTO AULA: ");
            double PA = entradas.nextFloat();

            System.out.println("NOTA AUTOEVALUACION: ");
            double Auto = entradas.nextFloat();

            Asignatura materias = new Asignatura(nomAsignatura, D, PA, Auto);

            notas.add(materias);

        }
        for (int a = 0; a < notas.size(); a++) {
            String notaM;
            System.out.println("-----------------------------------------------------");

            notaM = notas.get(a).getNombre();
            System.out.println("NOMBRE DE ASIGNATURA: " + notaM);
            double notaEva = notas.get(a).getNotaDocente();
            System.out.println("NOTA DOCENTE: " + notaEva);
            double notaPA = notas.get(a).getNotaProyectoDeAula();
            System.out.println("NOTA PROYECTO AULA: " + notaPA);
            double notaAu = notas.get(a).getNotaAutoevaluacion();
            System.out.println("NOTA AUTOEVALUACION: " + notaAu);
            double definitiva = ((notas.get(a).getNotaDocente() * 0.6) + (notas.get(a).getNotaAutoevaluacion() * 0.15) + (notas.get(a).getNotaProyectoDeAula() * 0.25));
            System.out.println("NOTA DEFINITIVA: " + definitiva);
            double promedio = (notas.get(a).getNotaDocente() + notas.get(a).getNotaAutoevaluacion() + notas.get(a).getNotaProyectoDeAula()) / 3;
            System.out.println("PROMEDIO: " + promedio);

            if (definitiva < 3.0) {
                System.out.println("REPROBO LA MATERIA");

            } else {
                System.out.println("APROBO LA MATERIA");

            }
            if (notas.size() == 1) {
                notafisica.add(definitiva);
                System.out.println("" + notafisica);
            } else if (notas.size() == 2) {
                notaingles.add(definitiva);
                System.out.println("" + notaingles);
            } else if (notas.size() == 3) {
                notaestadistica.add(definitiva);
                System.out.println("" + notaestadistica);
            } else if (notas.size() == 4) {

                notacalculo.add(definitiva);
                System.out.println("" + notacalculo);
            } else if (notas.size() == 5) {
                notaprogramacion.add(definitiva);
                System.out.println("/DEFINITIVAS: " + notaprogramacion);
            }
        }

    }

}
