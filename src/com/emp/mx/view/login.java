
package com.emp.mx.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

   
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpass = new javax.swing.JLabel();
        lbuser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        connect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 40));

        jpass.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jpass.setForeground(new java.awt.Color(0, 0, 0));
        jpass.setText("CONTRASEÑA");
        jPanel1.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        lbuser.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbuser.setForeground(new java.awt.Color(0, 0, 0));
        lbuser.setText("USUARIO");
        jPanel1.add(lbuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 170, -1));

        txtpass.setBackground(new java.awt.Color(255, 255, 255));
        txtpass.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        txtpass.setForeground(new java.awt.Color(0, 0, 0));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 170, -1));

        connect.setBackground(new java.awt.Color(246, 90, 130));
        connect.setForeground(new java.awt.Color(255, 255, 255));
        connect.setText("Conectar");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });
        jPanel1.add(connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        // TODO add your handling code here:
            String user = "Moises";
            String pass = "pass";
            String user1=txtUser.getText();
            String pass1 = txtpass.getText();
            
            if((user.equals(user1)) && (pass.equals(pass1))){
               JOptionPane.showMessageDialog(null, "Success");
               viewsFrm mf = new viewsFrm();
               mf.setVisible(true);
               dispose();  
            }else{
                JOptionPane.showMessageDialog(null, "Invalid password");
                txtUser.setText("");
                txtpass.setText("");
            }
  
    }//GEN-LAST:event_connectActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jpass;
    private javax.swing.JLabel lbuser;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
