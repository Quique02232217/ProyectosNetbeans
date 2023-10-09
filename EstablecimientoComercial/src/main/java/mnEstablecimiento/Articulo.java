package mnEstablecimiento;

public class Articulo {

    private String nombre;
    public  int cantidad = 0;
    private double precio;

    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean Vendido(int N) {
        if (N <= cantidad) {
            N -= cantidad;
        } else {
            System.out.println("¡ADVERTENCIA!: NO HAY SUFICIENTES PRODUCTOS");
            return false;
        }

        return true;
    }

    public String mostrarDatos() {
        return "NOMBRE: " + nombre + " / CUANTOS HAY:" + cantidad + " / PRECIO: " + precio + '$';
    }

}
