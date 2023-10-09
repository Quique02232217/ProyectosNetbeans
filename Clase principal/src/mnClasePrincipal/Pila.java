/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnClasePrincipal;

/**
 *
 * @author User
 */
public class Pila {

    public boolean push(int pilanumerica[], int tope) {
        pilanumerica = new int[5];
        tope = -1;
        if (tope >= pilanumerica.length - 1) {
            return true;
        } else {
            tope += 1;
            return false;
        }

    }
    
    public int pop(int pilanumerica[], int tope){
        pilanumerica = new int[5];
        tope = -1;
        
        if (tope == -1){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("Se ha eliminado el elemento");
            pilanumerica[tope] = 0;
            
        }
        return tope--;
    }
    
    

}
