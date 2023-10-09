/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnBancaVirtual;

import javax.swing.*;

import mdBancaVirtual.*;

public class administrador {
    
    cuentas cuenta = new cuentas();
    conexiondatos con = new conexiondatos();
    
    public void seleccionardatosGenerales(JTable tabla, JTextField nrodcto, JTextField nombre, JTextField clave, JTextField tipodcto, JTextField direccion, JTextField telefono) {

        try {

            int fila = tabla.getSelectedRow();

            if (fila >= 0) {

                nrodcto.setText((tabla.getValueAt(fila, 0).toString()));
                nombre.setText(tabla.getValueAt(fila, 1).toString());
                clave.setText(tabla.getValueAt(fila, 2).toString());
                tipodcto.setText(tabla.getValueAt(fila, 3).toString());
                direccion.setText(tabla.getValueAt(fila, 4).toString());
                telefono.setText(tabla.getValueAt(fila, 5).toString());

            }

        } catch (Exception e) {

        }

    }

    public void seleccionardatosCuenta(JTable tabla, JTextField nrodcto) {

        try {

            int fila = tabla.getSelectedRow();

            if (fila >= 0) {
                nrodcto.setText((tabla.getValueAt(fila, 0).toString()));
            }

        } catch (Exception e) {

        }

    }
    
    public void accionSaldo(JComboBox acciones, JTextField monto, JTextField nro){
        
        switch(acciones.getSelectedIndex()){
            case 0 -> cuenta.modificarDatosCuentas(sumar(monto,nro),nro);
            case 1 -> cuenta.modificarDatosCuentas(restar(monto,nro),nro);
            case 2 -> cuenta.modificarDatosCuentas((Double.valueOf(monto.getText())).toString(), nro);
        }
        
    }

    private String sumar(JTextField monto, JTextField nro){
        
        double sumar = Double.parseDouble(con.devolverDesencriptacion(cuenta.devolverSaldoDestino())) + Double.parseDouble(monto.getText());
        
        return String.valueOf(sumar);
    }
    
    private String restar(JTextField monto, JTextField nro){
        
        double restar = Double.parseDouble(con.devolverDesencriptacion(cuenta.devolverSaldoDestino())) - Double.parseDouble(monto.getText());
       
        return String.valueOf(restar);
    }
}
