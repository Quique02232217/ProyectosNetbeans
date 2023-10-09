package mnBancaVirtual;

import javax.swing.JTextField;

import mdBancaVirtual.*;

public class restriccionesRegistro {

    validaciondatos validacion = new validaciondatos();
    
    
    public boolean limiteclave(JTextField clave) {

        if (clave.getText().length() == 4 && validacion.verificarValor(clave.getText(), 0)) {

            return validacion.comprobarEnteros(clave);

        } else {

            clave.setText("");
            return false;
        }

    }

    public boolean limitenrodcto(JTextField nrodcto) {
        if (nrodcto.getText().length() == 10 && validacion.verificarValor(nrodcto.getText(), 0)) {

            return validacion.comprobarEnteros(nrodcto);

        } else {

            nrodcto.setText("");
            return false;
        }

    }

    public boolean limitetelefono(JTextField telefono) {
        
        if (telefono.getText().length() == 10 && validacion.verificarValor(telefono.getText(), 0)) {

            return validacion.comprobarEnteros(telefono);

        } else {

            telefono.setText("");
            return false;
        }

    }

}
