/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnCaracteres;

import mnCaracteres.Caracter;
import mdCaracteres.Data;

import java.util.ArrayList;

/**
 *
 * @author Emerson
 */
public class Parrafo {

    ArrayList<Caracter> texto;
    private String contenido;

    public Parrafo() {
        texto = new ArrayList<>();
        this.contenido = "";
    }

    public void asignarContenido(String textoRecibido) {
        this.contenido = textoRecibido;
    }

    public String recuperarContenido() {
        return this.contenido;
    }

    public void adicionarCaracter(Caracter c) {
        texto.add(c);
    }

    public Boolean buscarCaracterEnTexto(char caracterBuscado) {
        for (Caracter c : texto) {
            if (c.getCaracterAscii() == caracterBuscado) {
                return true;
            }
        }
        return false;
    }
    
    public Caracter buscarObjetoCaracter(char caracterBuscado) {
        for (Caracter c : texto) {
            if (c.getCaracterAscii() == caracterBuscado) {
                //Retorna el objeto cuando coincide con el caracter
                return c;
            }
        }
        return null;
    }
    
    public void recorrerDetectarCaracter() {
        //Recorre el contenido, identifica cada caracter, y adiciona al ArrayList texto
        for (int i = 0; i < this.contenido.length(); i++) {
            //Extrae cada caracter del contenido
            char caracterEncontrado = this.contenido.charAt(i);
            
            //Busca en el arrayList
            Caracter objCaracter = buscarObjetoCaracter(caracterEncontrado);
            if (objCaracter  != null){
                //Debe incrementar las ocurrencias
                objCaracter.adicionarOcurrencia();
            }else {
                //Debe crearlo
                adicionarCaracter(new Caracter(caracterEncontrado));
            }
        }
    }
    
    public String retornarEstadisticas(){
        String resultado = "";
        for (Caracter c: texto){
            resultado += c.getTipoCaracter() + "\t" + c.getCaracterAscii() + " -> " + c.obtenerOcurrencias() + "\n";
        }
        return resultado;
    }
}
