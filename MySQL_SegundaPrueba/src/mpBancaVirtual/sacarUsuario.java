package mpBancaVirtual;

import javax.swing.JOptionPane;
import mdBancaVirtual.*;
import mnBancaVirtual.*;

public class sacarUsuario extends javax.swing.JFrame {

    conexiondatos con = new conexiondatos();
    cuentas cuenta = new cuentas();
    usuario mostrarusuario = new usuario();
    clientes cliente = new clientes();
    usuarios usu = new usuarios();
    movimientos movimiento = new movimientos();

    public sacarUsuario() {
        initComponents();
        saldoDisponible.setText("$" + con.devolverDesencriptacion(cuenta.devolverSaldoCuenta()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        saldoDisponible = new javax.swing.JLabel();
        btnretirar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Cantidad $");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 210, 70, 20);

        txtclave.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtclave);
        txtclave.setBounds(190, 170, 90, 22);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Clave");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 170, 37, 20);

        txtcantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtcantidad);
        txtcantidad.setBounds(190, 210, 90, 22);

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
        regresar.setBounds(0, 0, 44, 40);

        jPanel2.setBackground(new java.awt.Color(37, 37, 37));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Disponible");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 10, 80, 21);

        saldoDisponible.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        saldoDisponible.setForeground(new java.awt.Color(255, 255, 255));
        saldoDisponible.setText("DINERO DISPO");
        jPanel2.add(saldoDisponible);
        saldoDisponible.setBounds(20, 30, 340, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 420, 90);

        btnretirar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnretirar.setText("Retirar");
        btnretirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretirarActionPerformed(evt);
            }
        });
        jPanel1.add(btnretirar);
        btnretirar.setBounds(170, 250, 72, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed

        mostrarusuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void btnretirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretirarActionPerformed

        if (cliente.comprobarClaveUsuario(con.devolverDesencriptacion(cuenta.devolvernrodcto()), txtclave)) {

            if (usu.limitedetuSaldo(txtcantidad) == false) {

                int confirmado = JOptionPane.showConfirmDialog(btnretirar, "¿Desea retirar la cantidad de $" + txtcantidad.getText() + " de su cuenta? ", null, JOptionPane.OK_CANCEL_OPTION);

                if (JOptionPane.OK_OPTION == confirmado) {

                    usu.accionRetirar(txtcantidad);

                    movimiento.mandarDatosMovimientosUsuarios(null, txtcantidad, "Retirar");

                    JOptionPane.showMessageDialog(null, "Transacción exitosa");

                    mostrarusuario.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Transacción cancelada");
                    txtcantidad.setText("");
                    txtclave.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡Ups! intentas enviar mas dinero que el que tienes :(");
                txtcantidad.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "¡Ups! la clave que ingreso es incorrecta");
            txtclave.setText("");
        }

    }//GEN-LAST:event_btnretirarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sacarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnretirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel saldoDisponible;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtclave;
    // End of variables declaration//GEN-END:variables
}
