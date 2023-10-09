/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promediototalestudiantes;

/**
 *
 * @author VALERIN CARDENAS V
 */
public class Asignatura {

    private String nombreasignatura;
    private float notavaloraciondocente;
    private float notaproyectodeaula;
    private float notaautoevaluacion;

    public String getNombreasignatura() {
        return nombreasignatura;
    }

    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    public float getNotavaloraciondocente() {
        return notavaloraciondocente;
    }

    public void setNotavaloraciondocente(float notavaloraciondocente) throws Exception {
        
        if((notavaloraciondocente>5.0)||(notavaloraciondocente<0.0)){
            throw new Exception("NOTA FUERA DEL RANGO");
        }
        
        this.notavaloraciondocente = notavaloraciondocente;
    }

    public float getNotaproyectodeaula() {
        return notaproyectodeaula;
    }

    public void setNotaproyectodeaula(float notaproyectodeaula) throws Exception {
        
        if((notaproyectodeaula>5.0)||(notaproyectodeaula<0.0)){
           throw new Exception("NOTA FUERA DEL RANGO"); 
        }
            
        this.notaproyectodeaula = notaproyectodeaula;
    }

    public float getNotaautoevaluacion() {
        return notaautoevaluacion;
    }

    public void setNotaautoevaluacion(float notaautoevaluacion) throws Exception {
        
        if((notaautoevaluacion>5.0)||(notaautoevaluacion<0.0)){
           throw new Exception("NOTA FUERA DEL RANGO"); 
        }
        
        this.notaautoevaluacion = notaautoevaluacion;
    }

    public float obtenernotafinal(){
        float notafinal = (float)((notavaloraciondocente*0.60)+(notaproyectodeaula*0.25)+(notaautoevaluacion*0.15));
        return notafinal;
    }
    
    public boolean esaprobado (){
        float notafinal = obtenernotafinal();
        if(notafinal < 3.0){
            return false;
        }
        else{
            return true;
        }
        
    }
    
}
