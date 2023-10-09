/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author User
 */
public class Ticket {
    private String nombrePersona;
    private String precioPrenda;
    private String id;
    private String nombrePrenda;
            
    
    public Ticket() {
    }

    public Ticket(String nombrePersona, String precioPrenda, String id, String nombrePrenda) {
        this.nombrePersona = nombrePersona;
        this.precioPrenda = precioPrenda;
        this.id = id;
        this.nombrePrenda = nombrePrenda;
    }
    

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getPrecioPrenda() {
        return precioPrenda;
    }

    public void setPrecioPrenda(String precioPrenda) {
        this.precioPrenda = precioPrenda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombrePrenda() {
        return nombrePrenda;
    }

    public void setNombrePrenda(String nombrePrenda) {
        this.nombrePrenda = nombrePrenda;
    }

    

    
}
