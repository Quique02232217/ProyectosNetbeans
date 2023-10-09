/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnQuienesmayor;

/**
 *
 * @author User
 */
public class EdadMayor {
    
    public static int personaMayor(Persona[] person){
        int mayor;
        mayor = person[0].getEdad();
        int i = 1;
        
        while(i<person.length){
            if(person[i].getEdad()> mayor){
                mayor = person[i].getEdad();
            }
            i++;
        }
        
        
        return mayor;
    }
    
}
