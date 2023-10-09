/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpComercioElectronico;

import mnComercioElectronico.*;

/**
 *
 * @author Emerson
 */
public class ComercioElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Articulo objArticulo = new Articulo(10, "TV", 13.4, "Electrodomestico");

        System.out.println("El nombre del articulo:" + objArticulo.getNombre());
        System.out.println("El precio:" + objArticulo.getPrecio());

        objArticulo.setPrecio(4.13);
        System.out.println("El precio:" + objArticulo.getPrecio());

        
        /* Adiciono artículos al catálogo */
        Catalogo objCatalogo = new Catalogo();

        objCatalogo.adicionarArticulo(objArticulo);
        System.out.println("Articulos en el catálogo:" + objCatalogo.getCantidadArticulos() );
        
        objCatalogo.adicionarArticulo(new Articulo(11, "Portatil", 100, "Tecnologia"));
        System.out.println("Articulos en el catálogo:" + objCatalogo.getCantidadArticulos() );
        
        objCatalogo.adicionarArticulo(new Articulo(12, "VideoBeam", 10, "Tecnologia"));
        objCatalogo.adicionarArticulo(new Articulo(13, "Mouse", 19, "Tecnologia"));
        objCatalogo.adicionarArticulo(new Articulo(14, "Celular", 20, "Tecnologia"));
        objCatalogo.adicionarArticulo(new Articulo(15, "Pantalla", 30, "Tecnologia"));
        objCatalogo.adicionarArticulo(new Articulo(16, "Teclado", 50, "Tecnologia"));
        
        objCatalogo.adicionarArticulo(new Articulo(17, "Jean", 20, "Vestir"));
        objCatalogo.adicionarArticulo(new Articulo(18, "TShirt", 10, "Vestir"));
        objCatalogo.adicionarArticulo(new Articulo(19, "Sueter Polo", 18, "Vestir"));
        
        //System.out.println("Nombre: " + objCatalogo.buscarArticuloPorCodigo(11).getNombre());
        
        objArticulo = objCatalogo.buscarArticuloPorCodigo(13);
        objArticulo.setPrecio(12);
        System.out.println("Nombre: " + objArticulo.getNombre() + ", Precio: $ " + objArticulo.getPrecio());        
        System.out.println("Articulos en el catálogo:" + objCatalogo.getCantidadArticulos());
        
        System.out.println("Articulos: \n" + objCatalogo.buscarArticulosPorCategoria("Vestir"));
        
        System.out.println("Detalle de un Articulo: \n" + objCatalogo.verDetalleArticuloPorCodigo(11));
        
        
        CarroCompra objCarrito = new CarroCompra();
        objCarrito.adicionarArticulo(objCatalogo.buscarArticuloPorCodigo(12));
        objCarrito.adicionarArticulo(objCatalogo.buscarArticuloPorCodigo(10));
        objCarrito.adicionarArticulo(objCatalogo.buscarArticuloPorCodigo(14));
        objCarrito.adicionarArticulo(objCatalogo.buscarArticuloPorCodigo(11));
        objCarrito.adicionarArticulo(objCatalogo.buscarArticuloPorCodigo(19));
        objCarrito.adicionarArticulo(objCatalogo.buscarArticuloPorCodigo(19));
        
        System.out.println("Articulos en la compra: \n" + objCarrito.verArticulosCompra());
        
    }

}
