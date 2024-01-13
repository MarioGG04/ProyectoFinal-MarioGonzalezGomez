/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class Iniciar extends javax.swing.JPanel {

    /**
     * Creates new form Iniciar
     */
    public Iniciar() {
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
        lblPass = new javax.swing.JLabel();
        cerrar = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(570, 584));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl1.setText("Iniciar sesión");
        fondo.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 538, 10));

        email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        email.setText("Intruduce Email");
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
        fondo.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 530, -1));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(153, 153, 153));
        lblEmail.setText("Email");
        fondo.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 37, -1));

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

        lblPass.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(153, 153, 153));
        lblPass.setText("Contraseña");
        fondo.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

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

        jPasswordField1.setText("jPasswordField1");
        fondo.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 202, 530, 60));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("He olvidado mi contraseña");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 170, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(135, 172, 209));
        jLabel1.setText("Crear cuenta");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 80, -1));

        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 361));

        getAccessibleContext().setAccessibleName("panel");
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        // TODO add your handling code here:
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

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        email.setText("");
    }//GEN-LAST:event_emailMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        RecuperarPass rp = new RecuperarPass();
        mostrarPanel(rp);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Registro reg = new Registro();
        login l = new login();
        reg.setSize(570, 584);
        mostrarPanel(reg);
    }//GEN-LAST:event_jLabel1MouseClicked

    public void mostrarPanel(JPanel p){
        //definimos tamaño y posición del panel
        p.setSize(500,400);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
