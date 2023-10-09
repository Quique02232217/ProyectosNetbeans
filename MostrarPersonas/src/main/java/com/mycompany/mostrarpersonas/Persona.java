/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mostrarpersonas;

/**
 *
 * @author User
 */
public class Persona {
    private String nombre, apellido, genero;
    private int edad;

    public Persona(String nombre , String apellido, String genero, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    
    
    }
    
    public String getNombre(){
        return nombre;
    
    }
    public String getApellido(){
        return apellido;
    
    }
    public String getGenero(){
        return genero;
    }
    public int getEdad(){
        return edad;
    }
    
    
    


}
