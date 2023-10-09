package calculadorapolacainversaapp;

import java.util.Scanner;

public class CalculadoraPolacaInversaApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.println("Escribe el segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.println("Diga el signo: ");
        String signo = sc.next();

        if (signo.equals("+")) {
            double suma = num1 + num2;
            System.out.println("Tu suma es: " + suma);

        } else if (signo.equals("-")) {
            double resta = num1 - num2;
            System.out.println("Tu resta es: " + resta);

        } else if (signo.equals("*")) {
            double multiplicacion = num1 * num2;
            System.out.println("Tu multiplicacion es: " + multiplicacion);
        } else if (signo.equals("/")) {
            double division = num1 / num2;
            System.out.println("Tu division es: " + division);
        } else if (signo.equals("^")) {
            int potencia = (int) Math.pow(num1, num2);
            System.out.println("El numero " + num1 + " Elevado a la potencia " + num2 + " Es: " + potencia);

        } else if (signo.equals("%")) {
            double residuo = num1 % num2;
            System.out.println("El residuo es: " + residuo);
        }

    }

}
