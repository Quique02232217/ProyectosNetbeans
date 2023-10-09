/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.modelo;

/**
 *
 * @author User
 */
public class Medicamento {
    private String codigo;
    private String nombre;
    private String forma;
    private String fechadecaducidad;
    private String via_consumo;
    private int dosis;

    public Medicamento() {
    }

    public Medicamento(String codigo, String nombre ,String forma, String fechadecaducidad, String via_consumo, int dosis) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.forma = forma;
        this.fechadecaducidad = fechadecaducidad;
        this.via_consumo = via_consumo;
        this.dosis = dosis;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getFechadecaducidad() {
        return fechadecaducidad;
    }

    public void setFechadecaducidad(String fechadecaducidad) {
        this.fechadecaducidad = fechadecaducidad;
    }

    public String getVia_consumo() {
        return via_consumo;
    }

    public void setVia_consumo(String via_consumo) {
        this.via_consumo = via_consumo;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }
    
    
    
    
}
