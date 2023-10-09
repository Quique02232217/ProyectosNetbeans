package mpBancaVirtual;

import javax.swing.JOptionPane;
import mdBancaVirtual.*;
import mnBancaVirtual.*;

public class enviarUsuarios extends javax.swing.JFrame {

    conexiondatos con = new conexiondatos();
    cuentas cuenta = new cuentas();
    usuarios usu = new usuarios();
    usuario mostrarusuario = new usuario();
    movimientos movimiento = new movimientos();

    public enviarUsuarios() {
        initComponents();
        saldoDisponible.setText("$" + con.devolverDesencriptacion(cuenta.devolverSaldoCuenta()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        txtmonto = new javax.swing.JTextField();
        txtnrodcto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        saldoDisponible = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtmonto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtmonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtmonto);
        txtmonto.setBounds(260, 250, 158, 22);

        txtnrodcto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtnrodcto);
        txtnrodcto.setBounds(260, 210, 158, 22);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Número de cuenta:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 210, 115, 16);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(180, 250, 59, 16);

        btnEnviar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar);
        btnEnviar.setBounds(260, 290, 72, 23);

        saldoDisponible.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        saldoDisponible.setForeground(new java.awt.Color(255, 255, 255));
        saldoDisponible.setText("DINERO DISPO");
        jPanel1.add(saldoDisponible);
        saldoDisponible.setBounds(20, 90, 340, 40);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Disponible");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 70, 80, 21);

        regresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        regresar.setForeground(new java.awt.Color(255, 255, 255));
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        regresar.setBorder(null);
        regresar.setBorderPainted(false);
        regresar.setOpaque(true);
        regresar.setPreferredSize(new java.awt.Dimension(30, 30));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar);
        regresar.setBounds(4, 4, 40, 40);

        jPanel2.setBackground(new java.awt.Color(37, 37, 37));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 50, 540, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtmontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmontoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        if (txtmonto.getText().replace(" ", "").length() != 0 && txtnrodcto.getText().replace(" ", "").length() != 0) {

            if (usu.limitedetuSaldo(txtmonto) || cuenta.devolverSaldoCuentaAdmin(txtnrodcto) == false || txtnrodcto.getText().equals(con.devolverDesencriptacion(cuenta.devolvernrodcto()))) {
                JOptionPane.showMessageDialog(null, "¡Ups! El numero de documento no existe o intentas enviar mas dinero que el que tienes :(");
            } else {

                int confirmado = JOptionPane.showConfirmDialog(btnEnviar, "¿Desea enviarle $" + txtmonto.getText() + " a " + cuenta.devolverNombre(txtnrodcto.getText()) + "?", null, JOptionPane.OK_CANCEL_OPTION);

                if (JOptionPane.OK_OPTION == confirmado) {

                    usu.accionSaldo(txtmonto, txtnrodcto);

                    movimiento.mandarDatosMovimientosUsuarios(txtnrodcto, txtmonto, "Consignar");

                    JOptionPane.showMessageDialog(null, "Transacción exitosa");

                    mostrarusuario.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Transacción cancelada");
                    txtmonto.setText("");
                    txtnrodcto.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Ups! Datos no validos");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        mostrarusuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(enviarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enviarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enviarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enviarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enviarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel saldoDisponible;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtnrodcto;
    // End of variables declaration//GEN-END:variables
}
