package com.mycompany.proyecto;


public class Ciudadano {
    String nombre, trabajo;
    int cedula, edad;
    
    
    public Ciudadano(String nombre, int edad, int cedula, String trabajo, String fechaN ){
        this.edad = edad;
        this.cedula = cedula;
        this.nombre = nombre;
        this.trabajo = trabajo;
        
        
    
    }

    public String getNombre() {
        return nombre;
    }

    
    public String gettrabajo() {
        return trabajo;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Cedula: "+cedula);
        System.out.println("Trabajo "+trabajo);
        
    
    }


}



