package mdBancaVirtual;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class cuentas {

    conexiondatos con = new conexiondatos();

    static String nrodcto;
    String saldo = "10000";
    String tipocuenta;
    static String saldodestino;

    private String fecha() {

        DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");

        String date = dateFormat.format(new Date());

        return date;

    }

    public void traerdatos(String nro, String tipo) {

        guardarnrodcto(nro);
        guardartipodecuenta(tipo);

        mandarDatosCuentas();
    }

    public void guardarnrodcto(String nro) {
        cuentas.nrodcto = con.devolverEncriptacion(nro);
    }

    private void guardartipodecuenta(String tipo) {
        this.tipocuenta = con.devolverEncriptacion(tipo);
    }

    private void mandarDatosCuentas() {
        try {
            PreparedStatement pps = con.regresarConexion().prepareStatement("INSERT INTO cuentas(NRODCTO,FECHACUENTA,SALDO,TIPODECUENTA) VALUES(?,?,?,?)");
            pps.setString(1, nrodcto);
            pps.setString(2, con.devolverEncriptacion(fecha()));
            pps.setString(3, con.devolverEncriptacion(saldo));
            pps.setString(4, tipocuenta);
            pps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public String devolvernrodcto() {
        return nrodcto;
    }

    public void mostrarTabla(JTable Movimiento1) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("NRODCTO");
        modelo.addColumn("FECHA DE CREACION");
        modelo.addColumn("SALDO");
        modelo.addColumn("TIPO DE CUENTA");

        Movimiento1.setModel(modelo);

        String sql = "SELECT * FROM cuentas";

        String datos[] = new String[4];
        Statement st;
        try {
            st = con.regresarConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = con.devolverDesencriptacion(rs.getString(1));
                datos[1] = con.devolverDesencriptacion(rs.getString(2));
                datos[2] = "$ " + con.devolverDesencriptacion(rs.getString(3));
                datos[3] = con.devolverDesencriptacion(rs.getString(4));

                modelo.addRow(datos);

            }
            Movimiento1.setModel(modelo);
        } catch (SQLException ex) {

        }

    }

    public boolean regresarporID(JTextField id, JComboBox tipocuenta, JTextField saldo) {

        String consulta = "select SALDO,TIPODECUENTA FROM cuentas where cuentas.NRODCTO=(?);";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, con.devolverEncriptacion(id.getText()));
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                saldo.setText(con.devolverDesencriptacion(rs.getString("SALDO")));
                tipocuenta.setSelectedItem(con.devolverDesencriptacion(rs.getString("TIPODECUENTA")));

                return true;

            } else {
                id.setText("");

                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return false;

        }

    }

    public String devolverSaldoCuenta() {

        String consulta = "select SALDO FROM cuentas where cuentas.NRODCTO=(?);";
        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, nrodcto);
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                return rs.getString("SALDO");

            } else {
                return "";
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return "";

        }

    }

    public boolean devolverSaldoCuentaAdmin(JTextField nro) {

        String consulta = "select SALDO FROM cuentas where cuentas.NRODCTO=(?);";
        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, con.devolverEncriptacion(nro.getText()));
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                this.saldodestino = rs.getString("SALDO");
                return true;

            } else {
                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Este numero de documento no existe");
            return false;

        }

    }

    public String devolverSaldoDestino() {
        return saldodestino;
    }

    public String devolverNombre(String nro) {

        String consulta = "select NOMBRE FROM clientes where clientes.NRODCTO=(?);";
        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, nro);
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                return con.devolverDesencriptacion(rs.getString("NOMBRE"));

            } else {
                return "";
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return "";

        }

    }

    public void modificarDatosCuentas(String saldo, JTextField txtnrodcto) {

        String consulta = "UPDATE cuentas SET cuentas.SALDO = ? WHERE cuentas.NRODCTO=?;";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);

            cs.setString(1, con.devolverEncriptacion(saldo));
            cs.setString(2, con.devolverEncriptacion(txtnrodcto.getText()));

            cs.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "modificacion fallida, " + e.toString());
        }
    }

    public void modificarDatosCuentasUsuarios(String saldo, String txtnrodcto) {

        String consulta = "UPDATE cuentas SET cuentas.SALDO = ? WHERE cuentas.NRODCTO=?;";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);

            cs.setString(1, con.devolverEncriptacion(saldo));
            cs.setString(2, txtnrodcto);

            cs.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "modificacion fallida, " + e.toString());
        }
    }

    public void eliminarDatosCuentas(JTextField nrodcto) {
        String consulta = "DELETE FROM cuentas WHERE cuentas.NRODCTO=?;";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, con.devolverEncriptacion(nrodcto.getText()));

            cs.execute();

            nrodcto.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO FUNCIONO, " + e.toString());
        }
    }

}
