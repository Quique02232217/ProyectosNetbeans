
package mnCajero;

 
public class Usuario {

    String nombre, apellido, usuario;
    int contraseña;
    float saldo;

    public Usuario(String usuario, int contraseña, int saldo) {

        this.contraseña = contraseña;
        
        this.usuario = usuario;

    }
    
    public Usuario(String nombre, String apellido) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;

    }

    public String getNombre() {
        return nombre;

    }

    public String getUsuario() {
        return usuario;

    }

    public int getContraseña() {
        return contraseña;

    }
    
    public float getSaldo(){
        return saldo;
    }

    public String mostrarDatos() {
        return "USUARIO: " + usuario + "CONTRASEÑA: " + contraseña + "SALDO: " + saldo;

    }
    
    public void retirarDinero(int retiro){
        
        
        
    
    
    }
    
    

}
