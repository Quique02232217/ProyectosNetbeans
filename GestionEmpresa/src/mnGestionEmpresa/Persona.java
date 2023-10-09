package mnGestionEmpresa;

public class Persona {

    int dni, Edad;
    String Nombre, Estado;

    public Persona(String Nombre, String Estado, int Edad, int dni) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Estado = Estado;
        this.dni = dni;

    }

    public String getNombre() {
        return Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDni() {
        return dni;
    }

}
