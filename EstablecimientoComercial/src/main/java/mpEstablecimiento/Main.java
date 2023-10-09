package mpEstablecimiento;

import mnEstablecimiento.ArticuloR;
import mnEstablecimiento.TiendaRopa;
import mnEstablecimiento.Articulo;
import mnEstablecimiento.Tienda;
import mnEstablecimiento.Persona;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Scanner;
import mnEstablecimiento.ArticuloCafeteria;
import mnEstablecimiento.ArticuloRestaurante;
import mnEstablecimiento.Cafeteria;
import mnEstablecimiento.Restaurante;

public class Main {

    public static void menuCafeteria() {
        System.out.println("1. BUSCAR");
        System.out.println("2. VENDER");
        System.out.println("3. SALIR");
        System.out.println("ELIGE UNA OPCION: ");
    }

    public static void menuComida() {
        System.out.println("¿QUE DE SEA ORDENAR?");
        System.out.println("1. PECHUGA");
        System.out.println("2. CARNE DE RES");
        System.out.println("ELIGE TU OPCION: ");
    }

    public static void menuRestaurante() {
        System.out.println("CUANTAS MESAS NECESITA: ");
        System.out.println("1. 1");
        System.out.println("2. 2");
        System.out.println("3. 3");
        System.out.println("4. 4");
        System.out.println("5. 5");
        System.out.println("6. 6");
        System.out.println("7. 7");
        System.out.println("8. 8");
        System.out.println("9. 9");
        System.out.println("10. 10");
        System.out.println("DIGITE SU OPCION: ");

    }

