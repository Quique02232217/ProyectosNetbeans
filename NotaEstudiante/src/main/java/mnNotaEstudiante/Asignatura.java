package mnNotaEstudiante;



public class Asignatura {

    String nombre;
    double notaDocente;
    double notaProyectoDeAula, notaAutoevaluacion, notaDefinitiva;

    
    public Asignatura(String nombre, double notaDocente, double notaProyectoDeAula, double notaAutoevaluacion) {
        this.nombre = nombre;
        this.notaDefinitiva = notaDefinitiva;
        this.notaDocente = notaDocente;
        this.notaAutoevaluacion = notaAutoevaluacion;
        this.notaProyectoDeAula = notaProyectoDeAula;

    }
    
    public Asignatura(){
    
    
    }

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    public void setNotaDefinitiva(double notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }

   

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaDocente() {
        return notaDocente;

    }

    public void setNotaDocente(double notadocente) {
        this.notaDocente = notadocente;

    }

    public double getNotaProyectoDeAula() {
        return notaProyectoDeAula;
    }

    public void setNotaProyectoDeAula(double notaProyectoDeAula) {
        this.notaProyectoDeAula = notaProyectoDeAula;
    }

    public double getNotaAutoevaluacion() {
        return notaAutoevaluacion;
    }

    public void setNotaAutoevaluacion(double notaAutoevaluacion) {
        this.notaAutoevaluacion = notaAutoevaluacion;
    }

    
    
}
