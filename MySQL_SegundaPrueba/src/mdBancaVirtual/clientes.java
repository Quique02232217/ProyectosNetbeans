package mdBancaVirtual;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class clientes {

    conexiondatos con = new conexiondatos();

    public boolean mandarRegistro(String nrodcto, String nombre, String clave, String tipodcto, String direccion, String telefono) {
        try {
            PreparedStatement pps = con.regresarConexion().prepareStatement("INSERT INTO clientes(NRODCTO,NOMBRE,CLAVE,TIPODCTO,DIRECCION,TELEFONO) VALUES(?,?,?,?,?,?)");
            pps.setString(1, nrodcto);
            pps.setString(2, con.devolverEncriptacion(nombre));
            pps.setString(3, con.devolverEncriptacion(clave));
            pps.setString(4, con.devolverEncriptacion(tipodcto));
            pps.setString(5, con.devolverEncriptacion(direccion));
            pps.setString(6, con.devolverEncriptacion(telefono));
            pps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Guardados");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return false;
        }
    }

    public boolean regresarporID(JTextField id, JTextField Nombre, JTextField clave, JTextField Direccion, JTextField Telefono, JTextField tipodcto) {

        String consulta = "select NRODCTO,NOMBRE,CLAVE,TIPODCTO,DIRECCION,TELEFONO FROM clientes where clientes.NRODCTO=(?);";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, id.getText());
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                Nombre.setText(con.devolverDesencriptacion(rs.getString("NOMBRE")));
                clave.setText(con.devolverDesencriptacion(rs.getString("CLAVE")));
                Direccion.setText(con.devolverDesencriptacion(rs.getString("DIRECCION")));
                Telefono.setText(con.devolverDesencriptacion(rs.getString("TELEFONO")));
                tipodcto.setText(con.devolverDesencriptacion(rs.getString("TIPODCTO")));

                return true;

            } else {
                id.setText("");
                Nombre.setText("");
                clave.setText("");
                Direccion.setText("");
                Telefono.setText("");
                tipodcto.setText("");

                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return false;

        }

    }

    public boolean comprobarInicioSesion(JTextField nrodcto, JTextField clave) {

        String consulta = "select NRODCTO,CLAVE FROM clientes where clientes.NRODCTO=(?);";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, nrodcto.getText());
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                return con.devolverDesencriptacion(rs.getString("CLAVE")).equals(clave.getText());

            } else {
                nrodcto.setText("");
                clave.setText("");
                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return false;

        }
    }

    public boolean comprobarClaveUsuario(String nrodcto, JTextField clave) {
        String consulta = "select NRODCTO,CLAVE FROM clientes where clientes.NRODCTO=(?);";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, nrodcto);
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                return con.devolverDesencriptacion(rs.getString("CLAVE")).equals(clave.getText());

            } else {
                return false;
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return false;

        }
    }

    public void mostrarTablaClientes(JTable Movimiento1) throws SQLException {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("NRODCTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CLAVE");
        modelo.addColumn("TIPODCTO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");

        Movimiento1.setModel(modelo);

        String sql = "SELECT * FROM clientes";

        String datos[] = new String[6];
        Statement st;
        try {
            st = con.regresarConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = con.devolverDesencriptacion(rs.getString(2));
                datos[2] = con.devolverDesencriptacion(rs.getString(3));
                datos[3] = con.devolverDesencriptacion(rs.getString(4));
                datos[4] = con.devolverDesencriptacion(rs.getString(5));
                datos[5] = con.devolverDesencriptacion(rs.getString(6));

                modelo.addRow(datos);

            }
            Movimiento1.setModel(modelo);
        } catch (SQLException ex) {

        }

    }

    public void modificarDatosClientes(JTextField nrodcto, JTextField nombre, JTextField clave, JTextField direccion, JTextField telefono) {

        String consulta = "UPDATE clientes SET clientes.NOMBRE = ?, clientes.CLAVE = ?, clientes.DIRECCION = ?, clientes.TELEFONO = ? WHERE clientes.NRODCTO=?;";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);

            cs.setString(1, con.devolverEncriptacion(nombre.getText()));
            cs.setString(2, con.devolverEncriptacion(clave.getText()));
            cs.setString(3, con.devolverEncriptacion(direccion.getText()));
            cs.setString(4, con.devolverEncriptacion(telefono.getText()));
            cs.setString(5, nrodcto.getText());

            cs.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "modificacion fallida, " + e.toString());
        }
    }

    public void eliminarDatosClientes(JTextField nrodcto) {

        String consulta = "DELETE FROM clientes WHERE clientes.NRODCTO=?;";

        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, nrodcto.getText());

            cs.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO FUNCIONO, " + e.toString());
        }

    }

    public String devolverNombre(String nro) {

        String consulta = "select NOMBRE FROM clientes where clientes.NRODCTO=(?);";
        try {

            CallableStatement cs = con.regresarConexion().prepareCall(consulta);
            cs.setString(1, con.devolverDesencriptacion(nro));
            cs.execute();

            ResultSet rs = cs.executeQuery();

            if (rs.next()) {

                return rs.getString("NOMBRE");

            } else {
                return "";
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "ERROR " + e.toString());
            return "";

        }
    }
}
