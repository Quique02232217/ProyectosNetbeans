package mnGestionEmpresa;

public class Empleado extends Persona {

    double Sueldo;
    String Departamento, Categoria;


    public Empleado(String Nombre, String Estado, int Edad, int dni, double Sueldo, String Departamento, String Categoria) {
        super(Nombre, Estado, Edad, dni);

        this.Nombre = Nombre;
        this.Estado = Estado;
        this.Edad = Edad;
        this.Categoria = Categoria;
        this.dni = dni;
        this.Departamento = Departamento;
        this.Sueldo = Sueldo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCategoria() {
        return Categoria;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + "\nCategoria: " + Categoria + "\nDNI: " + dni + "\nDepartamento: " + Departamento;
    }

}
