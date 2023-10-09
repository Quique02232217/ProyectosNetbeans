/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.controller;

import com.modelo.Medicamento;
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
public class MedicamentoController {

    /**
     * Creates a new instance of MedicamentoController
     */
    
    private Medicamento medicamento = new Medicamento();
    private List<Medicamento> listamedicamentos = new ArrayList();
    private List<Medicamento> listamedicamentosjarabe = new ArrayList();

   
    public MedicamentoController() {
    }
    
    public void agregar(){
        if (!existeMedicamento(medicamento)) {
            listamedicamentos.add(medicamento);
            medicamento = new Medicamento();
        } else {
            FacesUtil.addErrorMessage("La actividad ya existe");
        }
        
    }
    
    public void agregarJarabe(){
        if (!existeMedicamentoJarabe(medicamento)) {
            listamedicamentosjarabe.add(medicamento);
            medicamento = new Medicamento();
        } else {
            FacesUtil.addErrorMessage("La actividad ya existe");
        }
        
    }
    
    public boolean existeMedicamento(Medicamento medicam) {
        boolean existe = false;
        
        for (Medicamento m : listamedicamentos) {
            if(m.getCodigo().equals(medicam.getCodigo())){
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    public boolean existeMedicamentoJarabe(Medicamento medicam) {
        boolean existe = false;
        
        for (Medicamento m : listamedicamentosjarabe) {
            if(m.getForma().equals("Jarabe") || m.getForma().equals("Liquido")){
                existe = true;
                break;
            }
        }
        return existe;
    }
    
    
    
    public Medicamento getMedicamento(){
        return medicamento;
    }
    public void setMedicamento(Medicamento medicamen){
        this.medicamento = medicamen;
    }
    
    public List<Medicamento> getListasMedicamentos() {
        return listamedicamentos;
    }
    public void setListasMedicamento(List<Medicamento> listamedicamentos) {
        this.listamedicamentos = listamedicamentos;
    }
    public List<Medicamento> getListasMedicamentosJarabe() {
        return listamedicamentosjarabe;
    }
    public void setListasMedicamentoJarabe(List<Medicamento> listamedicamentosjarabe) {
        this.listamedicamentosjarabe = listamedicamentosjarabe;
    }
    
    
}
