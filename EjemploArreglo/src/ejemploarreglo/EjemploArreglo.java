package ejemploarreglo;

import java.util.Scanner;

public class EjemploArreglo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5;

        System.out.println("Nota 1: ");
        n1 = input.nextInt();
        System.out.println("Nota 2: ");
        n2 = input.nextInt();
        System.out.println("Nota 3: ");
        n3 = input.nextInt();
        System.out.println("Nota 4: ");
        n4 = input.nextInt();
        System.out.println("Nota 5: ");
        n5 = input.nextInt();
        int[] notas = {n1, n2, n3, n4, n5};
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 3) {
                System.out.println("Reprobado");

            } else {
                System.out.println("Aprobado");
            }

        }

    }

}
