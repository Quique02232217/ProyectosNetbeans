package mnbanco;

public class Persona {

    String nombre, apellido, usuario;
    int contraseña, monto;

    public Persona(String nombre, String apellido, String usuario, int contraseña, int monto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;

    }

    public String getApellido() {
        return apellido;

    }

    public String usuario() {
        return usuario;

    }

    public int getContraseña() {
        return contraseña;

    }

    public int getMonto() {
        return monto;

    }
    
    public String mostrarDatos(){
        return "nombre: "+ nombre + "apellido: "+ apellido + "monto: " + monto;
    
    }

}
