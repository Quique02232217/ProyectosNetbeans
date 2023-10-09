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
public class Catalogo {
    ArrayList<Articulo> miCatalogo;

    public Catalogo() {
        miCatalogo = new ArrayList<>();
    }
    
    public void adicionarArticulo(Articulo objArticulo){
        miCatalogo.add(objArticulo);
    }
    
    public int getCantidadArticulos(){
        return miCatalogo.size();
    }
    
    public Articulo buscarArticuloPorCodigo(int codigoBuscar) {
        int indiceArticuloCoincide = 0;
        Boolean swEncontrado = false;
        
        for (Articulo objArticulo: miCatalogo){
            if (objArticulo.getCodigo() == codigoBuscar){
                swEncontrado = true;
                break;
            }
            indiceArticuloCoincide++;
        }
        return (swEncontrado?miCatalogo.get(indiceArticuloCoincide):null);
    }
    
    public String buscarArticulosPorCategoria(String categoriaBuscar) {
        String cadenaArticulos = "";
        
        for (Articulo objArticulo: miCatalogo){
            if (objArticulo.getCategoria().equals(categoriaBuscar)){
                cadenaArticulos += objArticulo.getNombre() + " $ " + objArticulo.getPrecio() + "\n";
                
            }
        }
        return cadenaArticulos;
    }
    
    public String verDetalleArticuloPorCodigo(int codigoBuscar) {
        String detalleArticulo = "";
        Articulo objArticulo = this.buscarArticuloPorCodigo(codigoBuscar);
        
        detalleArticulo = "Nombre: " + objArticulo.getNombre() + "\n" +
                "Precio $ " + objArticulo.getPrecio() + "\n" +
                "Categoria: " + objArticulo.getCategoria() + "\n";
        
        return detalleArticulo;
    }
    
}
