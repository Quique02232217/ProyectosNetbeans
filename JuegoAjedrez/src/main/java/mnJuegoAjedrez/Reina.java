/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnJuegoAjedrez;

/**
 *
 * @author User
 */
public class Reina {
    String seMueveLibre, MataLibre;
    
    public Reina(String seMueveLibre, String MataLibre){
        this.seMueveLibre = seMueveLibre;
        this.MataLibre = MataLibre;
    }
    
    public String getSeMueveLibre(){
        return seMueveLibre;
    }
    
    public String getMataLibre(){
        return MataLibre;
    
    }
    
}
