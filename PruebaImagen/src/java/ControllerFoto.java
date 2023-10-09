/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.awt.Image;
import java.awt.Toolkit;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author User
 */
@ManagedBean
@RequestScoped
public class ControllerFoto {
    String ruta,nombre;
    
    public ControllerFoto() {
    }
    
    public void abrirFicheros(){
        JFileChooser elegirImagen = new JFileChooser();
        elegirImagen.setMultiSelectionEnabled(false);
        int o = elegirImagen.showOpenDialog(elegirImagen);
        if(o == JFileChooser.APPROVE_OPTION){
            ruta = elegirImagen.getSelectedFile().getAbsolutePath();
            nombre = elegirImagen.getSelectedFile().getName();
            Image preview = Toolkit.getDefaultToolkit().getImage(ruta);
            
        }
    }
    
         
}
