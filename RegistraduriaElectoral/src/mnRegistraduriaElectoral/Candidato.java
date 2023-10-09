/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnRegistraduriaElectoral;

/**
 *
 * @author User
 */
public class Candidato extends Ciudadano{
     String partidopolitico;

    public Candidato(String nombre, String apellido, int edad, String fechaDeExpedicion, int identificacion, String religion, String salud, String direccionlugardenacimiento, String partidopolitico) {
        super(nombre, apellido, edad, fechaDeExpedicion, identificacion, religion, salud, direccionlugardenacimiento);
        this.partidopolitico = partidopolitico;
    }

    public String getPartidoPolitico() {
        return partidopolitico;
    }

    public void setPartidoPolitico(String partidopolitico) {
        this.partidopolitico = partidopolitico;

    }
    
}
