/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnbanco;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cajero {

    ArrayList<Persona> usuarios;
    
    public Cajero (){
        usuarios = new ArrayList<>();
    }
    
    public void agregarUsuarios(Persona p){
        usuarios.add(p);
    }

    


}
