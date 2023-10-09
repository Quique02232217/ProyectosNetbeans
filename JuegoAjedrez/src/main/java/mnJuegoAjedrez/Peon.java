/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnJuegoAjedrez;

/**
 *
 * @author User
 */
public class Peon {

    String unPasoDelante, MataDiagonal;

    public Peon(String unPasoDelante, String MataDiagonal) {
        this.MataDiagonal = MataDiagonal;
        this.unPasoDelante = unPasoDelante;

    }

    public String getMataDiagonal() {
        return MataDiagonal;
    }

    public String getUnPasoDelante() {
        return unPasoDelante;

    }

}
