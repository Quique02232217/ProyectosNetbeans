/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocompra;

/**
 *
 * @author User
 */
public class Articulo {
    private String nombre;
    private double precio;
    private int id;
    
    public Articulo(String nombre, double precio, int id){
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    
    }
    public Articulo(){}
    
    public String getNombre(){
        return nombre;
    }
    public int getId(){
        return id;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String toString(){
        return "\nID: "+ id + "\nNombre: "+nombre +"\nPrecio: "+ precio ;
    }



}
