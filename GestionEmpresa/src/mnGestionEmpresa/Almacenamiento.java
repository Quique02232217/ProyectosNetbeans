/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnGestionEmpresa;

/**
 *
 * @author User
 */
public class Almacenamiento {
    String nombre, localizacion, empresa;
    int identificador;
    
    public Almacenamiento(String nombre, int identificador, String localizacion, String empresa){
        this.nombre = nombre;
        this.identificador = identificador;
        this.localizacion = localizacion;
        this.empresa = empresa;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getIdentificador() {
        return identificador;
    }
    
    public String toString() {
        return "Nombre: " + nombre + "\nLocalizacion: " + localizacion + "\nDNI: " + identificador + "\nEmpresa: " + empresa;
    }
    
}
