/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mpJuegoAjedrez;


import java.util.ArrayList;
import mnJuegoAjedrez.*;

public class JuegoAjedrez {

    public static void main(String[] args) {
        Peon fichaPeon = new Peon("0", "1");
        Reina fichaReina = new Reina("d8", "d1");
        Rey fichaRey = new Rey("a", "b", "c", "d", "e");
        Alfil fichaAlfil = new Alfil("v", "m");
        Torre fichaTorre = new Torre("n", "x");
        Caballo fichaCaballo = new Caballo("l", "p");
        ArrayList Fichas = new ArrayList();
        
        Fichas.add(fichaPeon);
        Fichas.add(fichaReina);
        Fichas.add(fichaRey);
        Fichas.add(fichaAlfil);
        Fichas.add(fichaTorre);
        Fichas.add(fichaCaballo);
        System.out.println(Fichas);
    }
}
