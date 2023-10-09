package com.mycompany.comercializadoraolivandersactualizacion;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;


public class ComercializadoraOlivandersActualizacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos productos desea registrar: ");
        int cantidadDeProductos = sc.nextInt();
        Hashtable<String, Producto> menu = new Hashtable<>();
        List <Producto> listaProducto = new ArrayList<>(cantidadDeProductos);
        List <Producto> productosvendidos = new ArrayList<>();
        int cant = 1;
        
        for(int i = 0; i < cantidadDeProductos;i++){
            int id = i + 1;
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = sc.next();
            System.out.println("Ingrese el nombre del proveedor: ");
            String proveedor = sc.next();
            System.out.println("Ingrese el valor del producto: ");
            double valor = sc.nextDouble();
            System.out.println("-----------------------------------------------");
            Producto producto = new Producto(nombre, proveedor, id, cant, valor);
            listaProducto.add(producto);
            
        
        }
        
        for(int j = 0; j < listaProducto.size();j++){
            System.out.println((j)+"."+listaProducto.get(j));
        
        }
        
 
        
        System.out.println("Cuantos productos vas a llevar: ");
        int cantidadProductosAVender = sc.nextInt();
        for(int o = 0; o < cantidadProductosAVender;o++){
            System.out.println("Desea comprar algun producto (Señale con el indice: 0, 1, 2,...): ");
            int indiceComprarProducto = sc.nextInt();
            productosvendidos.add(listaProducto.get(indiceComprarProducto));
            listaProducto.remove(indiceComprarProducto);
           
    
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Lista de productos");
        for(int j = 0; j < listaProducto.size();j++){
            System.out.println(listaProducto.get(j));
        
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("Vendido");
        for(int x = 0; x < productosvendidos.size();x++){
            System.out.println("Factura N°" + (x+1)+" Nombre ---> "+productosvendidos.get(x).getNombre()+" Valor de venta ---> " + productosvendidos.get(x).getValor());
            System.out.println();
            System.out.println();
        }
    }
}
