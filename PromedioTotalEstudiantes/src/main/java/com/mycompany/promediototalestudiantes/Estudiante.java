/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promediototalestudiantes;

/**
 *
 * @author VALERIN CARDENAS V
 */
public class Estudiante {

    private String nombreestudiante;
    private Asignatura[] listadeasignaturas;
    
    
    public String getNombreestudiante() {
        return nombreestudiante;
    }

    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }

    public Asignatura[] getListadeasignaturas() {
        return listadeasignaturas;
    }

    public void setListadeasignaturas(Asignatura[] listadeasignaturas) {
        this.listadeasignaturas = listadeasignaturas;
    }
    
    public float obtenerNotapromedio(){
        float notapromedio = 0;
        
        if(listadeasignaturas != null){
          
          for(int i=0; i < listadeasignaturas.length; i++){
              Asignatura asignaturaactual = listadeasignaturas[i];
              notapromedio += asignaturaactual.obtenernotafinal();
            }
          
          notapromedio /= listadeasignaturas.length;
          
        }
        return notapromedio;
    }
       
     
}
