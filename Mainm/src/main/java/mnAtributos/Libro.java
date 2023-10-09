package mnAtributos;

import java.util.Scanner;


public class Libro {
    String nombre, autor, isbn;
    

    public String pedirN(){
        Scanner n = new Scanner (System.in);
        nombre = n.nextLine();
        return nombre;
    }
    public String pedirA(){
        Scanner a = new Scanner(System.in);
        autor = a.nextLine();
        return autor;
     }
    
    public String pedirC(){
        Scanner c = new Scanner (System.in);
        isbn = c.nextLine();
        return isbn;
        
        
        
    
    }
    
}
