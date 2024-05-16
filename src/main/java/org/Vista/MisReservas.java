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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import org.Controlador.HibernateUtil;
import org.Controlador.ReservasController;
import org.Controlador.UsuariosController;
import org.model.Reservas;
import org.model.Usuario;

/**
 *
 * @author Mario González Gómez
 */
public class MisReservas extends javax.swing.JPanel {

    /**
     * Creates new form Apartamentos
     */
    Usuario u;
    DefaultListModel modelo = new DefaultListModel();
    public MisReservas() {
        initComponents();
        File f = new File("Logs.txt");
        BufferedReader br;
        ReservasController rc = new ReservasController();
        
        try {
            br = new BufferedReader(new FileReader(f));
            actualizar.putClientProperty("FlatLaf.style", "arc: 15");
      
            aux2.setVisible(false);
            String email2 = br.readLine();
            
            HibernateUtil uc = new HibernateUtil();
            u = uc.obtenerUsuario(email2);
            List<Reservas> res = rc.mostrarReservas(u);
            br.close();
            
            
            
            for (Reservas reserva : res){
                if(reserva.getUsuario().getId()==u.getId())
                modelo.addElement("Alojamiento: "+reserva.getHoteles().getNombre()+"    \tPrecio: "+reserva.getHabitaciones().getPrecio());
               
            }
            
            jList1.setModel(modelo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MisReservas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MisReservas.class.getName()).log(Level.SEVERE, null, ex);
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
        actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

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
        jLabel11.setText("Reservas");
        jPanel13.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));
        jPanel13.add(aux2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 140, 16));

        actualizar.setBackground(new java.awt.Color(225, 225, 225));
        actualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        actualizar.setText("Actualizar datos");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel13.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 220, 60));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel13.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 350, 240));

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

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

    }//GEN-LAST:event_actualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    public javax.swing.JLabel aux2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}