/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class PrendaVestir {
    private String Codigo;
    private String tipo;
    private String talla;
    private int cantidadMancha;
    private int cantidadSucio;

    public PrendaVestir() {
    }

    public PrendaVestir(String Codigo, String tipo, String talla, int cantidadMancha, int cantidadSucio) {
        this.Codigo = Codigo;
        this.tipo = tipo;
        this.talla = talla;
        this.cantidadMancha = cantidadMancha;
        this.cantidadSucio = cantidadSucio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidadMancha() {
        return cantidadMancha;
    }

    public void setCantidadMancha(int cantidadMancha) {
        this.cantidadMancha = cantidadMancha;
    }

    public int getCantidadSucio() {
        return cantidadSucio;
    }

    public void setCantidadSucio(int cantidadSucio) {
        this.cantidadSucio = cantidadSucio;
    }
    
    
    
}
