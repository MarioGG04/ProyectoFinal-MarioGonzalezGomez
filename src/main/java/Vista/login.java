/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.HibernateUtil;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Mario González Gómez
 */
public class login extends javax.swing.JFrame {

   //SplashScreen cargar = new SplashScreen();
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        
        //mostrarPanel(inicio);
        FlatLightLaf.setup();
        //cargar.mostrar();
        //continuar.putClientProperty( "FlatLaf.style", "arc: 5");   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMov = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl1 = new javax.swing.JLabel();
        cerrar = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        panelMov.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl1.setText("Iniciar sesión / Registrarse");

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

        javax.swing.GroupLayout panelMovLayout = new javax.swing.GroupLayout(panelMov);
        panelMov.setLayout(panelMovLayout);
        panelMovLayout.setHorizontalGroup(
            panelMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl1)
                .addGap(293, 293, 293)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelMovLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelMovLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2))
        );
        panelMovLayout.setVerticalGroup(
            panelMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(panelMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Iniciar iniciar = new Iniciar();
       mostrarPanel(iniciar);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registro reg = new Registro();
        setSize(600, 800);
        mostrarPanel(reg);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        lblX.setForeground(Color.red);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        lblX.setForeground(Color.black);
    }//GEN-LAST:event_cerrarMouseExited
    
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    public void mostrarPanel(JPanel p){
        //definimos tamaño y posición del panel
        p.setSize(500,400);
        p.setLocation(0,0);   

        //quitamos la ventana anterior y mostramos la nueva
        panelMov.removeAll();
        panelMov.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelMov.revalidate();
        panelMov.repaint();
    }
    public void mostrarPanel2(JPanel p){
        //definimos tamaño y posición del panel
        p.setSize(570, 584);
        p.setLocation(0,0);   

        //quitamos la ventana anterior y mostramos la nueva
        panelMov.removeAll();
        panelMov.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        panelMov.revalidate();
        panelMov.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cerrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblX;
    private javax.swing.JPanel panelMov;
    // End of variables declaration//GEN-END:variables
}
