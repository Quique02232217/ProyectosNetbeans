package mpUsoArray;

import java.util.Scanner;
import mnUsoArray.UsoArray;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numeros: ");
        int n = input.nextInt();

        int arrayNumeros[] = new int[5];

        try {
            for (int i = 0; i <= arrayNumeros.length; i++) {
                UsoArray.rellenarArreglo(arrayNumeros, n);
                System.out.println("Calificacion: " + (i + 1) + " = " + arrayNumeros[i]);
                System.out.println("Numero: "+(i+1));
                n = input.nextInt();

            }
        } catch (Exception e) {
            System.out.println("Listo rey gracias");
        }

    }

}
