/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.controller;

import com.modelo.Actividad;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author docente
 */
@ManagedBean
@SessionScoped
public class ActividadController {

    private Actividad actividad = new Actividad();
    private List<Actividad> actividades = new ArrayList();

    /**
     * Creates a new instance of ActividadController
     */
    public ActividadController() {
    }

    public void agregar() {
        if (!existeActividad(actividad)) {
            actividad.setEstado("Pendiente");
            actividades.add(actividad);
            actividad = new Actividad();
        } else {
            FacesUtil.addErrorMessage("La actividad ya existe");
        }
    }

    public void eliminar(Actividad act) {
        actividades.remove(act);
        FacesUtil.addErrorMessage("Se eliminó correctamente la actividad");
    }

    public void revisar(Actividad act) {
        act.setEstado("Revisada");
    }

    public void realizar(Actividad act) {
        act.setEstado("Realizada");
    }

    public boolean existeActividad(Actividad act) {
        boolean existe = false;
        for (Actividad a : actividades) {
            if (a.getCodigo().equals(act.getCodigo())) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /**
     * @return the actividad
     */
    public Actividad getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    /**
     * @return the actividades
     */
    public List<Actividad> getActividades() {
        return actividades;
    }

    /**
     * @param actividades the actividades to set
     */
    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

}
