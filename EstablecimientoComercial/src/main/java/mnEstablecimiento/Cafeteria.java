package mnEstablecimiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import static mnEstablecimiento.Restaurante.menu;
import static mnEstablecimiento.Tienda.lista;

public class Cafeteria{

    static Hashtable<String, ArticuloCafeteria> menuC = new Hashtable<>();
    ArrayList<String> informacion = new ArrayList<>();
 
    public ArticuloCafeteria buscarC(String nombre) {
        ArticuloCafeteria a;

        if (menuC.containsKey(nombre)) {
            a = menuC.get(nombre);

            System.out.println("ARTICULO ENCONTRADO");

            return a;

        } else {
            System.out.println("ARTICULO NO ENCONTRADO");
        }
        return null;

    }

    public double vende(String nombre, int numero) {

        ArticuloCafeteria a = buscarC(nombre);

        double vendido = 0;

        if (a == null) {
            vendido = -1;

        } else if (a.Vendido(numero)) {
            vendido = numero * a.getPreciocafeteria();

            if (a.getCantidadcafeteria() == 0) {
                lista.remove(nombre);

            }

        }
        return vendido;

    }

        public void menuPedidoCafeteria() {

        try {

            File data = new File("ProductosCafe.txt");
            FileReader frData = new FileReader(data);
            BufferedReader bfData = new BufferedReader(frData);

            String auxData;

            while ((auxData = bfData.readLine()) != null) {
                informacion.add(auxData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR NO SE ENCUENTRA EL ARCHIVO");
        } catch (IOException ex) {
            System.out.println("ERROR EN LA EJECUCION ");
        }
        
        for (int i = 0; i <informacion.size(); i++ ){
            String nombre = informacion.get(i).split(", ")[0];
            
            int precio = Integer.parseInt(informacion.get(i).split(", ")[1]);
            int cantidad = Integer.parseInt(informacion.get(i).split(", ")[2]);
            ArticuloCafeteria l = new ArticuloCafeteria(nombre, precio, cantidad);

            
            menuC.put(nombre, l);
        }

    }

    
    
    
}
