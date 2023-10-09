package mnSimulacionCine;

public class Espectador {

    private String Nombre;
    private int Edad, Dinero;

    public Espectador(String Nombre, int Edad, int Dinero) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dinero = Dinero;

    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }
    
    

}
