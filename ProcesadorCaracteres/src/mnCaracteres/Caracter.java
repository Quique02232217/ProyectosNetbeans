/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnCaracteres;

import mdCaracteres.Data;

/**
 *
 * @author Emerson
 */
public class Caracter {
    private char caracterAscii;
    private int ocurrencias;
    private String tipo;

    public Caracter(char caracterAscii) {
        this.caracterAscii = caracterAscii;
        this.ocurrencias = 1;
        
        Data objData = new Data();
        
        if (objData.retornarAlfabeto().contains( String.valueOf(caracterAscii).toLowerCase())) {
            this.tipo = "Alfabeto";
        }else if (objData.retornarSignosPuntuacion().contains( String.valueOf(caracterAscii))) {
            this.tipo = "Signo Puntuacion";
        }else if (objData.retornarNumeros().contains(String.valueOf(caracterAscii))) {
            this.tipo = "Numero";
        }else {
            this.tipo = "Otro Caracter";
        }
        
    }
    
    public char getCaracterAscii(){
        return this.caracterAscii;
    }
    
    public void adicionarOcurrencia(){
        this.ocurrencias++;
    }
    
    public int obtenerOcurrencias(){
        return this.ocurrencias;
    }
    
    public String getTipoCaracter(){
        return this.tipo;
    }
   
}
