/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnJuegoAjedrez;

/**
 *
 * @author User
 */
public class Rey {

    String MueveDerecha, MueveIzquierda, MueveDiagonal, MueveAtras, MataLibreUnaCasilla;

    public Rey(String MueveDerecha, String MueveIzquierda, String MueveDiagonal, String MueveAtras, String MataLibreUnaCasilla) {
        this.MataLibreUnaCasilla = MataLibreUnaCasilla;
        this.MueveAtras = MueveAtras;
        this.MueveDerecha = MueveDerecha;
        this.MueveDiagonal = MueveDiagonal;
        this.MueveIzquierda = MueveIzquierda;

    }

    public String getMataLibreUnaCasilla() {
        return MataLibreUnaCasilla;

    }

    public String getMueveAtras() {
        return MueveAtras;
    }

    public String getMueveDerecha() {
        return MueveDerecha;

    }

    public String getMueveDiagonal() {
        return MueveDiagonal;
    }

    public String getMueveIzquierda() {
        return MueveIzquierda;
    }

}
