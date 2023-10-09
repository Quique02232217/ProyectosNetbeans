
package Controller;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;





@ManagedBean(name = "controlador1")
@SessionScoped
public class Controlador {
    
    
    Conexion conexion = new Conexion();
    
    PreparedStatement ps;
    ResultSet rs;
    
    // registro
    String nombre;
    String apellido;
    String correo;
    String contraseña;

    //inicio de sesion
    String correoSesion;
    String contraseñaSesion;
    
    public Controlador(){
    }
    
    
     public void guardar() {
        Connection con = null;

        try {
            con = Conexion.getConection();
            ps = con.prepareStatement("INSERT INTO registro (nombre, apellido, correo, contraseña) VALUES (?, ?, ?, ?)");

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, correo);
            ps.setString(4, contraseña);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                 FacesUtil.addInfoMessage("registro exitoso");
            } else {
                 FacesUtil.addErrorMessage("error al registrarse");
            }
            con.close();

        } catch (SQLException s) {
            FacesUtil.addErrorMessage("error en la base de datos al guardar registro " + s);
        }
        
         nombre = "";
         apellido = "";
         correo = "";
         contraseña = "";
    }
    

    
    
    
    public String  iniciosesion(){
        
        Connection con = null;
        
        try{
            con = Conexion.getConection();
            ps = con.prepareStatement("SELECT * FROM registro WHERE correo = ? AND contraseña = ?");
            ps.setString(1, correoSesion);
            ps.setString(2, contraseñaSesion);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                FacesContext context = FacesContext.getCurrentInstance();
                ExternalContext externalContext = context.getExternalContext();
                // Redirige a la página de inicio de sesión exitosa
                externalContext.redirect("index_1.xhtml");
            } else {
                FacesUtil.addErrorMessage("contraseña o correo invalidos");
            }
            con.close();
            
        }catch(Exception s){
            FacesUtil.addErrorMessage("error en la base de datos al iniciar sesion " + s);

        }
        correoSesion = "";
        contraseñaSesion = "";
        
        // Si el inicio de sesión falla, permanece en la misma página
        return null;
    }
    

    
    
    

    
    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(PreparedStatement ps) {
        this.ps = ps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public String getCorreoSesion() {
        return correoSesion;
    }

    public void setCorreoSesion(String correoSesion) {
        this.correoSesion = correoSesion;
    }

    public String getContraseñaSesion() {
        return contraseñaSesion;
    }

    public void setContraseñaSesion(String contraseñaSesion) {
        this.contraseñaSesion = contraseñaSesion;
    }
    
    
    
    
    
}
