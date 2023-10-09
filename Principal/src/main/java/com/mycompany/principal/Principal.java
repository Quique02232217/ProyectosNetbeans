/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import mpAuto.Auto;

/**
 *
 * @author User
 */
public class Principal {

    public static void main(String[] args) {
       Auto a1 = new Auto();
        System.out.println("COLOR: ");
        a1.mostrarC();
        System.out.println("PATENTE: ");
        a1.mostrarP();
        System.out.println("KMS: ");
        a1.mostrarK();
        System.out.println("AIRE: ");
        a1.mostrarV();
        System.out.println(a1.getColor() + " / "+ a1.getPatente()+" / "+a1.getKms()+" / "+a1.isConAire());
    }
}
