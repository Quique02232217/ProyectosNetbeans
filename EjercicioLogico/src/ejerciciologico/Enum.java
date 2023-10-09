/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciologico;

/**
 *
 * @author User
 */
public class Enum {

    public boolean mostrarTrabajo(String dia) {

        if(dia.equals("Lunes")){
            return true;
        }else if(dia.equals("Martes")){
            return false;
        }else if(dia.equals("Miercoles")){
            return true;
        }else if(dia.equals("Jueves")){
            return false;
        }else if(dia.equals("Viernes")){
            return true;
        }else if(dia.equals("Sabado")){
            return false;
        }else if(dia.equals("Domingo")){
            return false;
        }
        
        
        return false;

    }


}
