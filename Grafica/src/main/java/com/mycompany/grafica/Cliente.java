/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafica;

/**
 *
 * @author User
 */
public class Cliente implements Imprimable{

    private String rut, nombre;

    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }
    
    public String setRut(){
        return rut;
    
    }

    public String getNombre() {
        return nombre;
    }
    public String setNombre(){
        return nombre;
    
    }

    @Override
    public String imprimir() {
        return this.nombre + "- " + this.rut;
    
    }
}
