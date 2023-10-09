package calculobinario;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculoBinario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numero n = new Numero("", 0);
        System.out.println("Escribe: ");
        String cadena = input.nextLine();
        
        Boolean b;

        for (int i = 0; i < cadena.length(); i++) {
            if (n.numero == "1" && n.numero == "0") {
                System.out.println("Es binario");
            } else {

                if (Character.isDigit(cadena.charAt(i))) {
                    n.n_numero++;
                    n.numero += cadena.charAt(i);
                    System.out.println("No es binario");
                }
            }
        }
        System.out.println("NUMEROS :(" + n.getN_numero() + ")" + n.getNumero());
        
    }

}
