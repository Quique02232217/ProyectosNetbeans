package practicahoy;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practicahoy {

    public static void main(String[] args) {
        //<>
        Scanner input = new Scanner(System.in);

        System.out.println("nota 1: ");
        int nota1 = input.nextInt();
        System.out.println("Nota 2: ");
        int nota2 = input.nextInt();
        System.out.println("Nota 3: ");
        int nota3 = input.nextInt();
        System.out.println("Nota 4: ");
        int nota4 = input.nextInt();
        System.out.println("Nota 5");
        int nota5 = input.nextInt();
        System.out.println("Nota 6: ");
        int nota6 = input.nextInt();

        Nota notas = new Nota(nota1, nota2, nota3, nota4, nota5, nota6);
        
        int[] nota = {notas.getN1(), notas.getN2(), notas.getN3(), notas.getN4(), notas.getN5(), notas.getN6()};

        int contador = 0;
        
            for (int i = 0; i < nota.length; i++) {

            if (nota[i] >= 3) {
                System.out.println("notas aprobadas de: "+ nota[i]);
                contador++;
            }

        }
            System.out.println("----------------------------------------------------------");
            System.out.println("Materias aprobadas: "+ contador);

    
    }
}
