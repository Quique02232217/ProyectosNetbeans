/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import com.sun.tools.javac.Main;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author User
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String key = "somosProgramadores";
        Prueba mMain = new Prueba();
        String cadenaEncriptar = JOptionPane.showInputDialog("Ingrese la cadena: ");
        String cadenaEncriptada = mMain.encriptacion(key);
        System.out.println("Cadena encriptada: "+ cadenaEncriptada);
        String cadenaDesencriptada = mMain.Desencriptacion(key, cadenaEncriptada);
        System.out.println("Cadena desencriptada" + cadenaDesencriptada);
    }
    public String Desencriptacion(String secretKey, String cadenaEncriptada) {
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(cadenaEncriptada.getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Algo Salio mal..."+ e);
            System.out.println(e);
        }
        return desencriptacion;
    }

    public String encriptacion(String ingreso) {
        String encriptacion = "";

        try {
            MessageDigest x = MessageDigest.getInstance("MD5");
            byte[] llave = x.digest(ingreso.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llave, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);

            byte[] samuel = ingreso.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(samuel);
            byte[] sa = Base64.encodeBase64(buf);
            encriptacion = new String(sa);
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            JOptionPane.showMessageDialog(null, "algo salio mal"+e);
        }

        return encriptacion;
    }

}
