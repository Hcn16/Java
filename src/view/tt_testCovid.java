
package view;

import Controller.Query_CSDL;
import Data.nhankhau_cly;
import Data.nhankhau_test;
import java.awt.Color;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tt_testCovid extends javax.swing.JFrame {

   private ArrayList<nhankhau_test> list;
    DefaultTableModel model;  
    
    public tt_testCovid() {
        initComponents();
       
        list = new Query_CSDL().doc_CSDL("thongtintestcovid",0);
        model = (DefaultTableModel) tbl_test.getModel();
           showTable(list);
        
        
    }


  
    
        
     
 public void showTable(ArrayList<nhankhau_test> list){
        for(nhankhau_test per : list){
            model.addRow(new Object[]{
                per.getID_user(),per.getName(),per.getHinhthuc(),per.getThoidiem(), per.getKetqua()
                    
            });
        }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        btn_add = new javax.swing.JButton();
        btn_update2 = new javax.swing.JButton();
        btn_cancel1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        box_hinhthuc = new javax.swing.JComboBox<>();
        box_kqua = new javax.swing.JComboBox<>();
        txt_thoidiem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_test = new javax.swing.JTable();
        btn_Xoa = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_refesh = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        btn_search_name = new javax.swing.JButton();
        txt_search_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(204, 102, 255));
        btn_add.setText("Lưu");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        panel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        btn_update2.setBackground(new java.awt.Color(204, 102, 255));
        btn_update2.setText("Cập nhập");
        btn_update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update2ActionPerformed(evt);
            }
        });
        panel1.add(btn_update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        btn_cancel1.setBackground(new java.awt.Color(204, 102, 255));
        btn_cancel1.setText("Cancel");
        btn_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel1ActionPerformed(evt);
            }
        });
        panel1.add(btn_cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel1.setText("ID_user");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, 68, -1));

        jLabel2.setText("Họ và tên");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 69, 68, -1));

        jLabel3.setText("Hình thức test");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 107, -1, -1));

        jLabel4.setText("Thời điểm");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 148, 68, -1));

        jLabel5.setText("Kết quả");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 201, 68, -1));
        panel1.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 28, 230, -1));
        panel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 66, 230, -1));

        box_hinhthuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test nhanh 24h", "Test PCR" }));
        box_hinhthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_hinhthucActionPerformed(evt);
            }
        });
        panel1.add(box_hinhthuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 104, 122, -1));

        box_kqua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Âm tính", "Dương tính" }));
        panel1.add(box_kqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 201, 123, -1));

        txt_thoidiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_thoidiemActionPerformed(evt);
            }
        });
        panel1.add(txt_thoidiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 145, 171, -1));

        jLabel6.setText("!!!! nam-thang-ngay (yyyy-mm-dd)");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 169, 193, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 340));

        jTabbedPane1.addTab("thông tin test", panel1);

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_user", "Họ và tên", "Hình thức test", "thời điểm", "Kết quả"
            }
        ));
        tbl_test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_testMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_test);

        panel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 127));

        btn_Xoa.setBackground(new java.awt.Color(204, 102, 255));
        btn_Xoa.setText("Xoá");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });
        panel2.add(btn_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 282, -1, -1));

        btn_update.setBackground(new java.awt.Color(204, 102, 255));
        btn_update.setText("Chỉnh sửa");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        panel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 282, -1, -1));

        btn_cancel.setBackground(new java.awt.Color(204, 102, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        panel2.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 282, -1, -1));

        btn_refesh.setBackground(new java.awt.Color(204, 102, 255));
        btn_refesh.setText("refesh");
        btn_refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refeshActionPerformed(evt);
            }
        });
        panel2.add(btn_refesh, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 282, -1, -1));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tải xuống.jpg"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        panel2.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 207, 35, 23));
        panel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 208, 140, -1));

        btn_search_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tải xuống.jpg"))); // NOI18N
        btn_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_nameActionPerformed(evt);
            }
        });
        panel2.add(btn_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 208, 40, 22));

        txt_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_nameActionPerformed(evt);
            }
        });
        panel2.add(txt_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 208, 159, -1));

        jLabel7.setText("Tìm kiếm theo ID");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 175, -1, -1));

        jLabel8.setText("Tìm kiếm theo tên");
        panel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 175, 91, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 560, 350));

        jTabbedPane1.addTab("Bảng thông kê", panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_thoidiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_thoidiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_thoidiemActionPerformed

    private void box_hinhthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_hinhthucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_hinhthucActionPerformed
   
      
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String hinhthuc = (String)box_hinhthuc.getSelectedItem();
        String ketqua = (String)box_kqua.getSelectedItem();
      
        if(txt_ID.getText().equals("") || txt_name.getText().equals("") ||txt_thoidiem.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Không được để trống ");

        }else{

            String data[] = {txt_ID.getText() ,txt_name.getText(),hinhthuc,txt_thoidiem.getText(),ketqua};
            

          boolean t=false;
            try {
                t =new Query_CSDL().addCSDL("thongtintestcovid", data);
                if(t == true){
                    JOptionPane.showMessageDialog(this, "Add Success into Database");
                    
                }else{
                       JOptionPane.showMessageDialog(this, "ID trùng, Nguoi da da khai bao, moi nhap lai");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(tt_testCovid.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(t== true){
            DefaultTableModel tblModel = (DefaultTableModel) tbl_test.getModel();
            tblModel.addRow(data);
            
            JOptionPane.showMessageDialog(this, "khai báo thành công ");
    
             txt_ID.setText("");
              txt_name.setText("");
             txt_thoidiem.setText("");
            }  
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tbl_test.getModel();
        int ID_user=0;
        if(tbl_test.getSelectedRowCount()==1){
            ID_user = (int)tblModel.getValueAt(tbl_test.getSelectedRow(), 0);
            try {
                 if(JOptionPane.showConfirmDialog(null, "Delete this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
              new Query_CSDL().xoaCSDL("thongtintestcovid",ID_user);
                 tblModel.removeRow(tbl_test.getSelectedRow());
            }
      
               
            } catch (SQLException ex) {
                Logger.getLogger(tt_testCovid.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
        }
        else{
            if(tbl_test.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn để xoá  ");

            }
        }
       
      
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tbl_test.getModel();
    
        String hinhthuc = (String)box_hinhthuc.getSelectedItem();
        String ketqua = (String)box_kqua.getSelectedItem();
      
        tblModel.setValueAt(txt_ID.getText(),tbl_test.getSelectedRow(), 0);
        tblModel.setValueAt(txt_name.getText(),tbl_test.getSelectedRow(), 1);
        tblModel.setValueAt(hinhthuc,tbl_test.getSelectedRow(), 2);
        tblModel.setValueAt(txt_thoidiem.getText(),tbl_test.getSelectedRow(), 3);
        tblModel.setValueAt(ketqua,tbl_test.getSelectedRow(), 4);
       String []data = {txt_ID.getText(), txt_name.getText(), hinhthuc, txt_thoidiem.getText(),ketqua};
        
        try {
            new Query_CSDL().editCSDL("thongtintestcovid",Integer.parseInt(txt_ID.getText()),data);
        } catch (SQLException ex) {
            Logger.getLogger(nhankhau_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_update2ActionPerformed

   
    private void tbl_testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_testMouseClicked
        // TODO add your handling code here:
           DefaultTableModel tblModel = (DefaultTableModel) tbl_test.getModel();
       String hinhthuc = (String)box_hinhthuc.getSelectedItem();
        String ketqua = (String)box_kqua.getSelectedItem();
       
        txt_ID.setText( tblModel.getValueAt(tbl_test.getSelectedRow(), 0).toString());
         txt_name.setText( tblModel.getValueAt(tbl_test.getSelectedRow(), 1).toString());
        txt_thoidiem.setText( tblModel.getValueAt(tbl_test.getSelectedRow(), 3).toString());
        box_hinhthuc.setSelectedItem(tblModel.getValueAt(tbl_test.getSelectedRow(), 2).toString());
        box_kqua.setSelectedItem(tblModel.getValueAt(tbl_test.getSelectedRow(), 4).toString());

     
    }//GEN-LAST:event_tbl_testMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
      String hinhthuc=null,ketqua=null;
           DefaultTableModel tblModel = (DefaultTableModel) tbl_test.getModel();
  
      txt_ID.setText( tblModel.getValueAt(tbl_test.getSelectedRow(), 0).toString());
         txt_name.setText( tblModel.getValueAt(tbl_test.getSelectedRow(), 1).toString());
        txt_thoidiem.setText( tblModel.getValueAt(tbl_test.getSelectedRow(), 3).toString());
        box_hinhthuc.setSelectedItem(tblModel.getValueAt(tbl_test.getSelectedRow(), 2).toString());
        box_kqua.setSelectedItem(tblModel.getValueAt(tbl_test.getSelectedRow(), 4).toString());
           hinhthuc = (String)box_hinhthuc.getSelectedItem();
        ketqua = (String)box_kqua.getSelectedItem();
    
        
       String []data = {txt_ID.getText(), txt_name.getText(), hinhthuc, txt_thoidiem.getText(),ketqua};
        System.out.println(hinhthuc + ketqua);
        try {
            new Query_CSDL().editCSDL("thongtintestcovid",Integer.parseInt(txt_ID.getText()),data);
        } catch (SQLException ex) {
            Logger.getLogger(nhankhau_test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    public void clearTable()
{
    DefaultTableModel dm = (DefaultTableModel) tbl_test.getModel();
    dm.getDataVector().removeAllElements();
    revalidate();
}
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
            // TODO add your handling code here:
           clearTable();
            boolean a = new Query_CSDL().timkiem("thongtintestcovid",Integer.parseInt(txt_search.getText()));
            ArrayList<nhankhau_test> list1;
            list1 = new Query_CSDL().doc_CSDL("thongtintestcovid",Integer.parseInt(txt_search.getText()));
            model = (DefaultTableModel) tbl_test.getModel();
            
            showTable(list1);
        } catch (SQLException ex) {
            Logger.getLogger(tt_testCovid.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        new General().setVisible(true);
        
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel1ActionPerformed
        // TODO add your handling code here:
        new General().setVisible(true);
    }//GEN-LAST:event_btn_cancel1ActionPerformed

    private void btn_refeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refeshActionPerformed
        // TODO add your handling code here:
        clearTable();
        list = new Query_CSDL().doc_CSDL("thongtintestcovid",0);
        model = (DefaultTableModel) tbl_test.getModel();
           showTable(list);
            txt_search_name.setText("");
           txt_search.setText("");

    }//GEN-LAST:event_btn_refeshActionPerformed

    private void txt_search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_nameActionPerformed

    private void btn_search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_nameActionPerformed
        // TODO add your handling code here:
        clearTable();
     
        ArrayList<nhankhau_test> list1;
        list1 = new Query_CSDL().doc_CSDL_name("thongtintestcovid",txt_search_name.getText());
        model = (DefaultTableModel) tbl_test.getModel();
        
        if(list1.size() != 0 ){
            JOptionPane.showMessageDialog(null, "Tìm thấy ");
        }
        else if (list1.size() == 0){
            JOptionPane.showMessageDialog(null, "Không tìm thấy ");
        
        }
        showTable(list1);
        
    }//GEN-LAST:event_btn_search_nameActionPerformed

    
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
            java.util.logging.Logger.getLogger(tt_testCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tt_testCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tt_testCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tt_testCovid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tt_testCovid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_hinhthuc;
    private javax.swing.JComboBox<String> box_kqua;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cancel1;
    private javax.swing.JButton btn_refesh;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search_name;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTable tbl_test;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search_name;
    private javax.swing.JTextField txt_thoidiem;
    // End of variables declaration//GEN-END:variables
}
