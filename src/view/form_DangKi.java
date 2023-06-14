
package view;


import Controller.Query_CSDL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class form_DangKi extends javax.swing.JFrame {

    /**
     * Creates new form form_DangKi
     */
    public form_DangKi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        check_end = new javax.swing.JCheckBox();
        btn_ADD = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gt = new javax.swing.JTextField();
        txt_CMT = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_addr = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ID_user = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Họ và tên:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("    Ngày sinh");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 220, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("    Số  CCCD/CTCD");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 254, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText(" Địa chỉ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 300, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("    Số điện thoại");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 340, 140, -1));

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Trang đăng kí ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 0, 263, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Tôi xin cam đoan thông tin tờ khai là sự thật và đầy đủ ");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 330, 21));

        check_end.setBackground(new java.awt.Color(51, 0, 204));
        check_end.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_endMouseClicked(evt);
            }
        });
        check_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_endActionPerformed(evt);
            }
        });
        jPanel4.add(check_end, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        btn_ADD.setBackground(new java.awt.Color(204, 102, 255));
        btn_ADD.setText("Đăng kí");
        btn_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ADDActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        jButton8.setBackground(new java.awt.Color(204, 102, 255));
        jButton8.setText("Thoát");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Số hộ nhân khẩu ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 144, -1, 20));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 36, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Giới tính");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));
        jPanel4.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 270, 30));
        jPanel4.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 270, -1));
        jPanel4.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, -1));

        gt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gtActionPerformed(evt);
            }
        });
        jPanel4.add(gt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 270, -1));

        txt_CMT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CMTFocusLost(evt);
            }
        });
        txt_CMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CMTActionPerformed(evt);
            }
        });
        jPanel4.add(txt_CMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 270, -1));

        txt_sdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_sdtFocusLost(evt);
            }
        });
        txt_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sdtActionPerformed(evt);
            }
        });
        jPanel4.add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 270, -1));
        jPanel4.add(txt_addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 270, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("   ID_user");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 90, 80, -1));
        jPanel4.add(ID_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 270, 30));

        jLabel11.setText("!!!!! là mã số BHXH");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 248, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 470));

        jLabel14.setText("jLabel14");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 264, -1, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_endMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_endMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_check_endMouseClicked

    private void check_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_endActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_check_endActionPerformed

    private void btn_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ADDActionPerformed
        // TODO add your handling code here:
        if(name.getText().equals("") || ID.getText().equals("")|| gt.getText().equals("")|| age.getText().equals("") || 
                txt_CMT.getText().equals("")|| txt_addr.getText().equals("")||
            txt_sdt.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Không được để trống ");
            if(check_end.isSelected() == false){
                JOptionPane.showMessageDialog(this, "không được để trống ");

            }
        }else{
            String data[]={ID_user.getText(),name.getText(),ID.getText()};
            String data2[]={ID_user.getText(),ID.getText(),name.getText(), gt.getText(), 
                age.getText(), txt_CMT.getText(),txt_addr.getText()};
            try {
                boolean a = new Query_CSDL().addCSDL("login", data);
                boolean b = new Query_CSDL().addCSDL("nhankhau", data2);
                if(a == true && b == true ){
                    JOptionPane.showMessageDialog(this, "Đăng kí thành công \n Tài khoản là tên của bạn \n "
                            + "Mật khẩu là ID\n bạn nên đổi mật khẩu mới để đảm bảo an toàn");

                }
                else
                    JOptionPane.showMessageDialog(null , "ID nhap sai hoặc bạn đã đăng kí , vui lòng kiểm tra lại");
                
            } catch (SQLException ex) {
                Logger.getLogger(form_DangKi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_ADDActionPerformed

    private void txt_CMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CMTActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_CMTActionPerformed

    private void gtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gtActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new main2().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txt_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sdtActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_sdtActionPerformed

    private void txt_sdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_sdtFocusLost
        // TODO add your handling code here:
         String SDT1 = txt_sdt.getText();
        String res= "^\\d{10}|| \\d{12}$";
        if(SDT1.length()>0){
            if(!SDT1.matches(res)){
                JOptionPane.showMessageDialog(this, "nhập sai định dạng SDT");
            }}
    }//GEN-LAST:event_txt_sdtFocusLost

    private void txt_CMTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CMTFocusLost
        // TODO add your handling code here:
          String CMT1 = txt_CMT.getText();
        String res= "^\\d{10}|| \\d{0}$";
        if(CMT1.length()>0){
            if(!CMT1.matches(res)){
               JOptionPane.showMessageDialog(this, "nhập sai định dang CCCD/CTCD ");
            }}
    }//GEN-LAST:event_txt_CMTFocusLost

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
            java.util.logging.Logger.getLogger(form_DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_DangKi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ID_user;
    private javax.swing.JTextField age;
    private javax.swing.JButton btn_ADD;
    private javax.swing.JCheckBox check_end;
    private javax.swing.JTextField gt;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField name;
    private javax.swing.JTextField txt_CMT;
    private javax.swing.JTextField txt_addr;
    private javax.swing.JTextField txt_sdt;
    // End of variables declaration//GEN-END:variables
}
