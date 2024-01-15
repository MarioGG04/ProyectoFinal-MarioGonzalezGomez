/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.Vista;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class RecuperarPass extends javax.swing.JPanel {

    /**
     * Creates new form Iniciar
     */
    public RecuperarPass() {
        initComponents();
        continuar.putClientProperty( "FlatLaf.style", "arc: 5");  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        email = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();
        cerrar = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(566, 361));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl1.setText("Recuperar contraseña");
        fondo.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 538, 10));

        email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        email.setText("Intruduce tu Email para solicitar la nueva contraseña");
        email.setToolTipText("Introduce tu correo electrónico");
        email.setPreferredSize(new java.awt.Dimension(536, 60));
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        fondo.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 530, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(153, 153, 153));
        lblEmail.setText("Email");
        fondo.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 37, -1));

        continuar.setBackground(new java.awt.Color(154, 154, 154));
        continuar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        fondo.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 144, 53));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        cerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblX.setText("X");
        cerrar.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        fondo.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 26, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        RecuperarPass2 rp = new RecuperarPass2();
        
        rp.lblEm.setText(email.getText());
        
        mostrarPanel(rp);
        
    }//GEN-LAST:event_continuarActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        lblX.setForeground(Color.red);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        lblX.setForeground(Color.black);
    }//GEN-LAST:event_cerrarMouseExited
    
    public void mostrarPanel(JPanel p){
        //definimos tamaño y posición del panel
        p.setSize(570, 361);
        p.setLocation(0,0);
        
      
        //quitamos la ventana anterior y mostramos la nueva
        fondo.removeAll();
        fondo.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        fondo.revalidate();
        fondo.setSize(570, 584);
        fondo.repaint();
    }
    

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cerrar;
    private javax.swing.JButton continuar;
    private javax.swing.JTextField email;
    private javax.swing.JPanel fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}