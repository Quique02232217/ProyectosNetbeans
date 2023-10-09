package mnEstablecimiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import static mnEstablecimiento.Tienda.lista;

public class Restaurante {
    static Hashtable<String, ArticuloRestaurante> menu = new Hashtable<>();
    ArrayList<String> informacion = new ArrayList();

  
    
        public Articulo buscar(String nombre) {
        Articulo a;

        if (lista.containsKey(nombre)) {
            a = lista.get(nombre);

            System.out.println("ARTICULO ENCONTRADO");

            return a;

        } else {
            System.out.println("ARTICULO NO ENCONTRADO");
        }
        return null;

    }

    public double vende(String nombre, int numero) {

        Articulo a = buscar(nombre);

        double vendido = 0;

        if (a == null) {
            vendido = -1;

        } else if (a.Vendido(numero)) {
            vendido = numero * a.getPrecio();

            if (a.getCantidad() == 0) {
                lista.remove(nombre);

            }

        }
        return vendido;

    }
    
    public void menuPedido() {

        try {

            File data = new File("menu.txt");
            FileReader frData = new FileReader(data);
            BufferedReader bfData = new BufferedReader(frData);

            String auxData;

            while ((auxData = bfData.readLine()) != null) {
                informacion.add(auxData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR, NO SE ENCUENTRA EL ARCHIVO");
        } catch (IOException ex) {
            System.out.println("ERROR EN LA EJERCUCION DEL CODIGO ");
        }
        
        for (int i = 0; i <informacion.size(); i++ ){
            String nombre = informacion.get(i).split(", ")[0];
            int precio = Integer.parseInt(informacion.get(i).split(", ")[1]);
            ArticuloRestaurante l = new ArticuloRestaurante(nombre, precio);

            
            menu.put(nombre, l);
        }

    }
  

}
