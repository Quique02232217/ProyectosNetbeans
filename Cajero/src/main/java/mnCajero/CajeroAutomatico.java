/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnCajero;

import java.util.Scanner;
import static mpCajero.Cajero.menu;

/**
 *
 * @author User
 */
public class CajeroAutomatico {
   
    public void funcionCajero(){
    Scanner p = new Scanner(System.in);

        System.out.println("NOMBRE: ");
        String nombre = p.nextLine();
        System.out.println("APELLIDO: ");
        String apellido = p.nextLine();
        System.out.println("USUARIO: ");
        String usuario = p.nextLine();
        System.out.println("CONTRASEÑA");
        int contraseña = p.nextInt();
        System.out.println("SALDO: ");
        int saldo = p.nextInt();

        Usuario persona = new Usuario(usuario, contraseña, saldo);
        Usuario persona1 = new Usuario(nombre, apellido);
        if (contraseña <= 999999) {
            try {

                menu();
                int opcion = p.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("INGRESE LA CANTIDAD QUE DESEA RETIRAR: ");
                        int retirar = p.nextInt();

                        if (saldo >= retirar) {
                            saldo -= retirar;
                            System.out.println("CANTIDAD RESTANTE: " + saldo);
                            System.out.println("CANTIDAD RETIRADO: " + retirar);
                        } else {
                            System.out.println("NO TIENES DINERO SUFICIENTE");

                        }

                    case 2:
                        System.out.println("NOMBRE: " + persona1.getNombre() + " APELLIDO: " + persona1.getApellido() + " USUARIO: " + persona.getUsuario() + " SALDO: " + saldo);

                }

            } catch (Exception e) {

                System.out.println("ERROR DE EJECUCION");

            }
        } else {
            System.out.println("CONTRASEÑA INCORRECTA");

        }
    }
    }

    

