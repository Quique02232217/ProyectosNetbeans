package Controller;


import Conexion.Conexion;
import Modelo.Ticket;
import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Controlador_1 implements Serializable {

    private List<Producto> productos;
    private List<Producto> carrito;
    private List<Producto> historial = new ArrayList<>(); // Agregamos el historial como una lista
    private Producto productoSeleccionado; // Producto seleccionado para ver detalles
    private int paginaActual;
    private final int productosPorPagina = 10;
    Ticket ticket = new Ticket();

    
    public Controlador_1() {
        productos = new ArrayList<>();
        carrito = new ArrayList<>();
        paginaActual = 1;

        // Agrega algunos productos de ejemplo
        for (int i = 1; i <= 30; i++) {
            productos.add(new Producto("Producto " + i, i * 10.0));
        }
    }
    
    

    public List<Producto> getProductos() {
        int desde = (paginaActual - 1) * productosPorPagina;
        int hasta = Math.min(paginaActual * productosPorPagina, productos.size());
        return productos.subList(desde, hasta);
    }
    
    
    public void generarCompra() {
        PreparedStatement ps;
        ResultSet rss;
        Connection con = null;
        
        
        try {
            
            con = Conexion.getConection();
            
            ps = con.prepareStatement("INSERT INTO registrarticket (id,nombrePersona,nombrePrenda,precionPrenda) VALUES(?,?,?,?)");
            ps.setString(1, ticket.getId());
            ps.setString(2, ticket.getNombrePersona());
            ps.setString(3, ticket.getNombrePrenda());
            ps.setString(4, ticket.getPrecioPrenda());
            int rs = ps.executeUpdate();
            
            if(rs > 0){
                FacesUtil.addErrorMessage("Registro guardado");
            }else{
                FacesUtil.addErrorMessage("Error al guardar el mensaje");
            }
            con.close();
            
        } catch (HeadlessException | SQLException e) {
            FacesUtil.addErrorMessage("Hubo un problema" + e);

        }
        
    }
    
    public void generarTicketTXT(){
        try{
        FileWriter ticketDeCompra = new FileWriter("C:/Users/User/Documents/NetBeansProjects/Login/Guarda/ticket.txt");
        for(int i = 0; i < 1; i++){
            ticketDeCompra.write("TICKET DE COMPRA"
                    + "\n"
                    + "Nombre de la cliente ---> "+ticket.getNombrePersona()
                    + "\n"
                    + "identificacion ---> "+ticket.getId()
                    + "\n"
                    + "Producto ---> "+getProductoSeleccionado().getNombre()
                    + "\n"
                    + "TOTAL ---> "+getProductoSeleccionado().getPrecio());
            
        }
        
        ticketDeCompra.close();
        }catch(IOException e){
            FacesUtil.addErrorMessage(e.getMessage());
        }
        
    
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    

    public List<Producto> getCarrito() {
        return carrito;
    }

    public List<Producto> getHistorial() {
        return historial;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void paginaAnterior() {
        if (paginaActual > 1) {
            paginaActual--;
        }
    }

    public double getTotalCarrito() {
        totalCarrito = calcularTotalCarrito();
        return totalCarrito;
    }

    private double totalCarrito;

    private double calcularTotalCarrito() {
        double total = 0.0;

        for (Producto producto : carrito) {
            total += producto.getPrecio();
        }

        return total;
    }

    public void paginaSiguiente() {
        int totalPaginas = (int) Math.ceil((double) productos.size() / productosPorPagina);
        if (paginaActual < totalPaginas) {
            paginaActual++;
        }
    }

    public boolean isMostrarSiguiente() {
        int totalPaginas = (int) Math.ceil((double) productos.size() / productosPorPagina);
        return paginaActual < totalPaginas;
    }

    public void agregarAlCarrito(Producto producto) {
        carrito.add(producto);
    }

    // Método para agregar productos al historial desde el diálogo de detalles
    public void agregarAlHistorialDesdeDetalle() {
        if (productoSeleccionado != null) {
            historial.add(productoSeleccionado);
        }
    }
    
    public void agregarAlHistorialDesdeVista(Producto producto) {
    historial.add(producto);
}


    public String agregarAlCarritoDesdeDetalle() {
        if (productoSeleccionado != null) {
            carrito.add(productoSeleccionado);
            historial.add(productoSeleccionado);
        }
        // Puedes redirigir a otra página o simplemente refrescar la página actual
        return null;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
}