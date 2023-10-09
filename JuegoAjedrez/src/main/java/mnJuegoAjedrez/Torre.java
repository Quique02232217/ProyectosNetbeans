/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnJuegoAjedrez;

/**
 *
 * @author User
 */
public class Torre {
    String SeMueveAlFrente, MataAlFrente;

    public Torre(String SeMueveAlFrente, String MataAlFrente) {
        this.SeMueveAlFrente = SeMueveAlFrente;
        this.MataAlFrente = MataAlFrente;
    }
    
    public String getSeMueveAlFrente(){
        return SeMueveAlFrente;
    }    
    
    public String getMataAlFrente(){
        return MataAlFrente;
    }
}
