/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpAuto;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Auto {

    String patente, color;
    int kms;
    boolean conAire = false;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public boolean isConAire() {
        return conAire;
    }

    public void setConAire(boolean conAire) {
        this.conAire = conAire;
    }
//patente = n.nextLine();

    public String mostrarC() {
        Scanner n = new Scanner(System.in);
        color = n.nextLine();
        if (color == "rojo"){
            System.out.println("COLOR INVALIDO");
        }else{
            System.out.println(color);
        }
        return color;
        
        
    }

    public String mostrarP() {
        Scanner n = new Scanner(System.in);
        patente = n.nextLine();
        return patente;

    }

    public int mostrarK() {
        Scanner n = new Scanner(System.in);
        kms = n.nextInt();
        return kms;

    }

    public boolean mostrarV() {
        Scanner n = new Scanner(System.in);
        String Aire;

        try {

            Aire = n.nextLine();

        } catch (Exception e) {
            System.out.println("ERROR");

        }

        return conAire;

    }
}
