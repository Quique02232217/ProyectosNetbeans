package mnEstablecimiento;


public class ArticuloR extends Articulo {
    
    private String talla; //M, L, S, ETC

    public ArticuloR(String nombre, int cantidad, double precio, String talla) {
        super(nombre, cantidad, precio);
        this.talla = talla;
    }


    public String getTalla() {
        return talla;
    }
    
    @Override
     public boolean Vendido(int N) {
        if (N <= cantidad) {
            N -= cantidad;
        } else {
            System.out.println("¡ADVERTENCIA!: NO HAY SUFICIENTES PRODUCTOS");
            return false;
        }

        return true;
    }
    
    public String mostrarDatosR(){
        return "nombre: "+getNombre()+" / Precio: "+getPrecio()+" / Cantidad: "+getCantidad()+" / Talla: "+talla;
    
    }
}
