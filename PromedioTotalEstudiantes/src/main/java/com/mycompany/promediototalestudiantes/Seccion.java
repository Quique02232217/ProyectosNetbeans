/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.promediototalestudiantes;

import java.util.ArrayList;

/**
 *
 * @author VALERIN CARDENAS V
 */
public class Seccion {
    private ArrayList <Estudiante> listadeestudiantes;
    
   public Seccion(){
        listadeestudiantes = new ArrayList <> ();
    }

    public ArrayList <Estudiante> getListadeestudiantes() {
        return listadeestudiantes;
    }

    public void setListadeestudiantes(ArrayList <Estudiante> listadeestudiantes) {
        this.listadeestudiantes = listadeestudiantes;
    }
    
    public float calcularnotapromedio(){
       float notapromedio = 0; 
        
        for(int i = 0; i < listadeestudiantes.size(); i++){
            Estudiante estudianteactual = listadeestudiantes.get(i);
            notapromedio += estudianteactual.obtenerNotapromedio();
        }
        
        notapromedio /= listadeestudiantes.size();
        return notapromedio;
    }
    
    public int obtenercantidaddeestudiantes(){
        return listadeestudiantes.size();
    }
    
    public int obtenerestudiantesaprobados(){
        int estudiantesaprobados = 0;
        
        for (int i = 0; i<listadeestudiantes.size(); i++){
            Estudiante estudianteactual = listadeestudiantes.get(i);
            float notapromedio = estudianteactual.obtenerNotapromedio();
            
            if(notapromedio >= 3.0){
                estudiantesaprobados += 1;
            }
            
        }
        return estudiantesaprobados;
    }
    
    public int obtenerestudiantesnoaprobados(){
        int estudiantesnoaprobados = listadeestudiantes.size() - obtenerestudiantesaprobados();
        return estudiantesnoaprobados;
    }
}
