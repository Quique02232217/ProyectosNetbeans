/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mnVerificacion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Verificacion {

    String nombre;
    int codigo, semestre;
    double promedio;

    public Verificacion(String nombre, int codigo, int semestre, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.semestre = semestre;

    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public double getPromedio() {
        return promedio;
    }

public void mostrarDatos(){
    Scanner nom, cod, prom, sem;
    
    
    

}

}
