
import java.util.Scanner;


public class Persona {
    String nombre, apellido;
    int cedula, edad;
    
public void Persona (String nombre, String apellido, int cedula, int edad){
    this.apellido = apellido;
    this.nombre = nombre;
    this.cedula = cedula;
    this.edad = edad;


}
    public void pedirDatos (){
        Scanner d = new Scanner(System.in);
        
        nombre = d.nextLine();
        apellido = d.nextLine();
        edad = d.nextInt();
        cedula = d.nextInt();
    } 
    
    public void mostrarDatos(){
        if (edad >= 18){
            System.out.println("ERES MAYOR DE EDAD, AQUI TIENES TUS DATOS: ");
            System.out.println("");
            System.out.println("Nombre: "+nombre+"Apellido: "+apellido+"Cedula: "+cedula+"Edad: "+edad);
        
        }else{
            System.out.println("NO ERES MAYOR DE EDAD, POR LO CUAL TU INFORMACION ES FALSA");
        
        }
    
    }
    
    


}
