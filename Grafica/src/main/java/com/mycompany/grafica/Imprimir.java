/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grafica;

/**
 *
 * @author User
 */
public class Imprimir {
    private Imprimable ob;

    public Imprimir(Imprimable ob) {
        this.ob = ob;
    }
    
    
    public void imprimirObjetoPorImpresora(){
        System.out.println(this.ob.imprimir());
    
    }          
    
}
