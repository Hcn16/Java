/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;

import Controller.Query_CSDL;
import Data.nhankhau_cly;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class tt_cly extends javax.swing.JFrame {

    private ArrayList<nhankhau_cly> list;
    DefaultTableModel model;  
    public tt_cly() {
        initComponents();
        list = new Query_CSDL().doc_CSDL("thongtincachly",0);
        model = (DefaultTableModel) tbl_cly.getModel();
           showTable(list);
    }


  
    
        
     
 public void showTable(ArrayList<nhankhau_cly> list){
        for(nhankhau_cly per : list){
            model.addRow(new Object[]{
                per.getID_user(),per.getName(),per.getNoicachly(),per.getThoidiem(), per.getMucdo()
                    
            });
        }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_cancel1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_thoidiem = new javax.swing.JTextField();
        box_noicachly = new javax.swing.JComboBox<>();
        box_mucdo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_cly = new javax.swing.JTable();
        btn_xoa = new javax.swing.JButton();
        btn_update2 = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        btn_search_name = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_search_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_refesh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add.setBackground(new java.awt.Color(204, 102, 255));
        btn_add.setText("Lưu");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel3.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 392, -1, -1));

        btn_update.setBackground(new java.awt.Color(204, 102, 255));
        btn_update.setText("Cập nhập");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel3.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 392, -1, -1));

        btn_cancel1.setBackground(new java.awt.Color(204, 102, 255));
        btn_cancel1.setText("Cancel");
        btn_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 392, -1, -1));

        jLabel7.setText("!!!! nam-thang-ngay (yyyy-mm-dd)");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 173, 193, -1));

        jLabel2.setText("ID_user");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        jPanel3.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 11, 231, 33));

        jLabel4.setText("Họ và tên");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 65, -1, -1));

        jLabel5.setText("nơi cách ly");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 103, -1, -1));

        jLabel8.setText("thởi điểm");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 145, -1, -1));

        jLabel9.setText("Mức độ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 206, -1, -1));
        jPanel3.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 62, 231, -1));
        jPanel3.add(txt_thoidiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 142, 231, -1));

        box_noicachly.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "trường học", "trạm y tế", "tại nhà", "khác" }));
        jPanel3.add(box_noicachly, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 100, 109, -1));

        box_mucdo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F1", "F2", "F0", "khác" }));
        jPanel3.add(box_mucdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 203, 109, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -6, 560, 450));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thông tin cách ly", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_cly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_user", "Họ và tên", "Nơi cách ly", "Thời điểm", "Mức độ"
            }
        ));
        tbl_cly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_cly);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 564, 207));

        btn_xoa.setBackground(new java.awt.Color(204, 153, 255));
        btn_xoa.setText("Xoá");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 352, -1, -1));

        btn_update2.setBackground(new java.awt.Color(204, 153, 255));
        btn_update2.setText("Chỉnh sửa");
        btn_update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 352, -1, -1));

        btn_cancel.setBackground(new java.awt.Color(204, 153, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 352, -1, -1));

        btn_search.setBackground(new java.awt.Color(204, 153, 255));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tải xuống.jpg"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel2.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 267, 25, 28));

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 267, 177, 28));

        btn_search_name.setBackground(new java.awt.Color(204, 153, 255));
        btn_search_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tải xuống.jpg"))); // NOI18N
        btn_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_nameActionPerformed(evt);
            }
        });
        jPanel2.add(btn_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 267, 25, 28));

        jLabel1.setText("Tìm kiếm theo ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 242, -1, -1));

        txt_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_nameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 267, 177, 28));

        jLabel3.setText("Tìm kiếm theo tên ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 242, -1, -1));

        btn_refesh.setBackground(new java.awt.Color(204, 153, 255));
        btn_refesh.setText("Refesh");
        btn_refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refeshActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refesh, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 352, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 570, 440));

        jTabbedPane1.addTab("Bảng thống kê", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
         String noicachly = (String)box_noicachly.getSelectedItem();
        String mucdo = (String)box_mucdo.getSelectedItem();
      
        if(txt_ID.getText().equals("") || txt_name.getText().equals("") 
                || noicachly.equals("") || mucdo.equals("")||txt_thoidiem.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Không được để trống ");

        }else{

            String data[] = {txt_ID.getText() ,txt_name.getText(),noicachly, txt_thoidiem.getText(),mucdo};            
           
          boolean t=false;
            try {
                t =new Query_CSDL().addCSDL("thongtincachly", data);
                if(t == true){
                    JOptionPane.showMessageDialog(this, "Add Success into Database");
                    
                }else{
                       JOptionPane.showMessageDialog(this, "ID trùng, Nguoi da da khai bao, moi nhap lai");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(tt_cly.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(t== true){
            DefaultTableModel tblModel = (DefaultTableModel) tbl_cly.getModel();
            tblModel.addRow(data);
             JOptionPane.showMessageDialog(this, "khai báo thành công ");
    
             txt_ID.setText("");
              txt_name.setText("");
              txt_thoidiem.setText("");
            }  
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
           DefaultTableModel tblModel = (DefaultTableModel) tbl_cly.getModel();
    
         String noicachly = (String)box_noicachly.getSelectedItem();
        String mucdo = (String)box_mucdo.getSelectedItem();
      
        tblModel.setValueAt(txt_ID.getText(),tbl_cly.getSelectedRow(), 0);
        tblModel.setValueAt(txt_name.getText(),tbl_cly.getSelectedRow(), 1);
        tblModel.setValueAt(noicachly,tbl_cly.getSelectedRow(), 2);
        tblModel.setValueAt(txt_thoidiem.getText(),tbl_cly.getSelectedRow(), 3);
        tblModel.setValueAt(mucdo,tbl_cly.getSelectedRow(), 4);
       String []data = {txt_ID.getText(), txt_name.getText(), noicachly , txt_thoidiem.getText(),mucdo};
        
        try {
            new Query_CSDL().editCSDL("thongtincachly",Integer.parseInt(txt_ID.getText()),data);
        } catch (SQLException ex) {
            Logger.getLogger(nhankhau_cly.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update2ActionPerformed
        // TODO add your handling code here:
          String noicachly=null,mucdo=null;
           DefaultTableModel tblModel = (DefaultTableModel) tbl_cly.getModel();
  
      txt_ID.setText( tblModel.getValueAt(tbl_cly.getSelectedRow(), 0).toString());
         txt_name.setText( tblModel.getValueAt(tbl_cly.getSelectedRow(), 1).toString());
        txt_thoidiem.setText( tblModel.getValueAt(tbl_cly.getSelectedRow(), 3).toString());
        box_noicachly.setSelectedItem(tblModel.getValueAt(tbl_cly.getSelectedRow(), 2).toString());
        box_mucdo.setSelectedItem(tblModel.getValueAt(tbl_cly.getSelectedRow(), 4).toString());
           noicachly = (String)box_noicachly.getSelectedItem();
        mucdo = (String)box_mucdo.getSelectedItem();
    
        
       String []data = {txt_ID.getText(), txt_name.getText(), noicachly, txt_thoidiem.getText(),mucdo};
       try {
            new Query_CSDL().editCSDL("thongtincachly",Integer.parseInt(txt_ID.getText()),data);
        } catch (SQLException ex) {
            Logger.getLogger(nhankhau_cly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_update2ActionPerformed

    private void tbl_clyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clyMouseClicked
        // TODO add your handling code here:
                DefaultTableModel tblModel = (DefaultTableModel) tbl_cly.getModel();
       String mucdo = (String)box_mucdo.getSelectedItem();
        String noicachly = (String)box_noicachly.getSelectedItem();
       
        txt_ID.setText( tblModel.getValueAt(tbl_cly.getSelectedRow(), 0).toString());
         txt_name.setText( tblModel.getValueAt(tbl_cly.getSelectedRow(), 1).toString());
        txt_thoidiem.setText( tblModel.getValueAt(tbl_cly.getSelectedRow(), 3).toString());
        box_noicachly.setSelectedItem(tblModel.getValueAt(tbl_cly.getSelectedRow(), 2).toString());
        box_mucdo.setSelectedItem(tblModel.getValueAt(tbl_cly.getSelectedRow(), 4).toString());

    }//GEN-LAST:event_tbl_clyMouseClicked

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
             DefaultTableModel tblModel = (DefaultTableModel) tbl_cly.getModel();
        int ID_user=0;
        if(tbl_cly.getSelectedRowCount()==1){
            ID_user = (int)tblModel.getValueAt(tbl_cly.getSelectedRow(), 0);
            try {
                  if(JOptionPane.showConfirmDialog(null, "Delete this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               tblModel.removeRow(tbl_cly.getSelectedRow());
                new Query_CSDL().xoaCSDL("thongtincachly",ID_user);
                  }
            } catch (SQLException ex) {
                Logger.getLogger(tt_cly.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
        }
        else{
            if(tbl_cly.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "Hãy chọn một hàng đơn để xoá  ");

            }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed
    public void clearTable(){
    DefaultTableModel dm = (DefaultTableModel) tbl_cly.getModel();
    dm.getDataVector().removeAllElements();
    revalidate();
}
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
           clearTable();
            boolean a = new Query_CSDL().timkiem("thongtincachly",Integer.parseInt(txt_search.getText()));
            ArrayList<nhankhau_cly> list1;
            list1 = new Query_CSDL().doc_CSDL("thongtincachly",Integer.parseInt(txt_search.getText()));
            model = (DefaultTableModel) tbl_cly.getModel();
            
            showTable(list1);
        } catch (SQLException ex) {
            Logger.getLogger(tt_cly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel1ActionPerformed
        // TODO add your handling code here:
        new General().setVisible(true);
    }//GEN-LAST:event_btn_cancel1ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        new General().setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_nameActionPerformed
        // TODO add your handling code here:
        clearTable();
        DefaultTableModel model1;
        ArrayList<nhankhau_cly> list2;
        list2 = new Query_CSDL().doc_CSDL_name("thongtincachly",txt_search_name.getText());
        System.out.println(list2);
        model1 = (DefaultTableModel) tbl_cly.getModel();
        if(list2.size() != 0 ){
            JOptionPane.showMessageDialog(null, "Tìm thấy ");
        }
        else if (list2.size() == 0){
            JOptionPane.showMessageDialog(null, "Không tìm thấy ");
        
        }
        showTable(list2);
        
    }//GEN-LAST:event_btn_search_nameActionPerformed

    private void txt_search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_nameActionPerformed

    private void btn_refeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refeshActionPerformed
        // TODO add your handling code here:
        clearTable();
        list = new Query_CSDL().doc_CSDL("thongtincachly",0);
        model = (DefaultTableModel) tbl_cly.getModel();
           showTable(list);
           txt_search_name.setText("");
           txt_search.setText("");
    }//GEN-LAST:event_btn_refeshActionPerformed

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
            java.util.logging.Logger.getLogger(tt_cly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tt_cly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tt_cly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tt_cly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tt_cly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_mucdo;
    private javax.swing.JComboBox<String> box_noicachly;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cancel1;
    private javax.swing.JButton btn_refesh;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search_name;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_update2;
    private javax.swing.JButton btn_xoa;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_cly;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search_name;
    private javax.swing.JTextField txt_thoidiem;
    // End of variables declaration//GEN-END:variables



}
