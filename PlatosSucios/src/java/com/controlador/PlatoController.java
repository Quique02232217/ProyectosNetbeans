/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.controlador;

import com.modelo.Plato;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class PlatoController {

    private Plato plato = new Plato("12","sucio","redondo");
    private Stack<Plato> pilaplatos = new Stack<>();
    private List<Plato> listaplatos = new ArrayList<>();
    
    private Plato platoAlavar = new Plato();
    private Plato platoEntregado = new Plato();

    /**
     * Creates new instance of PlatoController
     */
    public PlatoController() {
    }
    public void entregar(){
        platoEntregado.setEstado("sucio");
        pilaplatos.push(platoEntregado);
        platoEntregado = new Plato();
        
    }
    public void seleccionar(){
        platoAlavar = pilaplatos.pop();
        
    }
    
    public void devolver(){
        listaplatos.add(platoAlavar);
        platoAlavar = new Plato();
    }
    
    public Plato getPlato(){
        return plato;
    }
    
    public void setPlato(Plato plato){
        this.plato = plato;
    }
        public Stack<Plato> getPilaplatos() {
        return pilaplatos;
    }

    public void setPilaplatos(Stack<Plato> pilaplatos) {
        this.pilaplatos = pilaplatos;
    }

    public List<Plato> getListaplatos() {
        return listaplatos;
    }

    public void setListaplatos(List<Plato> listaplatos) {
        this.listaplatos = listaplatos;
    }

    
    public Plato getPlatoAlavar() {
        return platoAlavar;
    }

    public void setPlatoAlavar(Plato platoAlavar) {
        this.platoAlavar = platoAlavar;
    }

    public Plato getPlatoEntregado() {
        return platoEntregado;
    }

    public void setPlatoEntregado(Plato platoEntregado) {
        this.platoEntregado = platoEntregado;
    }

}
