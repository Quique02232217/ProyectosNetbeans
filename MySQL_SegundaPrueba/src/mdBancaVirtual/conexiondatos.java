package mdBancaVirtual;

import java.security.MessageDigest;
import java.sql.*;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class conexiondatos {

    private static final String URL = "jdbc:mysql://localhost:223/banca";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "02232217";

    private final String key = "encriptaciondatos";
    static Connection cn;

    public static Connection establecerConexion() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            cn = con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }

    private SecretKeySpec CrearClave(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;

        } catch (Exception e) {
            return null;
        }
    }

    private String encriptar(String encriptar) {
        try {
            SecretKeySpec secretKeySpec = CrearClave(key);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptad = Base64.getEncoder().encodeToString(encriptada);

            return cadena_encriptad;
        } catch (Exception e) {
            return "";
        }

    }

    private String desencriptar(String desencriptar) {
        try {
            SecretKeySpec secretKeySpec = CrearClave(key);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.getDecoder().decode(desencriptar);
            byte[] desencritacion = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencritacion);

            return cadena_desencriptada;

        } catch (Exception e) {

            return "";
        }

    }

    public Connection regresarConexion() {
        return cn;
    }

    public String devolverEncriptacion(String dato) {
        return encriptar(dato);
    }

    public String devolverDesencriptacion(String dato) {
        return desencriptar(dato);
    }

}
