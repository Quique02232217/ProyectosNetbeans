package mpPassword;

import java.util.Scanner;
import mnPassword.Password;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga la longitud de la contraseña: ");
        int longitud = sc.nextInt();

        Password comprobarSeguridad = new Password(longitud);

        String[] passwordSegura = new String[longitud];
        String[] passwordNoSegura = new String[longitud];
        String[] passwords = new String[longitud];
        for (int i = 0; i < passwords.length; i++) {
            String contraseña = comprobarSeguridad.generarPassword(longitud);

            passwords[i] = contraseña;

            if (comprobarSeguridad.esFuerte(contraseña) == false) {

                passwordNoSegura[i] = contraseña;
                System.out.println(passwordNoSegura[i] + "-->" + comprobarSeguridad.esFuerte(contraseña));
            } else {
                
                passwordSegura[i] = contraseña;
                System.out.println(passwordSegura[i] + "-->" + comprobarSeguridad.esFuerte(contraseña));

            }

        }

    }
}