    public static void compraGrande() {
        System.out.println("¿SU COMPRA TIENE MAS DE UN PRODUCTO?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.println("DIGITE SU OPCION: ");

    }

    public static void menuT() {

        System.out.println("-----BIENVENIDO A LA TIENDA DON PEPE-----");
        System.out.println("-----------------------------------------");
        System.out.println("1. BUSCAR ");//Si la persona viene solo a consultar el precio del articulo.
        System.out.println("2. VENDER");
        System.out.println("3. SALIR");
        System.out.println("SELECCIONE UNA OPCION: ");
    }

    public static void menuR() {
        System.out.println("-----BIENVENIDOS A TIERRA SANTA-----");
        System.out.println("------------------------------------");
        System.out.println("1. BUSCAR PRENDA");//Si la persona viene solo a consultar el precio del articulo.
        System.out.println("2. VENDER PRENDA");
        System.out.println("3. SALIR");
        System.out.println("SELECCIONE UNA OPCION: ");

    }

    public static void menuPrincipal() {
        System.out.println("ESTABLECIMIENTOS COMERCIALES");
        System.out.println("-----------------------------");
        System.out.println("1. TIENDA DE DON PEPE"); //tienda de barrio
        System.out.println("2. TIERRA SANTA "); //todo lo que tenga que ver con ropa
        System.out.println("3. CAFETERIA LA PENCUA"); //todo sobre cafeteria
        System.out.println("4. LAS DELICIAS DE DOÑA LILI"); //todo sobre restaurante
        System.out.println("5. SALIR...");
        System.out.println("DIGITE LA OPCION: ");
    }

    public static void salir() {
        System.out.println("SALIENDO.....");

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tienda mi_tienda = new Tienda();
        TiendaRopa mi_tiendaRopa = new TiendaRopa();
        Restaurante mi_restaurante = new Restaurante();
        Cafeteria mi_cafeteria = new Cafeteria();
        int opcion1, opcion = 0;

        Tienda tienda = new Tienda();
        Restaurante restaurante = new Restaurante();
        tienda.cargarInformacion();
        restaurante.menuPedido();

        do {
            try {
                menuPrincipal();

                opcion = entrada.nextInt();
                System.out.println("");

                while (opcion == 1) {

                    menuT();
                    opcion1 = entrada.nextInt();

                    switch (opcion1) {

                        case 1: {
                            String cad;
                            entrada.nextLine();
                            System.out.println("NOMBRE: ");
                            cad = entrada.nextLine();
                            Articulo producto = mi_tienda.buscar(cad);

                            if (producto != null) {
                                System.out.println("NOMBRE: " + producto.getNombre() + "\nCANTIDAD: " + producto.getCantidad() + "\nPRECIO: " + producto.getPrecio());

                            }
                            break;
                        }

                        case 2: {

                            int n;
                            compraGrande();
                            n = entrada.nextInt();

                            if (n == 1) {
                                String cad;
                                entrada.nextLine();
                                System.out.println("NOMBRE 1: ");
                                cad = entrada.nextLine();
                                String cad1;
                                entrada.nextLine();
                                System.out.println("NOMBRE 2: ");
                                cad1 = entrada.nextLine();

                                System.out.println("CANTIDAD 1: ");
                                int cantidad = entrada.nextInt();
                                System.out.println("CANTIDAD 2: ");
                                int cantidad1 = entrada.nextInt();

                                double venta = mi_tienda.vende(cad, cantidad);
                                double venta2 = mi_tienda.vende(cad1, cantidad1);
                                double totalVenta = venta + venta2;
                                if (venta != 0 && venta != 1) {
                                    System.out.println("TOTAL VENTA: " + venta + "$");

                                }
                                if (venta2 != 0 && venta2 != 1) {
                                    System.out.println("TOTAL VENTA: " + venta2 + "$");

                                }
                                System.out.println("TOTAL VENTA: " + totalVenta);
                            }
                            if (n == 2) {
                                String cad;
                                entrada.nextLine();
                                System.out.println("NOMBRE: ");
                                cad = entrada.nextLine();

                                System.out.println("CANTIDAD: ");
                                int cantidad = entrada.nextInt();

                                double venta = mi_tienda.vende(cad, cantidad);

                                if (venta != 0 && venta != 1) {
                                    System.out.println("TOTAL VENTA: " + venta + "$");

                                }
                            }
                            break;
                        }
                        case 3: {
                            salir();

                        }
                        break;
                    }
                    break;
                }
                /*----------------------------------------------------------------------------------------------------------------------------------------------------------*/

                while (opcion == 2) {

                    menuR();
                    opcion1 = entrada.nextInt();

                    switch (opcion1) {

                        case 1: {
                            String cad;
                            entrada.nextLine();
                            System.out.println("Nombre Prenda: ");
                            cad = entrada.nextLine();

                            ArticuloR productoR = mi_tiendaRopa.buscarR(cad);

                            if (productoR != null) {
                                System.out.println("Nombre: " + productoR.getNombre() + "\nCantidad: " + productoR.getCantidad() + "\nPrecio Por Unidad: " + productoR.getPrecio() + "\nTalla: " + productoR.getTalla());

                            }
                            break;
                        }
                        case 2: {
                            String cad;
                            entrada.nextLine();
                            System.out.println("Nombre prenda: ");
                            cad = entrada.nextLine();

                            System.out.println("Cantidad: ");
                            int cantidad = entrada.nextInt();

                            double venta = mi_tiendaRopa.vendeR(cad, cantidad);

                            if (venta != 0 && venta != 1) {
                                System.out.println("Total Venta: " + venta + "$");

                            }
                            break;
                        }

                        case 3: {
                            salir();

                        }
                    }

                }
                /*-----------------------------------------------------------------------------------------------------------------------------------------------------------*/
                while (opcion == 3) {
                    menuRestaurante();
                    int opcion2 = entrada.nextInt();

                    switch (opcion2) {

                        case 1: {
                            menuComida();
                            int op = entrada.nextInt();
                            if (op == 1) {
                                String nom1;
                                entrada.nextLine();
                                System.out.println("NOMBRE: ");
                                nom1 = entrada.nextLine();
                                String nom2;
                                System.out.println("CANTIDAD: ");
                                int cantidad1 = entrada.nextInt();
                                entrada.nextLine();
                                System.out.println("NOMBRE: ");
                                nom2 = entrada.nextLine();
                                System.out.println("CANTIDAD: ");
                                int cantidad2 = entrada.nextInt();
                                System.out.println("NOMBRE: ");
                                String nom3 = entrada.nextLine();
                                System.out.println("CANTIDAD: ");
                                int cantidad3 = entrada.nextInt();

                                double venta = mi_restaurante.vende(nom1, cantidad1);
                                double venta2 = mi_restaurante.vende(nom2, cantidad2);
                                double venta3 = mi_restaurante.vende(nom3, cantidad3);
                                double totalVenta = venta + venta2 + venta3;
                                if (venta != 0 && venta != 1) {
                                    System.out.println("TOTAL VENTA: " + venta + "$");

                                }
                                if (venta2 != 0 && venta2 != 1) {
                                    System.out.println("TOTAL VENTA: " + venta2 + "$");

                                }
                                System.out.println("TOTAL VENTA: " + totalVenta);

                            }

                        }

                    }

                }

                while (opcion == 4) {
                    menuCafeteria();
                    int op = entrada.nextInt();

                    switch (op) {

                        case 1: {
                            String cad1;
                            entrada.nextLine();
                            System.out.println("NOMBRE: ");
                            cad1 = entrada.nextLine();
                            ArticuloCafeteria producto = mi_cafeteria.buscarC(cad1);

                            if (producto != null) {
                                System.out.println("NOMBRE: " + producto.getNombrecafeteria() + "\nCANTIDAD: " + producto.getCantidadcafeteria() + "\nPRECIO: " + producto.getPreciocafeteria());

                            }
                            break;
                        }

                    }

                }

            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.err.println("ERROR");
            }
        } while (opcion != 5);
        salir();

    }

}
