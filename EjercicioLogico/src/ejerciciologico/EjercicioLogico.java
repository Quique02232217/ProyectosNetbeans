package ejerciciologico;

import java.util.Scanner;

public class EjercicioLogico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Enum dias = new Enum();
        System.out.println("Ingrese un dia de la semana: ");
        String dia = sc.nextLine();
        
        
        if(dias.mostrarTrabajo(dia) == true){
            System.out.println("Es dia laboral");
        }else {
            System.out.println("No es laboral");
        }
        
        

    }

}
