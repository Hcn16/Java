
package view;


import Controller.Query_CSDL;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel4.setText("UserName");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 204, 102));
        jLabel5.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        txt_user.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_userCaretUpdate(evt);
            }
        });
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 210, -1));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 210, -1));

        btn_login.setBackground(new java.awt.Color(204, 0, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Đổi mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        btn_cancel.setBackground(new java.awt.Color(204, 102, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setText("Đổi mật khẩu");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
   
    public void click_Login(){
            Query_CSDL a = new Query_CSDL();
        try {
        
            a.login(txt_user.getText(), String.valueOf(txt_password.getPassword()));
           
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
        click_Login();
        
    }//GEN-LAST:event_txt_passActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new doiMatKhau().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        click_Login();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            click_Login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
        /*     if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            login();
        }*/
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_userCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_userCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userCaretUpdate

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        new main2().setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
