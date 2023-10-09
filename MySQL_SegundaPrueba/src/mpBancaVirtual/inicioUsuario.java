/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mpBancaVirtual;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mdBancaVirtual.*;

public class inicioUsuario extends javax.swing.JPanel {

    cuentas cuenta = new cuentas();
    conexiondatos con = new conexiondatos();
    movimientos movimiento = new movimientos();
    clientes cliente = new clientes();

    public inicioUsuario() {
        initComponents();
        nombrepersona.setText(con.devolverDesencriptacion(cliente.devolverNombre(cuenta.devolvernrodcto())) + "!");
        saldoDisponible.setText("$" + con.devolverDesencriptacion(cuenta.devolverSaldoCuenta()));

        try {
            movimiento.mostrarTablaUsuario(tablaUsuario);
            tablaUsuario.setBackground(Color.WHITE);
        } catch (SQLException ex) {
            Logger.getLogger(inicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombrepersona = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnrefrescarTabla = new javax.swing.JButton();
        saldoDisponible = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuario = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(540, 359));
        setRequestFocusEnabled(false);
        setLayout(null);

        nombrepersona.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombrepersona.setText("(NOMBRE PERSONA)");
        add(nombrepersona);
        nombrepersona.setBounds(60, 330, 400, 17);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setText("Hola, ");
        add(jLabel1);
        jLabel1.setBounds(20, 330, 50, 17);

        btnrefrescarTabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnrefrescarTabla.setForeground(new java.awt.Color(255, 255, 255));
        btnrefrescarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        btnrefrescarTabla.setBorder(null);
        btnrefrescarTabla.setBorderPainted(false);
        btnrefrescarTabla.setOpaque(true);
        btnrefrescarTabla.setPreferredSize(new java.awt.Dimension(30, 30));
        btnrefrescarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefrescarTablaActionPerformed(evt);
            }
        });
        add(btnrefrescarTabla);
        btnrefrescarTabla.setBounds(450, 60, 44, 44);

        saldoDisponible.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        saldoDisponible.setText("DINERO DISPO");
        add(saldoDisponible);
        saldoDisponible.setBounds(20, 60, 340, 50);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Balance");
        add(jLabel2);
        jLabel2.setBounds(20, 40, 70, 21);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("de cuenta");
        add(jLabel3);
        jLabel3.setBounds(80, 40, 90, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("______________________________________________________");
        add(jLabel4);
        jLabel4.setBounds(20, 340, 330, 16);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText(" transacciones");
        add(jLabel5);
        jLabel5.setBounds(70, 130, 100, 21);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Últimas");
        add(jLabel6);
        jLabel6.setBounds(20, 130, 90, 21);

        tablaUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUsuario.setEnabled(false);
        jScrollPane2.setViewportView(tablaUsuario);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 160, 470, 160);
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefrescarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefrescarTablaActionPerformed
        try {
            movimiento.mostrarTablaUsuario(tablaUsuario);
            tablaUsuario.setBackground(Color.WHITE);
        } catch (SQLException ex) {
            Logger.getLogger(inicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saldoDisponible.setText("$" + con.devolverDesencriptacion(cuenta.devolverSaldoCuenta()));
    }//GEN-LAST:event_btnrefrescarTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrefrescarTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombrepersona;
    private javax.swing.JLabel saldoDisponible;
    private javax.swing.JTable tablaUsuario;
    // End of variables declaration//GEN-END:variables
}
