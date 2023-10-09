package mpBancaVirtual;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mdBancaVirtual.*;
import mnBancaVirtual.*;

public class modificarcuenta extends javax.swing.JPanel {

    conexiondatos con = new conexiondatos();
    administrador admin = new administrador();
    restriccionesRegistro restriccion = new restriccionesRegistro();
    cuentas cuenta = new cuentas();
    validaciondatos validacion = new validaciondatos();
    movimientos movimiento = new movimientos();

    public modificarcuenta() throws SQLException {
        initComponents();
        cuenta.mostrarTabla(jTable1);

        btnmodificar.setEnabled(false);
        tipoCuenta.setEnabled(false);
        txtsaldo.setEnabled(false);
        accionesSaldo.setEnabled(false);
        txtnrodcto.setEnabled(false);

        tipoCuenta.removeAllItems();
        tipoCuenta.addItem("---- Seleccionar ----");
        tipoCuenta.addItem("Corriente");
        tipoCuenta.addItem("Ahorro");

        accionesSaldo.removeAllItems();
        accionesSaldo.addItem("---- Seleccionar ----");
        accionesSaldo.addItem("Añadir");
        accionesSaldo.addItem("Restar");
        accionesSaldo.addItem("Reemplazar");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnrodcto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        tipoCuenta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        accionesSaldo = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Modificacion de datos"));

        jLabel1.setText("Nro. Documento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );

        jLabel4.setText("Tipo Cuenta");

        btnmodificar.setText("Modificar");
        btnmodificar.setEnabled(false);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        tipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Saldo");

        accionesSaldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtnrodcto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accionesSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnrodcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accionesSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnmodificar))
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

        if (restriccion.limitenrodcto(txtnrodcto) && validacion.comprobarEnteros(txtsaldo) && cuenta.devolverSaldoCuentaAdmin(txtnrodcto) && validacion.verificarValor(txtsaldo.getText(),1)) {

            admin.accionSaldo(accionesSaldo, txtsaldo, txtnrodcto);

            try {
                cuenta.mostrarTabla(jTable1);
            } catch (SQLException ex) {
                Logger.getLogger(modificarcuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            movimiento.mandarDatosMovimientosAdmin(txtnrodcto, txtsaldo, accionesSaldo);

            txtnrodcto.setEnabled(true);
            txtnrodcto.setText("");
            
            txtsaldo.setEnabled(false);
            txtsaldo.setText("");
            
            btnmodificar.setEnabled(false);
            accionesSaldo.setEnabled(false);
            tipoCuenta.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "Los datos ingresados no son correctos");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        admin.seleccionardatosCuenta(jTable1, txtnrodcto);
        btnmodificar.setEnabled(true);

        if (cuenta.regresarporID(txtnrodcto, tipoCuenta, txtsaldo)) {

            tipoCuenta.setEnabled(true);
            txtsaldo.setEnabled(true);

            JOptionPane.showMessageDialog(null, "registro encontrado");

            tipoCuenta.removeItem("---- Seleccionar ----");
            accionesSaldo.removeItem("---- Seleccionar ----");
            
            accionesSaldo.setEnabled(true);
            btnmodificar.setEnabled(true);
            txtnrodcto.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "registro NO encontrado");
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        txtnrodcto.setEnabled(true);
        
        if (cuenta.regresarporID(txtnrodcto, tipoCuenta, txtsaldo)) {

            tipoCuenta.setEnabled(true);
            txtsaldo.setEnabled(true);

            JOptionPane.showMessageDialog(null, "registro encontrado");

            tipoCuenta.removeItem("---- Seleccionar ----");

            btnmodificar.setEnabled(true);
            txtnrodcto.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "registro NO encontrado");
        }

    }//GEN-LAST:event_btnbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accionesSaldo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> tipoCuenta;
    private javax.swing.JTextField txtnrodcto;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
