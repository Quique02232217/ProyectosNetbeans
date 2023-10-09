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
    private int cantidadQuitaSucio = (int) (Math.random() * (5+1));
    private int cantidadQuitaMancha = (int) (Math.random() * (5+1));

    public Lavadora() {
    }

    public Lavadora(String codigo, int cantidadQuitaSucio, int cantidadQuitaMancha) {
        this.codigo = codigo;
        this.cantidadQuitaSucio = cantidadQuitaSucio;
        this.cantidadQuitaMancha = cantidadQuitaMancha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadQuitaSucio() {
        return cantidadQuitaSucio;
    }

    public void setCantidadQuitaSucio(int cantidadQuitaSucio) {
        this.cantidadQuitaSucio = cantidadQuitaSucio;
    }

    public int getCantidadQuitaMancha() {
        return cantidadQuitaMancha;
    }

    public void setCantidadQuitaMancha(int cantidadQuitaMancha) {
        this.cantidadQuitaMancha = cantidadQuitaMancha;
    }
    
    
     
}
