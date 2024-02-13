/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.Vista;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.swing.JPanel;
import org.Controlador.EmailUtil;
import org.Controlador.HibernateUtil;

/**
 *
 * @author Mario González Gómez
 */
public class RecuperarPass extends javax.swing.JPanel {

    /**
     * Creates new form Iniciar
     */
    public RecuperarPass() {
        initComponents();
        FlatLightLaf.setup();
        continuar.putClientProperty( "FlatLaf.style", "arc: 15");
        email.putClientProperty("FlatLaf.style", "arc: 15");
        email.putClientProperty( "JTextField.placeholderText", "Intruduce tu Email");
        codigoT.putClientProperty( "JTextField.placeholderText", "Intruduce el codigo");
        aviso.setVisible(false);
        codigoT.setEnabled(false);
        continuar.setEnabled(false);
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
        codigoT = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        cod = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(566, 361));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        lbl1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbl1.setText("Recuperar contraseña");

        email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(153, 153, 153));
        lblEmail.setText("Email");

        continuar.setBackground(new java.awt.Color(154, 154, 154));
        continuar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

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

        codigoT.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        codigoT.setToolTipText("Introduce tu correo electrónico");
        codigoT.setPreferredSize(new java.awt.Dimension(536, 60));
        codigoT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoTMouseClicked(evt);
            }
        });
        codigoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTActionPerformed(evt);
            }
        });

        lblCode.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblCode.setForeground(new java.awt.Color(153, 153, 153));
        lblCode.setText("Codigo");

        btnCrear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(153, 153, 153));
        btnCrear.setText("Enviar código");
        btnCrear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        btnCrear.setMaximumSize(new java.awt.Dimension(116, 30));
        btnCrear.setMinimumSize(new java.awt.Dimension(116, 30));
        btnCrear.setPreferredSize(new java.awt.Dimension(116, 30));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        aviso.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 0, 0));
        aviso.setText("NO SE HA ENCONTRADO NINGUN USUARIO CON EL EMAIL INTRODUCIDO ");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(cod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addGap(321, 321, 321)
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoT, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aviso)
                .addGap(70, 70, 70))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblEmail)
                .addGap(4, 4, 4)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblCode)
                .addGap(4, 4, 4)
                .addComponent(codigoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod))
                .addGap(18, 18, 18)
                .addComponent(aviso)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        if(cod.getText().equals(codigoT.getText())){
            RecuperarPass2 rp = new RecuperarPass2();

            rp.lblEm.setText(email.getText());

            mostrarPanel(rp);
        }else{
            aviso.setText("EL CODIGO INTRODUCIDO NO ES CORRECTO.");
            aviso.setVisible(true);
        }
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

    private void codigoTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTMouseClicked

    private void codigoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Random random = new Random();
        
        int codigo = random.nextInt(999999 - 99999) + 99999;
        HibernateUtil hu = new HibernateUtil();
        String emailText =email.getText();
        if(hu.obtenerUsuario(emailText)!= null){
            cod.setText(""+codigo);
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
            EmailUtil.sendEmail(session, toEmail, "Cambio de contraseña", "Su código para recuperar la contraseña es: "+codigo);
            
            codigoT.setEnabled(true);
            continuar.setEnabled(true);
        }else{
            aviso.setVisible(true);
        }
    }//GEN-LAST:event_btnCrearActionPerformed
    
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
    private javax.swing.JLabel aviso;
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cod;
    private javax.swing.JTextField codigoT;
    private javax.swing.JButton continuar;
    private javax.swing.JTextField email;
    private javax.swing.JPanel fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblX;
    // End of variables declaration//GEN-END:variables
}
