package Conexion;


import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection conexion;
    java.sql.Statement st;
    
    public Conexion(String host,String user, String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagenes", "root", "02232217"); 
            st = conexion.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean guardarImagen(String ruta,String nombre){
	String insert = "insert into Imagenes(imagen,nombre) values(?,?)";
	FileInputStream fis = null;
	PreparedStatement ps = null;
	try {
		conexion.setAutoCommit(false);
		File file = new File(ruta);
		fis = new FileInputStream(file);
		ps = conexion.prepareStatement(insert);
		ps.setBinaryStream(1,fis,(int)file.length());
		ps.setString(2, nombre);
		ps.executeUpdate();
		conexion.commit();
		return true;
	} catch (Exception ex) {
		Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
	}finally{
		try {
			ps.close();
			fis.close();
		} catch (Exception ex) {
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		}
	}        
	return false;
}
}
