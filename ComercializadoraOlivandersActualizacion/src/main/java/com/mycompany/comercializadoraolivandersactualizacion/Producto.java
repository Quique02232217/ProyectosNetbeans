package com.mycompany.comercializadoraolivandersactualizacion;


public class Producto {
    private String nombre;
    private String nombreProveedor;
    private int identificacion;
    private int cantidad;
    private double valor;

    public Producto() {
    }

    public Producto(String nombre, String nombreProveedor, int identificacion, int cantidad,double valor) {
        this.nombre = nombre;
        this.nombreProveedor = nombreProveedor;
        this.identificacion = identificacion;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", nombreProveedor=" + nombreProveedor + ", identificacion=" + identificacion + ", valor=" + valor + ", cantidad="+ cantidad+'}';
    }
    
    
}
