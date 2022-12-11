/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.emp.mx.view;

import com.emp.mx.bo.DireccionBO;
import com.emp.mx.entity.Direccion;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import java.sql.SQLException;



/**
 *
 * @author Moise
 */
public class FrmDire extends javax.swing.JFrame {

    /**
     * Creates new form FrmDire
     */
    private DireccionBO ebo = new DireccionBO();
    public FrmDire() {
        initComponents();
        ListarDire();
        setTitle("Formulario Direcciones");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public void ListarDire(){
        ebo.ListarDire(tbDireccion);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jID = new javax.swing.JLabel();
        txtID_DIRECCION = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jEXT = new javax.swing.JLabel();
        txtEXT = new javax.swing.JTextField();
        jINT = new javax.swing.JLabel();
        txtINT = new javax.swing.JTextField();
        jColonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jMuni = new javax.swing.JLabel();
        txtMunici = new javax.swing.JTextField();
        jCP = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jESTADO = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDireccion = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnelimi = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnInsert1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(428, 712));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jID.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jID.setForeground(new java.awt.Color(0, 0, 0));
        jID.setText("ID:");
        jPanel3.add(jID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtID_DIRECCION.setBackground(new java.awt.Color(255, 255, 255));
        txtID_DIRECCION.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtID_DIRECCION.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtID_DIRECCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Formulario Dirección");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jCalle.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jCalle.setForeground(new java.awt.Color(0, 0, 0));
        jCalle.setText("Calle:");
        jPanel3.add(jCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 112, -1, 20));

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(0, 0, 0));
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        jPanel3.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 170, -1));

        jEXT.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jEXT.setForeground(new java.awt.Color(0, 0, 0));
        jEXT.setText("No. Ext.");
        jPanel3.add(jEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtEXT.setBackground(new java.awt.Color(255, 255, 255));
        txtEXT.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtEXT.setForeground(new java.awt.Color(0, 0, 0));
        txtEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEXTActionPerformed(evt);
            }
        });
        jPanel3.add(txtEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, -1));

        jINT.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jINT.setForeground(new java.awt.Color(0, 0, 0));
        jINT.setText("No. Int.");
        jPanel3.add(jINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtINT.setBackground(new java.awt.Color(255, 255, 255));
        txtINT.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtINT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, -1));

        jColonia.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jColonia.setForeground(new java.awt.Color(0, 0, 0));
        jColonia.setText("Colonia:");
        jPanel3.add(jColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtColonia.setBackground(new java.awt.Color(255, 255, 255));
        txtColonia.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(0, 0, 0));
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });
        jPanel3.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, -1));

        jMuni.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMuni.setForeground(new java.awt.Color(0, 0, 0));
        jMuni.setText("Municipio:");
        jPanel3.add(jMuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtMunici.setBackground(new java.awt.Color(255, 255, 255));
        txtMunici.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtMunici.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtMunici, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 170, -1));

        jCP.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jCP.setForeground(new java.awt.Color(0, 0, 0));
        jCP.setText("CP:");
        jPanel3.add(jCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        txtCP.setBackground(new java.awt.Color(255, 255, 255));
        txtCP.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtCP.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 170, -1));

        jESTADO.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jESTADO.setForeground(new java.awt.Color(0, 0, 0));
        jESTADO.setText("Estado:");
        jPanel3.add(jESTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 170, -1));

        tbDireccion.setBackground(new java.awt.Color(255, 255, 255));
        tbDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDireccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDireccion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 590, 270));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        btnelimi.setBackground(new java.awt.Color(255, 255, 255));
        btnelimi.setForeground(new java.awt.Color(0, 0, 0));
        btnelimi.setText("ELIMINAR");
        btnelimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimiActionPerformed(evt);
            }
        });
        jPanel3.add(btnelimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        btnModif.setBackground(new java.awt.Color(255, 255, 255));
        btnModif.setForeground(new java.awt.Color(0, 0, 0));
        btnModif.setText("MODIFICAR");
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });
        jPanel3.add(btnModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        btnClean.setBackground(new java.awt.Color(255, 255, 255));
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setText("LIMPIAR");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        jPanel3.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        btnInsert1.setBackground(new java.awt.Color(255, 255, 255));
        btnInsert1.setForeground(new java.awt.Color(0, 0, 0));
        btnInsert1.setText("INSERTAR");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnInsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEXTActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void tbDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDireccionMouseClicked
        // TODO add your handling code here:
        int seleccion = tbDireccion.rowAtPoint(evt.getPoint());
        txtID_DIRECCION.setText((String) tbDireccion.getValueAt(seleccion, 0));
        txtCalle.setText((String) tbDireccion.getValueAt(seleccion, 1));
        txtEXT.setText((String) tbDireccion.getValueAt(seleccion, 2));
        txtINT.setText((String) tbDireccion.getValueAt(seleccion, 3));
        txtColonia.setText((String) tbDireccion.getValueAt(seleccion, 4));
        txtMunici.setText((String) tbDireccion.getValueAt(seleccion, 5));
        txtCP.setText((String) tbDireccion.getValueAt(seleccion, 6));
        txtEstado.setText((String) tbDireccion.getValueAt(seleccion, 7));
        

    }//GEN-LAST:event_tbDireccionMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnelimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimiActionPerformed
        // TODO add your handling code here:
        if(txtID_DIRECCION.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene El ID a borrar");
        }else{
            String mensaje;
            try {
                mensaje = ebo.eliminarDire(Integer.parseInt(txtID_DIRECCION.getText()));
                JOptionPane.showMessageDialog(null,mensaje);
                limpiar();
                ListarDire();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnelimiActionPerformed

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        // TODO add your handling code here:
        if(txtID_DIRECCION.getText().isEmpty() || txtCalle.getText().isEmpty() || txtEXT.getText().isEmpty() || txtINT.getText().isEmpty()
            || txtColonia.getText().isEmpty() || txtMunici.getText().isEmpty()|| txtEstado.getText().isEmpty()
            || txtCP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            Direccion dire = new Direccion();
            dire.setDOMICILIO_ID(Integer.parseInt(txtID_DIRECCION.getText()));
            dire.setCALLE(txtCalle.getText());
            dire.setNUM_EXT(Integer.parseInt(txtEXT.getText()));
            dire.setNUM_INT(Integer.parseInt(txtINT.getText()));
            dire.setCOLONIA(txtColonia.getText());
            dire.setMUNICIPIO(txtMunici.getText());
            dire.setCP_DOMICILIO(Integer.parseInt(txtCP.getText()));
            dire.setDOM_ESTADO_ID(Integer.parseInt(txtEstado.getText()));
            String mensaje;
            try {
                mensaje = ebo.modifiDire(dire);
                JOptionPane.showMessageDialog(null,mensaje);
                limpiar();
                ListarDire();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnModifActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnCleanActionPerformed
    public void limpiar(){
        txtID_DIRECCION.setText("");
        txtCalle.setText("");
        txtEXT.setText("");
        txtINT.setText("");
        txtColonia.setText("");
        txtMunici.setText("");
        txtCP.setText("");
        txtEstado.setText("");
    }
    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        if(txtID_DIRECCION.getText().isEmpty() || txtCalle.getText().isEmpty() || txtEXT.getText().isEmpty() || txtINT.getText().isEmpty()
            || txtColonia.getText().isEmpty() || txtMunici.getText().isEmpty()|| txtEstado.getText().isEmpty()
            || txtCP.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            Direccion dire = new Direccion();
            dire.setDOMICILIO_ID(Integer.parseInt(txtID_DIRECCION.getText()));
            dire.setCALLE(txtCalle.getText());
            dire.setNUM_EXT(Integer.parseInt(txtEXT.getText()));
            dire.setNUM_INT(Integer.parseInt(txtINT.getText()));
            dire.setCOLONIA(txtColonia.getText());
            dire.setMUNICIPIO(txtMunici.getText());
            dire.setCP_DOMICILIO(Integer.parseInt(txtCP.getText()));
            dire.setDOM_ESTADO_ID(Integer.parseInt(txtEstado.getText()));
            String mensaje;
            try {
                mensaje = ebo.agregarDire(dire);
                JOptionPane.showMessageDialog(null,mensaje);
                limpiar();
                ListarDire();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(FrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnInsert1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton btnelimi;
    private javax.swing.JLabel jCP;
    private javax.swing.JLabel jCalle;
    private javax.swing.JLabel jColonia;
    private javax.swing.JLabel jESTADO;
    private javax.swing.JLabel jEXT;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jINT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMuni;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDireccion;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtEXT;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtID_DIRECCION;
    private javax.swing.JTextField txtINT;
    private javax.swing.JTextField txtMunici;
    // End of variables declaration//GEN-END:variables
}
