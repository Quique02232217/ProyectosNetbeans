
package mpCajeroAutomatico;

import mnCajeroAutomatico.BuscarUsuario;
import mnCajeroAutomatico.CajeroAutomatico;
import mnCajeroAutomatico.Persona.*;
import java.util.Scanner;
import mnCajeroAutomatico.Persona;
public class Main {
        
    
    
    
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner (System.in);
        BuscarUsuario persona1 = new BuscarUsuario();
        
     
        
        System.out.println("DIGITE SU USUARIO");
        String nombre = entrada.nextLine();
        Persona p = persona1.buscarPersona(nombre);
        
        
        System.out.println("NOMBRE: "+p.getNombre()+"APELLIDO: "+p.getApellido()+"SALDO: " + p.getSaldo());
        
        
    

}
}