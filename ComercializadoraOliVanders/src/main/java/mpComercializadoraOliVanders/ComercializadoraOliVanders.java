package mpComercializadoraOliVanders;

import java.util.Scanner;
import mnComercializadoraOliVanders.Producto;

public class ComercializadoraOliVanders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que desea registrar: ");
        int productosAregistrar = sc.nextInt();

        String listanombreproductos[] = new String[productosAregistrar];
        Producto listaproductos[] = new Producto[productosAregistrar];
        Producto listadeexistenciadeproductos[][] = new Producto[productosAregistrar][3];

        for (int i = 0; i < listanombreproductos.length; i++) {
            int id = i + 1;
            System.out.println("Ingresa el nombre del producto: " + (i + 1));
            String nombre = sc.next();
            for (int j = 0; j < 1; j++) {
                System.out.println("Ingrese la cantidad de --> " + nombre + " que llegaron: ");
                int cantidad = sc.nextInt();
                System.out.println("Ingrese el valor de " + nombre + ":");
                int valor = sc.nextInt();
                System.out.println("Ingrese el nombre del proovedor: ");
                String nombreproovedor = sc.next();
                System.out.println("_____________________________________________________________");
                Producto producto = new Producto(nombre, cantidad, id, valor, nombreproovedor);
                listanombreproductos[i] = producto.getNombre();
                listadeexistenciadeproductos[i][j] = producto;
                listaproductos[i] = producto;
                

            }

        }
        System.out.println("LISTA DE EXISTENCIA DE PRODUCTOS (NOMBRE, ID, CANTIDAD)");
        for (int x = 0; x < listanombreproductos.length; x++) {
            System.out.println("Nombre ---> "+listanombreproductos[x]);

            for (int y = 0; y < 1; y++) {
                System.out.println(listadeexistenciadeproductos[x][y].mostrarInformacionDeExistencia());
                System.out.println("--------------------------");
            }
        }
        System.out.println("LISTA DE PRODUCTOS");
        for(int a = 0; a < listaproductos.length;a++){
            System.out.println(listaproductos[a]);
        
        }
        
        
    }
}
