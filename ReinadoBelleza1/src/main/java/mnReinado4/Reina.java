package mnReinado4;

import java.util.Scanner;

public class Reina {

    String nombre, ciudad;
    int edad;
    float puntTrajeGala, puntVestidoBaño, puntFantasia;

    public Reina(String nombre, String ciudad, int edad, float puntTrajeGala, float puntVestidoBaño, float puntFantasia) {
        this.ciudad = ciudad;
        this.edad = edad;
        this.nombre = nombre;
        this.puntFantasia = puntFantasia;
        this.puntTrajeGala = puntTrajeGala;
        this.puntVestidoBaño = puntVestidoBaño;

    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public float getPuntTrajeGala() {
        return puntTrajeGala;
    }

    public float getPuntVestidoBaño() {
        return puntVestidoBaño;
    }

    public float getPuntFantasia() {
        return puntFantasia;
    }
    
    

}
