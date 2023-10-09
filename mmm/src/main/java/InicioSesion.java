import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InicioSesion extends JFrame implements ActionListener {
    
        
    
    
    JLabel correoLabel, contrasenaLabel;
    JTextField correoField;
    JPasswordField contrasenaField;
    JButton iniciarSesionButton;

    public InicioSesion() {
        super("Inicio de sesión");

        correoLabel = new JLabel("Correo electrónico:");
        correoField = new JTextField(20);
        contrasenaLabel = new JLabel("Contraseña:");
        contrasenaField = new JPasswordField(20);
        iniciarSesionButton = new
        