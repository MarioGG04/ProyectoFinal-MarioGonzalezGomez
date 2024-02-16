/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.Vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.Controlador.HibernateUtil;
import org.model.Usuario;

/**
 *
 * @author Mario González Gómez
 */
public class MiCuenta extends javax.swing.JPanel {

    /**
     * Creates new form Apartamentos
     */
    Usuario u;
    public MiCuenta() {
        initComponents();
        File f = new File("Logs.txt");
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(f));
            actualizar.putClientProperty("FlatLaf.style", "arc: 15");
            email.putClientProperty("FlatLaf.style", "arc: 15");
            nombre.putClientProperty("FlatLaf.style", "arc: 15");
            apellidos.putClientProperty("FlatLaf.style", "arc: 15");
            user.putClientProperty("FlatLaf.style", "arc: 15");

            aux2.setVisible(false);
            String email2 = br.readLine();
            email.setText(email2);
            HibernateUtil uc = new HibernateUtil();
            u = uc.obtenerUsuario(email2);

            if(u!=null){
                nombre.setText(u.getNombre());
                apellidos.setText(u.getApellido());
                user.setText(u.getUsername());
            }
 
            br.close();
            f.delete();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MiCuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MiCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aux2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1040, 930));
        setPreferredSize(new java.awt.Dimension(1040, 930));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setMinimumSize(new java.awt.Dimension(1040, 930));
        jPanel13.setPreferredSize(new java.awt.Dimension(1040, 930));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("@nestify");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(505, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(509, 509, 509))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(37, 37, 37))
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 1060, 80));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel11.setText("Mi cuenta");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));
        jPanel13.add(aux2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 140, 16));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        jPanel13.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel13.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel13.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Email:");
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        user.setEditable(false);
        jPanel13.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 260, 40));

        nombre.setEditable(false);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel13.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 260, 40));

        apellidos.setEditable(false);
        jPanel13.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 260, 40));

        email.setEditable(false);
        jPanel13.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 260, 40));

        actualizar.setBackground(new java.awt.Color(225, 225, 225));
        actualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        actualizar.setText("Actualizar datos");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel13.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 220, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 968, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 968, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        HibernateUtil hu = new HibernateUtil();
        if(nombre.isEditable()){
            actualizar.setText("Actualizar datos");
          
            
        }else{
            actualizar.setText("Guardar");
            nombre.setEditable(true);
            apellidos.setEditable(true);
            email.setEditable(true);
            user.setEditable(true);
        }
    }//GEN-LAST:event_actualizarActionPerformed
        public void mostrarPanel(JPanel p){
        //definimos tamaño y posición del panel
        p.setSize(1040, 930);
        p.setLocation(0,0);   

        //quitamos la ventana anterior y mostramos la nueva
        removeAll();
        add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        revalidate();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField apellidos;
    public javax.swing.JLabel aux2;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
