/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.Query_CSDL;
import Data.nhankhau_cly;
import Data.nhankhau_khaibao;
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
public class tt_khaibao extends javax.swing.JFrame {

   private ArrayList<nhankhau_khaibao> list;
    DefaultTableModel model;  
    public tt_khaibao() {
        initComponents();
        list = new Query_CSDL().doc_CSDL("thongtinkhaibao",0);
        model = (DefaultTableModel) tbl_khaibao.getModel();
           showTable(list);
    }


  
    
        
     
 public void showTable(ArrayList<nhankhau_khaibao> list){
        for(nhankhau_khaibao per : list){
            model.addRow(new Object[]{
                per.getID_user(),per.getName(),per.getVungdich(),per.getNgaykhaibao(), per.getBieuhien()
                    
            });
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        btn_cancel = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_ngaykhaibao = new javax.swing.JTextField();
        box_bHien = new javax.swing.JComboBox<>();
        box_vdich = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khaibao = new javax.swing.JTable();
        btn_xoa = new javax.swing.JButton();
        btn_update2 = new javax.swing.JButton();
        btn_cancel1 = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        txt_search_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_search_name = new javax.swing.JButton();
        btn_refesh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 305, -1, -1));

        btn_update.setBackground(new java.awt.Color(204, 153, 255));
        btn_update.setText("Cập nhập");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 305, -1, -1));

        btn_add.setBackground(new java.awt.Color(204, 153, 255));
        btn_add.setText("Lưu");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 305, -1, -1));

        jLabel6.setText("!!!! nam-thang-ngay (yyyy-mm-dd)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 174, 193, -1));

        jLabel1.setText("ID_user");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 27, -1, -1));

        jLabel2.setText("Họ  và tên");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 68, -1, -1));

        jLabel3.setText("vùng dịch");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 106, -1, -1));

        jLabel4.setText("ngày khai báo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 144, -1, -1));

        jLabel5.setText("biểu hiện");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 198, -1, -1));
        jPanel1.add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 24, 179, -1));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 65, 179, -1));
        jPanel1.add(txt_ngaykhaibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 141, 179, -1));

        box_bHien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bình thường", "Ho hoặc sốt", "Khó thở", "mệt mỏi" }));
        jPanel1.add(box_bHien, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 195, 117, -1));

        box_vdich.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "xanh", "đỏ", "vàng" }));
        jPanel1.add(box_vdich, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 103, 115, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 580, 360));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("thông tin khai báo", panel1);

        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_khaibao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_user", "Họ và tên", "Vùng dịch", "Ngày khai báo", "Biểu hiện"
            }
        ));
        tbl_khaibao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khaibaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khaibao);
        if (tbl_khaibao.getColumnModel().getColumnCount() > 0) {
            tbl_khaibao.getColumnModel().getColumn(4).setResizable(false);
        }

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 574, 193));

        btn_xoa.setBackground(new java.awt.Color(204, 102, 255));
        btn_xoa.setText("Xoá");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        panel2.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 293, -1, -1));

        btn_update2.setBackground(new java.awt.Color(204, 102, 255));
        btn_update2.setText("Chỉnh sửa");
        btn_update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update2ActionPerformed(evt);
            }
        });
        panel2.add(btn_update2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 293, -1, -1));

        btn_cancel1.setBackground(new java.awt.Color(204, 102, 255));
        btn_cancel1.setText("Cancel");
        btn_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel1ActionPerformed(evt);
            }
        });
        panel2.add(btn_cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 293, -1, -1));

        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tải xuống.jpg"))); // NOI18N
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        panel2.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 240, 39, 20));
        panel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 240, 125, -1));
        panel2.add(txt_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 161, -1));

        jLabel7.setText("Tìm kiếm theo ID");
        panel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 215, -1, -1));

        jLabel8.setText("Tìm kiếm theo tên");
        panel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 215, -1, -1));

        btn_search_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tải xuống.jpg"))); // NOI18N
        btn_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_nameActionPerformed(evt);
            }
        });
        panel2.add(btn_search_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 240, 39, 20));

        btn_refesh.setBackground(new java.awt.Color(204, 102, 255));
        btn_refesh.setText("refesh");
        btn_refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refeshActionPerformed(evt);
            }
        });
        panel2.add(btn_refesh, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 293, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pic3.png"))); // NOI18N
        panel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 580, 350));

        jTabbedPane1.addTab("Bảng thống kê", panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String vungdich = (String)box_vdich.getSelectedItem();
        String bieuhien = (String)box_bHien.getSelectedItem();
      
        if(txt_ID.getText().equals("") || txt_name.getText().equals("") 
                || vungdich.equals("") || bieuhien.equals("")||txt_ngaykhaibao.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Không được để trống ");

        }else{

            String data[] = {txt_ID.getText() ,txt_name.getText(),vungdich,bieuhien,txt_ngaykhaibao.getText() };            
            String data2[] = {txt_ID.getText() ,txt_name.getText(),vungdich,txt_ngaykhaibao.getText(),bieuhien };            
          
          boolean t=false;
            try {
                t =new Query_CSDL().addCSDL("thongtinkhaibao", data);
                if(t == true){
                    JOptionPane.showMessageDialog(this, "Add Success into Database");
                    
                }else{
                       JOptionPane.showMessageDialog(this, "ID trùng, Nguoi da da khai bao, moi nhap lai");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(tt_khaibao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(t== true){
            DefaultTableModel tblModel = (DefaultTableModel) tbl_khaibao.getModel();
            tblModel.addRow(data2);
              JOptionPane.showMessageDialog(this, "khai báo thành công ");
    
             txt_ID.setText("");
              txt_name.setText("");
              txt_ngaykhaibao.setText("");
            }  
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
             DefaultTableModel tblModel = (DefaultTableModel) tbl_khaibao.getModel();
        int ID_user=0;
        if(tbl_khaibao.getSelectedRowCount()==1){
            ID_user = (int)tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 0);
            try {
               if(JOptionPane.showConfirmDialog(null, "Delete this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                   tblModel.removeRow(tbl_khaibao.getSelectedRow());
                     new Query_CSDL().xoaCSDL("thongtinkhaibao",ID_user);
               }
              
            } catch (SQLException ex) {
                Logger.getLogger(tt_cly.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
        else{
            if(tbl_khaibao.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn để xoá  ");

            }
        }
       
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tbl_khaibaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khaibaoMouseClicked
        // TODO add your handling code here:
             DefaultTableModel tblModel = (DefaultTableModel) tbl_khaibao.getModel();
       String vungdich = (String)box_vdich.getSelectedItem();
        String bieuhien = (String)box_bHien.getSelectedItem();
       
        txt_ID.setText( tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 0).toString());
         txt_name.setText( tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 1).toString());
        txt_ngaykhaibao.setText( tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 3).toString());
        box_vdich.setSelectedItem(tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 2).toString());
        box_bHien.setSelectedItem(tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 4).toString());

    }//GEN-LAST:event_tbl_khaibaoMouseClicked

    public void clearTable(){
    DefaultTableModel dm = (DefaultTableModel) tbl_khaibao.getModel();
    dm.getDataVector().removeAllElements();
    revalidate();
}
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
           try {
            // TODO add your handling code here:
           clearTable();
            boolean a = new Query_CSDL().timkiem("thongtinkhaibao",Integer.parseInt(txt_search.getText()));
            ArrayList<nhankhau_khaibao> list1;
            list1 = new Query_CSDL().doc_CSDL("thongtinkhaibao",Integer.parseInt(txt_search.getText()));
            model = (DefaultTableModel) tbl_khaibao.getModel();
            
            showTable(list1);
        } catch (SQLException ex) {
            Logger.getLogger(tt_khaibao.class.getName()).log(Level.SEVERE, null, ex);
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
        ArrayList<nhankhau_khaibao> list1;
        list1 = new Query_CSDL().doc_CSDL_name("thongtinkhaibao",txt_search_name.getText());
        model = (DefaultTableModel) tbl_khaibao.getModel();
        if(list1.size() != 0 ){
            JOptionPane.showMessageDialog(null, "Tìm thấy ");
        }
        else if (list1.size() == 0){
            JOptionPane.showMessageDialog(null, "Không tìm thấy ");
        
        }
        showTable(list1);
        
    }//GEN-LAST:event_btn_search_nameActionPerformed

    private void btn_refeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refeshActionPerformed
        // TODO add your handling code here:
        clearTable();
        list = new Query_CSDL().doc_CSDL("thongtinkhaibao",0);
        model = (DefaultTableModel) tbl_khaibao.getModel();
           showTable(list);
            txt_search_name.setText("");
           txt_search.setText("");

    }//GEN-LAST:event_btn_refeshActionPerformed

    public void update(){
           DefaultTableModel tblModel = (DefaultTableModel) tbl_khaibao.getModel();
           String vungdich = (String)box_vdich.getSelectedItem();
        String bieuhien = (String)box_bHien.getSelectedItem();
      
      txt_ID.setText( tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 0).toString());
         txt_name.setText( tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 1).toString());
            box_vdich.setSelectedItem(tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 2).toString());
        txt_ngaykhaibao.setText( tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 3).toString());
         box_bHien.setSelectedItem(tblModel.getValueAt(tbl_khaibao.getSelectedRow(), 4).toString());
           vungdich = (String)box_vdich.getSelectedItem();
        bieuhien = (String)box_bHien.getSelectedItem();
    
        
       String []data = {txt_ID.getText(), txt_name.getText(), vungdich, bieuhien,txt_ngaykhaibao.getText()};
         try {
            new Query_CSDL().editCSDL("thongtinkhaibao",Integer.parseInt(txt_ID.getText()),data);
        } catch (SQLException ex) {
            Logger.getLogger(nhankhau_khaibao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update2ActionPerformed
        // TODO add your handling code here:
       
    update();
             
    }//GEN-LAST:event_btn_update2ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
            DefaultTableModel tblModel = (DefaultTableModel) tbl_khaibao.getModel();
    
        String vungdich = (String)box_vdich.getSelectedItem();
        String bieuhien = (String)box_bHien.getSelectedItem();
      
        tblModel.setValueAt(txt_ID.getText(),tbl_khaibao.getSelectedRow(), 0);
        tblModel.setValueAt(txt_name.getText(),tbl_khaibao.getSelectedRow(), 1);
        tblModel.setValueAt(vungdich,tbl_khaibao.getSelectedRow(), 2);
        tblModel.setValueAt(txt_ngaykhaibao.getText(),tbl_khaibao.getSelectedRow(), 3);
        tblModel.setValueAt(bieuhien,tbl_khaibao.getSelectedRow(), 4);
       String []data = {txt_ID.getText(), txt_name.getText(), vungdich, bieuhien,txt_ngaykhaibao.getText()};
    
        try {
            new Query_CSDL().editCSDL("thongtinkhaibao",Integer.parseInt(txt_ID.getText()),data);
        } catch (SQLException ex) {
            Logger.getLogger(nhankhau_khaibao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(tt_khaibao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tt_khaibao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tt_khaibao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tt_khaibao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tt_khaibao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_bHien;
    private javax.swing.JComboBox<String> box_vdich;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JTable tbl_khaibao;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_ngaykhaibao;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_search_name;
    // End of variables declaration//GEN-END:variables
}
