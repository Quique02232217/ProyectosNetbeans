/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package mpCajero;

import java.util.Scanner;
import mnCajero.CajeroAutomatico;
import mnCajero.Usuario;

/**
 *
 * @author User
 */
public class Cajero {

    public static void menu() {
        System.out.println("1. RETIRAR DINERO");
        System.out.println("2. CONSULTAR SALDO DE TU CUENTA");

    }

    public static void main(String[] args) {
        CajeroAutomatico c1 = new CajeroAutomatico();
        
        c1.funcionCajero();
    
    
    }
}
