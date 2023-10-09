/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnComercioElectronico;

import java.util.ArrayList;

/**
 *
 * @author Emerson
 */
public class CarroCompra {
    ArrayList<Articulo> miCompra;

    public CarroCompra() {
        miCompra = new ArrayList<>();
    }
    
    public void adicionarArticulo(Articulo objArticulo){
        miCompra.add(objArticulo);
    }
    
    public String verArticulosCompra() {
        String cadenaArticulos = "";
        double totalCompra = 0;
        
        for (Articulo objArticulo: miCompra){
            cadenaArticulos += objArticulo.getNombre() + " $ " + objArticulo.getPrecio() + "\n";
            totalCompra += objArticulo.getPrecio();
        }
        return cadenaArticulos + "\nTotal : $ " + totalCompra;
    }
}
