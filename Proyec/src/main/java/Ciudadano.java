public class Ciudadano {
    String nombre, apellido;
    int cedula;
    
    
    public Ciudadano(String nombre, String apellido, int cedula){
        this.apellido = apellido;
        this.cedula = cedula;
        this.nombre = nombre;
        
        
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }
    
}
