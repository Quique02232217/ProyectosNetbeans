/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnGestionEmpresa;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Departamento {
    

    ArrayList<Almacenamiento> empleados;

    public void almacenarEmpleados(Almacenamiento empleado) {
        empleados = new ArrayList<>();
        empleados.add(empleado);
        
    }

}
