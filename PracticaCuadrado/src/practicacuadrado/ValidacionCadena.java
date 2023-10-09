package practicacuadrado;

import java.util.Scanner;

public class ValidacionCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        boolean esValida = validarCadena(cadena);
        if (esValida) {
            System.out.println("La cadena es válida.");
        } else {
            System.out.println("La cadena no es válida.");
        }
    }

    public static boolean validarCadena(String cadena) {
        
        for (int i = 0; i < cadena.length() - 1; i++) {
            if (cadena.substring(i + 1).contains(String.valueOf(cadena.charAt(i)))) {
                return false;
            }
        }

        for (int i = 0; i < cadena.length() - 1; i++) {
            char currentChar = cadena.charAt(i);
            char nextChar = cadena.charAt(i + 1);

            if (Character.isDigit(currentChar) && Character.isDigit(nextChar)) {
                int currentNum = Character.getNumericValue(currentChar);
                int nextNum = Character.getNumericValue(nextChar);

                if (currentNum + 1 == nextNum) {
                    return false;
                }
            }
        }

        return true;
    }
}
