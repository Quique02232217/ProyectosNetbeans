package mnRegistraduriaElectoral;


public class Ciudadano {
    String nombre, apellido, fechaDeExpedicion, religion, salud, direccionlugardenacimiento;
    int identificacion, edad;
            

    public Ciudadano(String nombre, String apellido, int edad, String fechaDeExpedicion, int identificacion,
            String religion, String salud, String direccionlugardenacimiento) {
        this.apellido = apellido;
        this.fechaDeExpedicion = fechaDeExpedicion;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.religion = religion;
        this.salud = salud;
        this.direccionlugardenacimiento = direccionlugardenacimiento;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getFechaDeExpedicion() {
        return fechaDeExpedicion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getDireccionlugardenacimiento() {
        return direccionlugardenacimiento;
    }

    public void setDireccionlugardenacimiento(String direccionlugardenacimiento) {
        this.direccionlugardenacimiento = direccionlugardenacimiento;
    }

    
    public void setFechaDeExpedicion(String fechaDeExpedicion) {
        this.fechaDeExpedicion = fechaDeExpedicion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    
}
