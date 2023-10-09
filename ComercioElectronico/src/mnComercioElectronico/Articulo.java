/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnComercioElectronico;

/**
 *
 * @author Emerson
 */
public class Articulo {
    private int codigo;
    private String nombre;
    private double precio;
    private String categoria;

    public Articulo(int _codigo, String _nombre, double _precio, String _categoria) {
        this.codigo = _codigo;
        this.nombre = _nombre;
        this.precio = _precio;
        this.categoria = _categoria;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getCategoria() {
        return this.categoria;
    }
    
    public void setPrecio(double valor){
        this.precio = valor;
    }
    
}
