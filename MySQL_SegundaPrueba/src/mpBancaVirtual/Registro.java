package mpBancaVirtual;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mdBancaVirtual.*;
import mnBancaVirtual.restriccionesRegistro;

public class Registro extends javax.swing.JFrame {

    restriccionesRegistro restriccion = new restriccionesRegistro();
    cuentas cuenta = new cuentas();
    clientes cliente = new clientes();

    public Registro() {

        initComponents();
        //conexiondatos.establecerConexion();

        tipoDcto.removeAllItems();
        tipoDcto.addItem(" ");
        tipoDcto.addItem("TI");
        tipoDcto.addItem("CC");
        tipoDcto.addItem("CE");

        tipoCuenta.removeAllItems();
        tipoCuenta.addItem(" ");
        tipoCuenta.addItem("Corriente");
        tipoCuenta.addItem("Ahorros");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesdoc = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtclave = new javax.swing.JPasswordField();
        txtnombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtnrodcto = new javax.swing.JTextField();
        tipoCuenta = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        tipoDcto = new javax.swing.JComboBox<>();
        btnguardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mostrarContraseña = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Contraseña:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(100, 100, 80, 16);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(100, 160, 61, 16);

        txtclave.setBorder(null);
        jPanel2.add(txtclave);
        txtclave.setBounds(190, 100, 320, 16);

        txtnombre.setBorder(null);
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtnombre);
        txtnombre.setBounds(190, 60, 320, 16);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("____________________________________________________________________");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(100, 250, 410, 16);

        txtdireccion.setBorder(null);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });
        jPanel2.add(txtdireccion);
        txtdireccion.setBounds(190, 160, 320, 16);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Telefono:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(100, 200, 70, 16);

        txttelefono.setBorder(null);
        jPanel2.add(txttelefono);
        txttelefono.setBounds(190, 200, 320, 16);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Nro de ID:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(100, 240, 70, 16);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Tipo:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(420, 240, 30, 16);

        txtnrodcto.setBorder(null);
        jPanel2.add(txtnrodcto);
        txtnrodcto.setBounds(190, 240, 210, 16);

        tipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ahorros", "Corriente" }));
        tipoCuenta.setBorder(null);
        jPanel2.add(tipoCuenta);
        tipoCuenta.setBounds(210, 280, 90, 20);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Tipo de cuenta:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(100, 280, 92, 16);

        tipoDcto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "CE", "NIT" }));
        tipoDcto.setBorder(null);
        jPanel2.add(tipoDcto);
        tipoDcto.setBounds(452, 240, 60, 20);

        btnguardar.setBackground(new java.awt.Color(0, 0, 0));
        btnguardar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Crear cuenta");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar);
        btnguardar.setBounds(100, 330, 410, 23);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Registro");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(100, 10, 97, 32);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("Nombre:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(100, 60, 63, 16);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("____________________________________________________________________");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(100, 70, 410, 16);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setText("____________________________________________________________________");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(100, 110, 410, 16);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel19.setText("____________________________________________________________________");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(100, 170, 410, 16);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setText("____________________________________________________________________");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(100, 210, 410, 16);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Inicia sesión");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(330, 360, 80, 16);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("¿Ys tienes cuenta?");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(210, 360, 120, 16);

        mostrarContraseña.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        mostrarContraseña.setText("Mostrar contraseña");
        mostrarContraseña.setBorder(null);
        mostrarContraseña.setBorderPainted(false);
        mostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarContraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(mostrarContraseña);
        mostrarContraseña.setBounds(380, 130, 140, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (restriccion.limiteclave(txtclave) && restriccion.limitenrodcto(txtnrodcto) && restriccion.limitetelefono(txttelefono) && validacionComboBox(tipoCuenta, tipoDcto)) {

            if (cliente.mandarRegistro(txtnrodcto.getText(), txtnombre.getText(), txtclave.getText(), tipoDcto.getSelectedItem().toString(), txtdireccion.getText(), txttelefono.getText())) {

                cuenta.traerdatos(txtnrodcto.getText(), tipoCuenta.getSelectedItem().toString());

                txtnrodcto.setText("");
                txtnombre.setText("");
                txtclave.setText("");
                txtdireccion.setText("");
                txttelefono.setText("");

                usuario usu = new usuario();

                usu.setVisible(true);

                dispose();
            }else{
                txtnrodcto.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos");
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        inicioSesion inicio = new inicioSesion();

        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void mostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarContraseñaActionPerformed

        if (mostrarContraseña.isSelected()) {
            txtclave.setEchoChar((char) 0);
        } else {
            txtclave.setEchoChar('*');
        }
    }//GEN-LAST:event_mostrarContraseñaActionPerformed

    public boolean validacionComboBox(JComboBox a, JComboBox b) {

        return !((a.getSelectedIndex() == 0) || (b.getSelectedIndex() == 0));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesdoc;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton mostrarContraseña;
    private javax.swing.JComboBox<String> tipoCuenta;
    private javax.swing.JComboBox<String> tipoDcto;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnrodcto;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
