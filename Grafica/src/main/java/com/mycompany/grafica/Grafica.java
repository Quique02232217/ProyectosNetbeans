/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.grafica;

/**
 *
 * @author User
 */
public class Grafica {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("11-1", "manuel");
        Admin adm = new Admin("usu","pass");
        
        Imprimir impresora = new Imprimir(adm);
        impresora.imprimirObjetoPorImpresora();
    }
}
