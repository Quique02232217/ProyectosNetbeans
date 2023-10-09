package mnEstablecimiento;


public class Persona {

    public int cedula, estrato;
    public String nombre, apellido, trabajo;

    public Persona(String nombre, String apellido, String trabajo, int cedula, int estrato) {
        this.cedula = cedula;
        this.estrato = estrato;
        this.nombre = nombre;
        this.apellido = apellido;
        this.trabajo = trabajo;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEstrato() {
        return estrato;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTrabajo() {
        return trabajo;
    }

    

    public String mostrarDatos() {
        return "NOMBRE: " + nombre + " / APELLIDO: " + apellido + " / CEDULA" + cedula + " / ESTRATO" + estrato;

    }
   
    

}
