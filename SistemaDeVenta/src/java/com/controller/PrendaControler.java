package com.controller;

import com.modelo.Conexion;
import com.modelo.Prenda;
import Modelo.Ticket;
import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.Connection;

@ManagedBean
@SessionScoped
public class PrendaControler {
    Prenda prenda = new Prenda();
    List<Prenda> listaprenda = new ArrayList<>();
    List<Ticket> listaticket = new ArrayList<>();
    Ticket ticket = new Ticket();

    public PrendaControler() {
    }

    public List<Ticket> getListaticket() {
        return listaticket;
    }

    public void setListaticket(List<Ticket> listaticket) {
        this.listaticket = listaticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public List<Prenda> getListaprenda() {
        return listaprenda;
    }

    public void setListaprenda(List<Prenda> listaprenda) {
        this.listaprenda = listaprenda;
    }

    public void agregarPrendaAlista() {
        listaprenda.add(prenda);
        prenda = new Prenda();
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
                FacesUtils.addErrorMessage("Registro guardado");
            }else{
                FacesUtils.addErrorMessage("Error al guardar el mensaje");
            }
            con.close();
            
        } catch (HeadlessException | SQLException e) {
            FacesUtils.addErrorMessage("Hubo un problema" + e);

        }
        
    }
    
    public void generarTicketTXT(){
        try{
        FileWriter ticketDeCompra = new FileWriter("C:/Users/User/Documents/NetBeansProjects/SistemaDeVenta/Ticketes/ticket.txt");
        for(int i = 0; i < 1; i++){
            ticketDeCompra.write("TICKET DE COMPRA"
                    + "\n"
                    + "Nombre de la cliente ---> "+ticket.getNombrePersona()
                    + "\n"
                    + "identificacion ---> "+ticket.getId()
                    + "\n"
                    + "Producto ---> "+ticket.getNombrePrenda()
                    + "\n"
                    + "TOTAL ---> "+ticket.getPrecioPrenda());
            
        }
        
        ticketDeCompra.close();
        }catch(IOException e){
            FacesUtils.addErrorMessage(e.getMessage());
        }
        
    
    }
    
    
    

}
