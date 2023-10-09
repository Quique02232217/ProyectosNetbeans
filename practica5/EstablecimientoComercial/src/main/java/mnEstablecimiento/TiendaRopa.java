package mnEstablecimiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import static mnEstablecimiento.Tienda.lista;

public class TiendaRopa {

    String Nomtienda;

    ArrayList<ArticuloR> articulosR;
    ArrayList<String> informacionR;

    static Hashtable<String, ArticuloR> listaR = new Hashtable<>();

    public TiendaRopa(String nombre) {
        this.Nomtienda = nombre;

    }

    public TiendaRopa() {
        articulosR = new ArrayList();
        informacionR = new ArrayList();

    }

    public ArticuloR buscarR(String nombre) {
        ArticuloR a;

        if (listaR.containsKey(nombre)) {
            a = listaR.get(nombre);

            System.out.println("PRENDA ENCONTRADA");

            return a;

        } else {
            System.out.println("PRENDA NO ENCONTRADO");

        }
        return null;

    }

    public double vendeR(String nombre, int numero) {

        ArticuloR a = buscarR(nombre);

        double vendido = 0;

        if (a == null) {
            vendido = -1;

        } else if (a.Vendido(numero)) {
            vendido = numero * a.getPrecio();

            if (a.getCantidad() == 0) {
                listaR.remove(nombre);

            }

        }
        return vendido;

    }

    public void cargarInfoRopa() {

        try {

            File dataR = new File("Ropa.txt");
            FileReader frDataR = new FileReader(dataR);
            BufferedReader bfData = new BufferedReader(frDataR);

            String auxDataR;

            while ((auxDataR = bfData.readLine()) != null) {
                informacionR.add(auxDataR);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR, NO SE ENCUENTRA EL ARCHIVO");
        } catch (IOException ex) {
            System.out.println("ERROR EN LA EJECUCION DEL CODIGO");
        }

        for (int i = 0; i < informacionR.size(); i++) {
            String nombre = informacionR.get(i).split(", ")[0];
            int cantidad = Integer.parseInt(informacionR.get(i).split(", ")[1]);
            int precio = Integer.parseInt(informacionR.get(i).split(", ")[2]);
            String talla = informacionR.get(i).split(", ")[3];
            ArticuloR aR = new ArticuloR(nombre, cantidad, precio, talla);
            
            listaR.put(nombre, aR);
            
            
        }
    }

}
