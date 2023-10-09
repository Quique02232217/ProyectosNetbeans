package mnPassword;

import java.security.SecureRandom;

public class Password {

    int longitud = 8;
    String contraseña;

    public Password(int longitud, String contraseña) {
        this.longitud = longitud;
        this.contraseña = contraseña;

    }

    public Password(int longitud) {
        this.longitud = longitud;

    }

    public String getContraseña() {
        return contraseña;

    }

    public int getLongitud() {
        return longitud;
    }

   

    public boolean esFuerte(String password) {
        int contMay = 0;
        int contNum = 0;
        int contMin = 0;
        for (int i = 0; i < password.length(); i++) {
            char letra = password.charAt(i);
            if (Character.isUpperCase(letra)) {
                contMay++;

            } else if (Character.isDigit(letra)) {
                contNum++;
            } else if (Character.isLowerCase(letra)) {
                contMin++;
            }
        }
        return contMay > 2 && contNum > 5 && contMin > 1;
    }

    public String generarPassword(int longitud) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom Numrandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = Numrandom.nextInt(chars.length());
            sb.append(chars.charAt(indiceAleatorio));
        }

        return sb.toString();

    }

}
