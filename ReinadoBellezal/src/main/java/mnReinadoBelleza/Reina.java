/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnReinadoBelleza;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Reina {

    int edad;
    String ciudad;
    float puntTrajeGala, puntVestidoBaño, puntFantasia;

    public Reina(int edad, String ciudad, float puntTrajeGala, float puntVestidoBaño, float puntFantasia) {
        this.edad = edad;
        this.ciudad = ciudad;
        this.puntTrajeGala = 0;
        this.puntVestidoBaño = 0;
        this.puntFantasia = 0;
    }

    public int getEdad() {
        return edad;
    }

    public String getCiudad() {
        return ciudad;
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
    
    
    public String nombre(){
        return " "+ edad+""+ciudad;
    }
    
    

    public String pedirCiudad() {
        Scanner n = new Scanner(System.in);
        ciudad = n.nextLine();
        return ciudad;

    }

    public int pedirEdad() {
        Scanner n = new Scanner(System.in);
        edad = n.nextInt();
        return edad;

    }

    public float pedirPuntajeG() {
        Scanner n = new Scanner(System.in);
        puntTrajeGala = n.nextFloat();
        return puntTrajeGala;

    }

    public float pedirPuntajeB() {
        Scanner n = new Scanner(System.in);

        puntVestidoBaño = n.nextFloat();

        return puntVestidoBaño;

    }

    public float pedirPuntajeF() {
        Scanner n = new Scanner(System.in);

        puntFantasia = n.nextFloat();
        return puntFantasia;

    }
    
    
}
