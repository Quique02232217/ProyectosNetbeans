package mdBancaVirtual;

import java.util.Arrays;
import javax.swing.JTextField;

public class validaciondatos {

    Character numeros[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.'};

    public boolean comprobarEnteros(JTextField clave) {

        boolean temp = false;

        for (int i = 0; i < clave.getText().length(); i++) {

            if (Arrays.asList(numeros).contains(clave.getText().charAt(i))) {
                temp = true;

            } else {
                temp = false;
                break;
            }
        }
        return temp;
    }

    public boolean verificarValor(String valor, int cant) {

        int contar = 0;

        for (int i = 0; i < valor.length(); i++) {

            if (valor.charAt(i) == '.') {
                contar++;
            }

        }

        return contar <= cant;

    }
}
