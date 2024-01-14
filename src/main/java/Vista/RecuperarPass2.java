/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.EmailUtil;
import Controlador.HibernateUtil;
import java.awt.Color;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JPanel;
import model.Email;

/**
 *
 * @author Alumno
 */
public class RecuperarPass2 extends javax.swing.JPanel {

    /**
     * Creates new form Iniciar
     */
    public RecuperarPass2() {
        initComponents();
        continuar.putClientProperty( "FlatLaf.style", "arc: 5");
        lblEm.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPass = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();
        cerrar = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        lblEm = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl1.setText("Recuperar contraseña");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 538, 10));

        lblPass.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblPass.setForeground(new java.awt.Color(153, 153, 153));
        lblPass.setText("Nueva contraseña");
        jPanel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        continuar.setBackground(new java.awt.Color(154, 154, 154));
        continuar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        jPanel1.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 144, 53));

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

        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 26, 30));

        pass.setText("jPasswordField1");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 530, 60));

        lblEm.setText("jLabel1");
        jPanel1.add(lblEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
            
            String emailText =lblEm.getText();
            
            
            final String fromEmail="mariogongom4@gmail.com";
            final String password="wactidfkxukqdseq";
            final String toEmail=emailText;

            System.out.println("SSLMail Start");
            Properties props=new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.user", fromEmail);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.ssl.protocols","TLSv1.2");
            
            Authenticator auth = new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            
            Session session = Session.getDefaultInstance(props, auth);
            System.out.println("Session created");
            EmailUtil.sendEmail(session, toEmail, "Cambio de contraseña", "Su contraseña ha sido cambiada. Si no la has cambiado tú, revisa tu cuenta.");
            
            Iniciar ini = new Iniciar();
            
            HibernateUtil hu = new HibernateUtil();
            
            hu.actualizarUsuario(toEmail, password);
                        
            mostrarPanel(ini);
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
        p.setSize(500,400);
        p.setLocation(0,0);   
        Iniciar ini = new Iniciar();
        //quitamos la ventana anterior y mostramos la nueva
        jPanel1.removeAll();
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cerrar;
    private javax.swing.JButton continuar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lblEm;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblX;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
