package mpGestionEmpresa;

import java.util.Scanner;
import mnGestionEmpresa.Almacenamiento;
import mnGestionEmpresa.Departamento;
import mnGestionEmpresa.Empleado;

public class GestionEmpresa {

    public static void main(String[] args) {

        Departamento AlmacenarDepartamento = new Departamento();
        Scanner input = new Scanner(System.in);
        Menu();
        int opcion = input.nextInt();
        switch (opcion) {
            
            
            case 1:
                do {
                    System.out.println("Bienvenido");
                    System.out.println("-----------");
                    System.out.println("NOMBRE: ");
                    String nombre = input.nextLine();
                    input.nextLine();
                    System.out.println("DNI: ");
                    int dni = input.nextInt();
                    System.out.println("Departamento donde trabaja: ");
                    String departamento = input.nextLine();
                    input.nextLine();
                    System.out.println("En que trabaja: ");
                    String categoria = input.nextLine();

                    Almacenamiento empleado = new Almacenamiento(nombre, dni, departamento, categoria);

                    AlmacenarDepartamento.almacenarEmpleados(empleado);
                    System.out.println(empleado);

                } while (opcion != 4);
                
        }
    }
    
    public static void Menu(){
        System.out.println("Menu...");
        System.out.println("1. almacenar departamento");
        System.out.println("2. almacenar empresa");     
        System.out.println("3. almacenar contratos");
        System.out.println("4. salir");
        System.out.println("Elige una opcion: ");
    }
}
