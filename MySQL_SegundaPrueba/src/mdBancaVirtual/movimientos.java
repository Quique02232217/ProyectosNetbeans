package mdBancaVirtual;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class movimientos {

    conexiondatos con = new conexiondatos();
    cuentas cuenta = new cuentas();

    private String fecha_hora() {
        DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy, HH:mm");

        String date = dateFormat.format(new Date());

        return date;
    }

    public void mandarDatosMovimientosAdmin(JTextField nro, JTextField monto, JComboBox acciones) {
        try {
            PreparedStatement pps = con.regresarConexion().prepareStatement("INSERT INTO movimientos(NRODCTO,TIPOMVTO,NRODCTODESTINO,SALDO,FECHAMOVIMIENTO) VALUES(?,?,?,?,?)");

            pps.setString(1, cuenta.devolvernrodcto());
            pps.setString(2, con.devolverEncriptacion(tipomvto(acciones)));
            pps.setString(3, con.devolverEncriptacion(nro.getText()));
            pps.setString(4, con.devolverEncriptacion(monto.getText()));
            pps.setString(5, con.devolverEncriptacion(fecha_hora()));
            pps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void mandarDatosMovimientosUsuarios(JTextField nro, JTextField monto, String accion) {
        try {
            PreparedStatement pps = con.regresarConexion().prepareStatement("INSERT INTO movimientos(NRODCTO,TIPOMVTO,NRODCTODESTINO,SALDO,FECHAMOVIMIENTO) VALUES(?,?,?,?,?)");

            pps.setString(1, cuenta.devolvernrodcto());
            pps.setString(2, con.devolverEncriptacion(accion));

            if (nro != null) {
                pps.setString(3, con.devolverEncriptacion(nro.getText()));
            } else {
                pps.setString(3, con.devolverEncriptacion(""));
            }

            pps.setString(4, con.devolverEncriptacion(monto.getText()));
            pps.setString(5, con.devolverEncriptacion(fecha_hora()));
            pps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    private String tipomvto(JComboBox acciones) {

        return switch (acciones.getSelectedIndex()) {
            case 0 ->
                "Consignar";
            case 1 ->
                "Quitar";
            case 2 ->
                "Reemplazar";
            default ->
                "";
        };
    }

    public void mostrarTablaCondicion(JTextField NRODCTO, JTable Movimiento1) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NRODCTO");
        modelo.addColumn("TIPOMVTO");
        modelo.addColumn("NRODCTODESTINO");
        modelo.addColumn("VALOR");
        modelo.addColumn("FECHA");
        Movimiento1.setModel(modelo);

        String sql = "SELECT * FROM movimientos";

        String datos[] = new String[5];
        Statement st;
        try {
            st = con.regresarConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(2).equals(con.devolverEncriptacion(NRODCTO.getText())) || rs.getString(4).equals(con.devolverEncriptacion(NRODCTO.getText()))) {

                    datos[0] = con.devolverDesencriptacion(rs.getString(2));
                    datos[1] = con.devolverDesencriptacion(rs.getString(3));
                    datos[2] = con.devolverDesencriptacion(rs.getString(4));
                    datos[3] = "$" + con.devolverDesencriptacion(rs.getString(5));
                    datos[4] = con.devolverDesencriptacion(rs.getString(6));

                    modelo.addRow(datos);
                }

            }
            Movimiento1.setModel(modelo);
        } catch (SQLException ex) {

        }

    }

    public void mostrarTablaAdmin(JTable Movimiento1) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NRODCTO");
        modelo.addColumn("TIPOMVTO");
        modelo.addColumn("NRODCTODESTINO");
        modelo.addColumn("VALOR");
        modelo.addColumn("FECHA");
        Movimiento1.setModel(modelo);

        String sql = "SELECT * FROM movimientos";

        String datos[] = new String[5];
        Statement st;
        try {
            st = con.regresarConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = con.devolverDesencriptacion(rs.getString(2));
                datos[1] = con.devolverDesencriptacion(rs.getString(3));
                datos[2] = con.devolverDesencriptacion(rs.getString(4));
                datos[3] = "$" + con.devolverDesencriptacion(rs.getString(5));
                datos[4] = con.devolverDesencriptacion(rs.getString(6));

                modelo.addRow(datos);

            }
            Movimiento1.setModel(modelo);
        } catch (SQLException ex) {

        }

    }

    public void mostrarTablaUsuario(JTable Movimiento1) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("MOVIMIENTOS");
        Movimiento1.setModel(modelo);

        String sql = "SELECT * FROM movimientos";

        String datos[] = new String[1];
        Statement st;
        try {
            st = con.regresarConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString(2).equals((cuenta.devolvernrodcto()))) { //USUARIO ES EL ORIGEN

                    switch (con.devolverDesencriptacion(rs.getString(3))) {
                        case "Consignar":
                            datos[0] = "[" + con.devolverDesencriptacion(rs.getString(6)) + "] Enviaste $" + con.devolverDesencriptacion(rs.getString(5)) + " a " + cuenta.devolverNombre(con.devolverDesencriptacion(rs.getString(4)));
                            break;
                        case "Retirar":
                            datos[0] = "[" + con.devolverDesencriptacion(rs.getString(6)) + "] Retiraste la cantidad de $" + con.devolverDesencriptacion(rs.getString(5));
                            break;
                    }

                    modelo.addRow(datos);

                } else if (rs.getString(4).equals((cuenta.devolvernrodcto()))) { //USUARIO ES EL DESTINO
                    datos[0] = "[" + con.devolverDesencriptacion(rs.getString(6)) + "] " +cuenta.devolverNombre(con.devolverDesencriptacion(rs.getString(2))) + " " + textoCondicional(con.devolverDesencriptacion(rs.getString(3))) + "" + con.devolverDesencriptacion(rs.getString(5));
                    modelo.addRow(datos);
                }
            }

            Movimiento1.setModel(modelo);
        } catch (SQLException ex) {

        }

    }

    private String textoCondicional(String a) {

        return switch (a) {
            case "Consignar" ->
                "te consigno la cantidad de $";
            case "Quitar" ->
                "resto de tu saldo la cantidad de $";
            case "Reemplazar" ->
                "reemplazo tú saldo por la cantidad de $";
            default ->
                "";
        };
    }

}
