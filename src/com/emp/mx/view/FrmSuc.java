/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.emp.mx.view;

import com.emp.mx.bo.SucursalBO;
import com.emp.mx.entity.Sucursal;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Moise
 */
public class FrmSuc extends javax.swing.JFrame {

    /**
     * Creates new form FrmSuc
     */
    private SucursalBO ebo = new SucursalBO();
    public FrmSuc() {
        initComponents();
        listarSuc();
        setTitle("Formulario Sucursal");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public void listarSuc(){
        ebo.ListarSucu(tbSucursal);
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSucursal = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtLada = new javax.swing.JTextField();
        txtExt = new javax.swing.JTextField();
        txtDomi = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtCorre = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FORMULARIO SUCURSAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 146, -1));

        tbSucursal.setBackground(new java.awt.Color(255, 255, 255));
        tbSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSucursalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSucursal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 590, 270));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 20));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, 20));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("LADA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 20));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EXT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 40, 20));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("HORARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, 20));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DOMICILIO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, 20));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CORREO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 50, 20));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TEL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, 20));

        Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        Insert.setBackground(new java.awt.Color(255, 255, 255));
        Insert.setForeground(new java.awt.Color(0, 0, 0));
        Insert.setText("INSERTAR");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        jPanel1.add(Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        Modificar.setBackground(new java.awt.Color(255, 255, 255));
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, -1));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 130, -1));

        txtLada.setBackground(new java.awt.Color(255, 255, 255));
        txtLada.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, -1));

        txtExt.setBackground(new java.awt.Color(255, 255, 255));
        txtExt.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 130, -1));

        txtDomi.setBackground(new java.awt.Color(255, 255, 255));
        txtDomi.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtDomi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 130, -1));

        txtHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtHorario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, -1));

        txtCorre.setBackground(new java.awt.Color(255, 255, 255));
        txtCorre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSucursalMouseClicked
        // TODO add your handling code here:
        int seleccion = tbSucursal.rowAtPoint(evt.getPoint());
        txtID.setText((String) tbSucursal.getValueAt(seleccion, 0));
        txtName.setText((String) tbSucursal.getValueAt(seleccion, 1));
        txtExt.setText((String) tbSucursal.getValueAt(seleccion, 2));
        txtLada.setText((String) tbSucursal.getValueAt(seleccion, 3));
        txtTel.setText((String) tbSucursal.getValueAt(seleccion, 4));
        txtCorre.setText((String) tbSucursal.getValueAt(seleccion, 5));
        txtHorario.setText((String) tbSucursal.getValueAt(seleccion, 6));
        txtDomi.setText((String) tbSucursal.getValueAt(seleccion, 7));

    }//GEN-LAST:event_tbSucursalMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed
    public void limpiar(){
        txtID.setText("");
        txtName.setText("");
        txtExt.setText("");
        txtLada.setText("");
        txtTel.setText("");
        txtCorre.setText("");
        txtHorario.setText("");
        txtDomi.setText("");
    }
    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        if(txtLada.getText().isEmpty() || txtExt.getText().isEmpty() || txtCorre.getText().isEmpty() || txtName.getText().isEmpty() || 
            txtDomi.getText().isEmpty() || txtHorario.getText().isEmpty() || txtID.getText().isEmpty() ||  txtTel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        else{
            Sucursal suc = new Sucursal();
            suc.setSUCURSAL_ID(Integer.parseInt(txtID.getText()));
            suc.setNAME_SUCURSAL(txtName.getText());
            suc.setNUM_EXT(Integer.parseInt(txtExt.getText()));
            suc.setTEL_SUCURSAL(Integer.parseInt(txtTel.getText()));
            suc.setLADA_SUCURSAL(Integer.parseInt(txtLada.getText()));
            suc.setCORREO_SUCURSAL(txtCorre.getText());
            suc.setSUCURSAL_HORARIO(Integer.parseInt(txtHorario.getText()));
            suc.setSUCURSAL_DOMICILIO(Integer.parseInt(txtDomi.getText()));
            String mensaje;
            try {
                mensaje = ebo.agregarSuc(suc);
                JOptionPane.showMessageDialog(null,mensaje);
                limpiar();
                listarSuc();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_InsertActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        else{
            Sucursal suc = new Sucursal();
            suc.setSUCURSAL_ID(Integer.parseInt(txtID.getText()));
            suc.setNAME_SUCURSAL(txtName.getText());
            suc.setNUM_EXT(Integer.parseInt(txtExt.getText()));
            suc.setTEL_SUCURSAL(Integer.parseInt(txtTel.getText()));
            suc.setLADA_SUCURSAL(Integer.parseInt(txtLada.getText()));
            suc.setCORREO_SUCURSAL(txtCorre.getText());
            suc.setSUCURSAL_HORARIO(Integer.parseInt(txtHorario.getText()));
            suc.setSUCURSAL_DOMICILIO(Integer.parseInt(txtDomi.getText()));
            String mensaje;
            try {
                mensaje = ebo.modifiSuc(suc);
                JOptionPane.showMessageDialog(null,mensaje);
                limpiar();
                listarSuc();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene El ID a borrar");
            System.out.println(txtID.getText());
        }else{
            String mensaje;
            try {
                mensaje = ebo.eliminarSuc(Integer.parseInt(txtID.getText()));
                JOptionPane.showMessageDialog(null,mensaje);
                limpiar();
                listarSuc();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }     
        }

    }//GEN-LAST:event_EliminarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSuc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSuc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSucursal;
    private javax.swing.JTextField txtCorre;
    private javax.swing.JTextField txtDomi;
    private javax.swing.JTextField txtExt;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLada;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
