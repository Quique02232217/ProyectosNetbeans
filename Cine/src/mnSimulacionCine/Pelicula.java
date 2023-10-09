package mnSimulacionCine;

public class Pelicula {

    private String Titulo, Director;
    private int Duracion, Edad_Minima;
    
    public Pelicula(){
    
    }
    public Pelicula(String Titulo){
        this.Titulo = Titulo;
    }

    public Pelicula(String Titulo, String Director, int Duracion, int Edad_Minima) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
        this.Edad_Minima = Edad_Minima;

    }

    public String getTitulo() {
        return Titulo;

    }

    public String getDirector() {
        return Director;
    }

    public int getDuracion() {
        return Duracion;
    }

    public int getEdad_Minima() {
        return Edad_Minima;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public void setEdad_Minima(int Edad_Minima) {
        this.Edad_Minima = Edad_Minima;
    }

}
