package mnCajeroAutomatico;

public class Persona {

    String nombre, apellido, usuario;
    int contraseña,saldo;

    public Persona(String nombre, String apellido, String usuario, int contraseña, int saldo) {
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.usuario = usuario;
        this.saldo = saldo;
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
    
    public int getSaldo(){
        return saldo;
    }

    public String mostrarDatos() {
        return "NOMBRE: " + nombre + "APELLIDO: " + apellido + "USUARIO: " + usuario + "CONTRASEÑA: " + contraseña+"SALDO: "+saldo;

    }

}
