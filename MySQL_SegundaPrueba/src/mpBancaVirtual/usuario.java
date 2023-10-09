package mpBancaVirtual;

import javax.swing.*;

public class usuario extends javax.swing.JFrame {

    movimientosUsuario movi = new movimientosUsuario();
    
    inicioUsuario iniciar = new inicioUsuario();

    public usuario() {
        initComponents();
        mostrarpanel(iniciar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        verEnviar = new javax.swing.JMenuItem();
        verSacar = new javax.swing.JMenuItem();
        refrescarInicio = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(null);

        jMenu1.setText("$");

        verEnviar.setText("Enviar");
        verEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEnviarActionPerformed(evt);
            }
        });
        jMenu1.add(verEnviar);

        verSacar.setText("Sacar");
        verSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSacarActionPerformed(evt);
            }
        });
        jMenu1.add(verSacar);

        jMenuBar1.add(jMenu1);

        refrescarInicio.setText("Inicio");
        jMenuBar1.add(refrescarInicio);

        jMenu2.setText("Perfil");

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jMenu2.add(cerrarSesion);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        inicioSesion inicio = new inicioSesion();
        
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void verEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEnviarActionPerformed
        
        enviarUsuarios enviar = new enviarUsuarios();
        
        enviar.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_verEnviarActionPerformed

    private void verSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSacarActionPerformed

        sacarUsuario sacar = new sacarUsuario();
        
        sacar.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_verSacarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    private void mostrarpanel(JPanel p) {
        p.setSize(524, 359);
        p.setLocation(0, 0);

        panel.removeAll();
        panel.add(p);
        panel.revalidate();
        panel.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panel;
    private javax.swing.JMenu refrescarInicio;
    private javax.swing.JMenuItem verEnviar;
    private javax.swing.JMenuItem verSacar;
    // End of variables declaration//GEN-END:variables
}
