
package view;

import Controller.Query_CSDL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class doiMatKhau extends javax.swing.JFrame {

    
    public doiMatKhau() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_ID = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_MK_new = new javax.swing.JPasswordField();
        txt_new2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_cu = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID_user");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 60, -1, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 98, -1, -1));

        jLabel3.setText("Mật khẩu cũ ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 136, -1, -1));

        jLabel4.setText("Mật khẩu mới ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 174, -1, -1));

        jLabel5.setText("Xác nhận lại MK");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 215, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 102, 255));
        jButton1.setText("Xác nhân");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 250, -1, -1));
        getContentPane().add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 57, 144, -1));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 95, 144, -1));
        getContentPane().add(txt_MK_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 171, 144, -1));
        getContentPane().add(txt_new2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 212, 144, -1));

        jButton2.setBackground(new java.awt.Color(204, 102, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 250, -1, -1));

        jLabel6.setText("Thông tin đổi mật khẩu ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 11, -1, -1));
        getContentPane().add(txt_cu, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 133, 144, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String data[]={txt_ID.getText(), txt_name.getText(), String.valueOf(txt_MK_new.getPassword() )};
        String old = String.valueOf(txt_cu.getPassword());
         String new1 = String.valueOf(txt_MK_new.getPassword());
        String new2 = String.valueOf(txt_new2.getPassword());
        boolean a=false;
        try {
            a= new Query_CSDL().login(txt_name.getText(), old);
        } catch (SQLException ex) {
            Logger.getLogger(doiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(a == true){
            if(new1.equals(new2)){
        try {
            new Query_CSDL().editCSDL("login", Integer.parseInt(txt_ID.getText()),data );
        } catch (SQLException ex) {
            Logger.getLogger(doiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            else JOptionPane.showMessageDialog(null, "xác nhận lại MK");
        }
        else 
            JOptionPane.showMessageDialog(null, "Mật khẩu hoặc tài khoản nhập sai ");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JPasswordField txt_MK_new;
    private javax.swing.JPasswordField txt_cu;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_new2;
    // End of variables declaration//GEN-END:variables
}
