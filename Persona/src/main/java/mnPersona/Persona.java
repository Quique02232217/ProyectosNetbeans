/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnPersona;

/**
 *
 * @author User
 */
public class Persona {

    String nombre, apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.apellido = apellido;
        this.edad = edad;
        this.nombre = nombre;

    }

    public String getApellido() {
        return apellido;

    }

    public String getNombre() {
        return nombre;

    }
    
    public int getEdad(){
        return edad;
    
    }

}
