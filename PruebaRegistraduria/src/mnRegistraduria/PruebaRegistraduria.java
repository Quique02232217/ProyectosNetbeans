/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mnRegistraduria;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author User
 */
public class PruebaRegistraduria {

    public String encriptacion(String texto) {
        String encriptacion = "";
        try {
            MessageDigest x = MessageDigest.getInstance("MD5");
            byte[] llave = x.digest(texto.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llave, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);

            byte[] samuel = texto.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(samuel);
            byte[] sa = Base64.encodeBase64(buf);
            encriptacion = new String(sa);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "algo salio mal");
        }

        return encriptacion;
    }
  
}
