/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnEstablecimiento;

/**
 *
 * @author User
 */
public class ArticuloCafeteria {

    String nombrecafeteria;
    int preciocafeteria, cantidadcafeteria;

    public ArticuloCafeteria(String nombrecafeteria, int preciocafeteria, int cantidadcafeteria) {
        this.cantidadcafeteria = cantidadcafeteria;
        this.nombrecafeteria = nombrecafeteria;
        this.preciocafeteria = preciocafeteria;
    }

    public String getNombrecafeteria() {
        return nombrecafeteria;
    }

    public int getPreciocafeteria() {
        return preciocafeteria;
    }

    public int getCantidadcafeteria() {
        return cantidadcafeteria;
    }

    public boolean Vendido(int N) {
        if (N <= cantidadcafeteria) {
            N -= cantidadcafeteria;
        } else {
            System.out.println("¡ADVERTENCIA!: NO HAY SUFICIENTES PRODUCTOS");
            return false;
        }
        return true;
    }
}
