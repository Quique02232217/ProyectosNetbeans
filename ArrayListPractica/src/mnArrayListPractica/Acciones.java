package mnArrayListPractica;

import java.util.ArrayList;

public class Acciones {

    public void agregarElemento(int n, ArrayList<Integer> numero) {
        for (int i = 0; i < numero.size(); i++) {
            numero.add(n);
        }

    }

    public void borrarElemento(int n, ArrayList<Integer> numero) {
        for (int i = 0; i < numero.size(); i++) {
            numero.remove(n);
        }

    }
    
    public ArrayList<Integer> mostrar(ArrayList<Integer> numero, int i){
        agregarElemento (i, numero);
        return numero;
    }

}
