package com.mycompany.practica11;

import java.util.Scanner;

public class Pr {

    int suma, resta, mult;
    float div;
    Scanner n = new Scanner(System.in);

    public void Suma(int num1, int num2) {
        suma = num1 + num2;

    }

    public void Resta(int num1, int num2) {
        resta = num1 - num2;

    }

    public void Multiplicacion(int num1, int num2) {
        mult = num1 * num2;

    }

    public void Division(int num1, int num2) {
        div = num1 / num2;

    }

    public void mostrarResultados() {
        System.out.println("Su resultado es: " + suma);
        System.out.println("Su resultado es: " + resta);
        System.out.println("Su resultado es: " + mult);
        System.out.println("Su resultado es: " + div);

    }
}
