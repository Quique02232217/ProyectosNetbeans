/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class Lavadora {
    private String codigo;
    private int cantidadQuitaMancha;
    private int cantidadQuitaSucio;

    public Lavadora() {
    }

    public Lavadora(String codigo, int cantidadQuitaMancha, int cantidadQuitaSucio) {
        this.codigo = codigo;
        this.cantidadQuitaMancha = cantidadQuitaMancha;
        this.cantidadQuitaSucio = cantidadQuitaSucio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadQuitaMancha() {
        return cantidadQuitaMancha;
    }

    public void setCantidadQuitaMancha(int cantidadQuitaMancha) {
        this.cantidadQuitaMancha = cantidadQuitaMancha;
    }

    public int getCantidadQuitaSucio() {
        return cantidadQuitaSucio;
    }

    public void setCantidadQuitaSucio(int cantidadQuitaSucio) {
        this.cantidadQuitaSucio = cantidadQuitaSucio;
    }
    
    
           
    
}
