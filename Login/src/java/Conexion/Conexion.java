
package Conexion;

import Controller.FacesUtil;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    
    public static final String url = "jdbc:mysql://localhost:3306/ticket";
    public static final String username = "root";
    public static final String password = "02232217";
    
    
    // METODO PARA HACER LA CONEXION
    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, username, password);
            FacesUtil.addErrorMessage(null,"conexion exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException s) {
            FacesUtil.addErrorMessage("error en conexion " + s);
        }
        return con;
    }
}
