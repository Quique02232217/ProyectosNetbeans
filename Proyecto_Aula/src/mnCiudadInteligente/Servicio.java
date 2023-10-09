/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Para saber que tipo de beneficios tendrá la persona*/

package mnCiudadInteligente;
import java.io.IOException;
import java.util.Scanner;
import mpValidacionCiudadano.Ciudadano;

public class Servicio {
    
    /*Declaramos las variables*/
    Scanner leer = new Scanner (System.in);
    String multa, nombrePersona, res; /*Vacunado, multa, demanda*/
    boolean reg; /*Registrado*/
    double pAmbiente, pCrediticio; /*Puntaje ambiente, puntaje crediicio*/
    public void beneficios() throws IOException{
        Ciudadano x = new Ciudadano();
        x.leerArchivo("baseDatos.txt"); /*llamamos la función para leer el archivo*/
        x.separar(); /*separamos la info en variables*/
        
        /*preguntamos el nombre de la persona*/
        System.out.println("Digite el nombre completo de la persona a buscar (siempre mayus al inicio): ");
        nombrePersona = leer.nextLine(); 
        /*validamos si la persona existe */
        reg = x.validarRegistro(nombrePersona);
        
        while (!reg){ /*como el nombre es completo, le preguntamos al usuario si está seguro que digitó correctamente el nombre*/
            System.out.println("El nombre tal cual como lo digito no aparece en la base de datos. ¿Quiere digitar el nombre de nuevo en caso de error? (s/n): ");
            res = leer.nextLine();
            if (!"s".equals(res))
                break;
            
            System.out.println("Digite el nombre de la persona a buscar: ");
            nombrePersona = leer.nextLine();
            reg = x.validarRegistro(nombrePersona);
        }
        if(!reg){ /*En caso tal que no se encuentre, le avisa*/
            System.out.println("Como no se encuentra registrado, le preguntaremos unas cosas: ");
            System.out.println("\n\n");
        }
        /*Preguntamos y validamos los datos de la persona, para calcular los beneficios*/
        do{
            System.out.println("\nTiene multas de movilidad en los ultimos 5 años? (si/no):  ");
            multa = leer.nextLine();
        }while(!"si".equals(multa) && !"no".equals(multa));
        do{
            System.out.println("\nIngrese el puntaje en cuidado del medio ambiente(>0): ");
            pAmbiente = leer.nextDouble();
        }while(pAmbiente <0);
        do{
            System.out.println("\nIngrese el puntaje de su vida criditica(>0): ");
            pCrediticio = leer.nextDouble();
        }while(pCrediticio < 0);

        
        /*imprimimos la información de la persona.*/
        System.out.println("\n\nINFO DE LA PERSONA: ");
        x.imprimir(); /*funcion para los datos personales*/
        System.out.println("\nBENEFICIOS: "); /*imprimimos los beneficios*/
        if (reg)
            System.out.println("Como se encuentra registrado, puede acceder gratuitamente a cualquier centro de salud.");
        if (pAmbiente >= 60)
            System.out.println("Por tener un muntaje mayor o igual a 60 en Abmiente tiene un 25% de descuento de la matricula");
        
        if(pCrediticio >= 80)
            System.out.println("Por tener un muntaje mayor o igual a 80 en vida crediticia tiene un 60% de descuento en su primera compra mayor a 100mil pesos");
        
        if("no".equals(multa))
            System.out.println("Como no ha tenido multas, obtendra un 20% de descuento al momento de acceder a un parqueadero");
    
    }
    
    
}
