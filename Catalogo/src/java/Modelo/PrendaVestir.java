package Modelo;

import java.io.InputStream;


public class PrendaVestir {
    private String nombre;
    private String talla;
    private int id;
    private int precio;
    private String color;
    private InputStream imagen;

    public PrendaVestir() {
    }

    public PrendaVestir(String nombre, String talla, int precio,int id, String color, InputStream imagen) {
        this.nombre = nombre;
        this.id = id;
        this.talla = talla;
        this.precio = precio;
        this.color = color;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public InputStream getImagen() {
        return imagen;
    }

    public void setImagen(InputStream imagen) {
        this.imagen = imagen;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
           
}
