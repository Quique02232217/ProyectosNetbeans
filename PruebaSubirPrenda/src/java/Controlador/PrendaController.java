/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controlador;

import Modelo.Prenda;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class PrendaController {

    private List<Prenda> listadeprendas = new ArrayList<>();
    private Prenda prenda = new Prenda();
    public PrendaController() {
    }

    public Prenda subirPrendaAlaLista(){
        listadeprendas.add(prenda);
        return prenda = new Prenda();
    
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }
    
    
    
    public List<Prenda> getListadeprendas() {
        return listadeprendas;
    }

    public void setListadeprendas(List<Prenda> listadeprendas) {
        this.listadeprendas = listadeprendas;
    }
    
}
