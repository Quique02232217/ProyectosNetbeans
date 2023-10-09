/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculobinario;

/**
 *
 * @author User
 */
public class Numero {
    public String numero = "";
    public int n_numero = 0;
    
    public Numero(String numero, int n_numero){
        this.n_numero = n_numero;
        this.numero = numero;
    }


    public String getNumero(){
        return numero;
    }

    public int getN_numero(){
        return n_numero;
    
    }
}
