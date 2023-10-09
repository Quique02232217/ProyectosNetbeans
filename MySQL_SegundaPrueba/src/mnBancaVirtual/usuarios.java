package mnBancaVirtual;

import javax.swing.JTextField;
import mdBancaVirtual.*;

public class usuarios {

    cuentas cuenta = new cuentas();
    conexiondatos con = new conexiondatos();

    public boolean limitedetuSaldo(JTextField monto) {
        return (Double.parseDouble(monto.getText()) > Double.parseDouble(con.devolverDesencriptacion(cuenta.devolverSaldoCuenta())) || (Double.parseDouble(monto.getText()) <= 0));
    }

    public void accionSaldo(JTextField monto, JTextField nro) {

        cuenta.modificarDatosCuentas(sumar(monto), nro);
        cuenta.modificarDatosCuentasUsuarios(restar(monto), cuenta.devolvernrodcto());
    }

    public void accionRetirar(JTextField monto){
        cuenta.modificarDatosCuentasUsuarios(restar(monto), cuenta.devolvernrodcto());
    }
    
    private String sumar(JTextField monto) {

        double sumar = Double.parseDouble(con.devolverDesencriptacion(cuenta.devolverSaldoDestino())) + Double.parseDouble(monto.getText());

        return String.valueOf(sumar);
    }

    private String restar(JTextField monto) {

        double sumar = Double.parseDouble(con.devolverDesencriptacion(cuenta.devolverSaldoCuenta())) - Double.parseDouble(monto.getText());

        return String.valueOf(sumar);
    }
    
    

}
