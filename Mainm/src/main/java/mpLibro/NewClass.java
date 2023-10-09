
package mpLibro;

import java.util.ArrayList;
import mnAtributos.Libro;


public class NewClass {
    public static void main(String[] args) {
        ArrayList <String> nombreL = new ArrayList();
        Libro L = new Libro();
        System.out.println("NOMBRE: ");
        nombreL.add(L.pedirN());
        System.out.println("Autor: ");
        nombreL.add(L.pedirA());
        System.out.println("ISBN: ");
        nombreL.add(L.pedirC());
        
        System.out.println(nombreL);
        
        
        
        
        
        
        
    }
    
}
