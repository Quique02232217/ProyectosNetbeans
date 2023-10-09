package mnComercializadoraOliVanders;

public class Producto {

    private int identificacion;
    private String nombre;
    private double valor;
    private String nombreProveedor;
    private int cantidad;


    public Producto(String nombre, int cantidad, int identificacion, double valor, String nombreProveedor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.identificacion = identificacion;
        this.valor = valor;
        this.nombreProveedor = nombreProveedor;
    }

    


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    
    public String mostrarInformacionDeExistencia() {
        return "identificacion ---> " + identificacion +  "\n" +"Cantidad -->" + cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", valor=" + valor + ", nombreProveedor=" + nombreProveedor + ", cantidad=" + cantidad + '}';
    }
    
    

}
