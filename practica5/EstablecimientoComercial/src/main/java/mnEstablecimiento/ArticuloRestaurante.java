/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnEstablecimiento;

/**
 *
 * @author User
 */
public class ArticuloRestaurante {
    String nombreRes;
    int precioRes;

    public ArticuloRestaurante(String nombreRes, int precioRes) {
        this.nombreRes = nombreRes;
        this.precioRes = precioRes;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public int getPrecioRes() {
        return precioRes;
    }

    public void setPrecioRes(int precioRes) {
        this.precioRes = precioRes;
    }
    
}
