/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.Query_CSDL;
import Data.nhankhau_cly;
import Data.nhankhau_khaibao;
import Data.nhankhau_test;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ThongKe extends javax.swing.JFrame {

    /**
     * Creates new form ThongKe
     */
    private ArrayList<nhankhau_cly> list1;
     private ArrayList<nhankhau_khaibao> list2;
      private ArrayList<nhankhau_test> list3;
    DefaultTableModel model1; 
     DefaultTableModel model2; 
      DefaultTableModel model3; 
      
    public ThongKe() {
         initComponents(); 
         list1 = new Query_CSDL().doc_CSDL("thongtincachly",0);
        model1 = (DefaultTableModel) tbl_tk_cly.getModel();
           showTable(list1);
         list2 = new Query_CSDL().doc_CSDL("thongtinkhaibao",0);
        model2 = (DefaultTableModel) tbl_Tke_kbao.getModel();
           showTable1(list2);
           list3 = new Query_CSDL().doc_CSDL("thongtintestcovid",0);
        model3 = (DefaultTableModel) tbl_tk_test.getModel();
           showTable3(list3);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        btn_Tke_Test = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tke_kbao = new javax.swing.JTable();
        btn_cancel2 = new javax.swing.JButton();
        btn_update_kb = new javax.swing.JButton();
        btn_xoa_kb = new javax.swing.JButton();
        btn_TTDetail_kb = new javax.swing.JButton();
        btn_sort_kb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tk_cly = new javax.swing.JTable();
        btn_cancel1 = new javax.swing.JButton();
        btn_update_cly = new javax.swing.JButton();
        btn_xoa_cly = new javax.swing.JButton();
        btn_TTDetail_cly = new javax.swing.JButton();
        btn_sort_ID = new javax.swing.JButton();
        btn_sort_name = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_tk_test = new javax.swing.JTable();
        btn_cancel = new javax.swing.JButton();
        btn_xoa_test = new javax.swing.JButton();
        btn_TTDetail_test = new javax.swing.JButton();
        btn_Up_test = new javax.swing.JButton();
        btn_sort_Name = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btn_sortTest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_Tke_kbao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_user", "Họ và tên", "vùng dịch", "Ngày khai báo", "biểu hiện"
            }
        ));
        jScrollPane1.setViewportView(tbl_Tke_kbao);

        btn_cancel2.setText("Thoát");
        btn_cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel2ActionPerformed(evt);
            }
        });

        btn_update_kb.setText("Cập nhập");
        btn_update_kb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_kbActionPerformed(evt);
            }
        });

        btn_xoa_kb.setText("Xoá");
        btn_xoa_kb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa_kbActionPerformed(evt);
            }
        });

        btn_TTDetail_kb.setText("TT_chi tiết");
        btn_TTDetail_kb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TTDetail_kbActionPerformed(evt);
            }
        });

        btn_sort_kb.setText("Sắp xếp theo tên");
        btn_sort_kb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sort_kbActionPerformed(evt);
            }
        });

        jButton2.setText("Sắp xếp theo ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_TTDetail_kb)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sort_kb, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa_kb)
                .addGap(33, 33, 33)
                .addComponent(btn_update_kb)
                .addGap(33, 33, 33)
                .addComponent(btn_cancel2)
                .addGap(75, 75, 75))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa_kb)
                    .addComponent(btn_TTDetail_kb)
                    .addComponent(btn_update_kb)
                    .addComponent(btn_cancel2)
                    .addComponent(btn_sort_kb)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        btn_Tke_Test.addTab("Thông tin khai bao y tê ", jPanel1);

        tbl_tk_cly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_user", "Họ và tên", "nơi cách ly", "thời điểm", "Mức độ"
            }
        ));
        jScrollPane2.setViewportView(tbl_tk_cly);

        btn_cancel1.setText("Thoát");
        btn_cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel1ActionPerformed(evt);
            }
        });

        btn_update_cly.setText("Cập nhập");
        btn_update_cly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_clyActionPerformed(evt);
            }
        });

        btn_xoa_cly.setText("Xoá");
        btn_xoa_cly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa_clyActionPerformed(evt);
            }
        });

        btn_TTDetail_cly.setText("TT_chi tiết");
        btn_TTDetail_cly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TTDetail_clyActionPerformed(evt);
            }
        });

        btn_sort_ID.setText("Sắp xếp theo ID");
        btn_sort_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sort_IDActionPerformed(evt);
            }
        });

        btn_sort_name.setText("Sắp xếp theo tên");
        btn_sort_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sort_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btn_TTDetail_cly)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sort_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sort_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa_cly)
                .addGap(20, 20, 20)
                .addComponent(btn_update_cly)
                .addGap(35, 35, 35)
                .addComponent(btn_cancel1)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update_cly)
                    .addComponent(btn_xoa_cly)
                    .addComponent(btn_TTDetail_cly)
                    .addComponent(btn_sort_ID)
                    .addComponent(btn_cancel1)
                    .addComponent(btn_sort_name))
                .addGap(29, 29, 29))
        );

        btn_Tke_Test.addTab("Thông tin cách ly", jPanel2);

        tbl_tk_test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_user", "Họ và tên", "Hình thức test", "thời điểm", "Kết quả"
            }
        ));
        jScrollPane3.setViewportView(tbl_tk_test);

        btn_cancel.setText("Thoát");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_xoa_test.setText("Xoá");
        btn_xoa_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa_testActionPerformed(evt);
            }
        });

        btn_TTDetail_test.setText("TT_chi tiết");
        btn_TTDetail_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TTDetail_testActionPerformed(evt);
            }
        });

        btn_Up_test.setText("Cập nhập");
        btn_Up_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Up_testActionPerformed(evt);
            }
        });

        btn_sort_Name.setText("Sắp xếp theo tên");
        btn_sort_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sort_NameActionPerformed(evt);
            }
        });

        jButton6.setText("Sắp xếp theo ID");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Sắp xếp theo ID");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btn_sortTest.setText("Sắp xếp theo ID");
        btn_sortTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_TTDetail_test)
                .addGap(18, 18, 18)
                .addComponent(btn_sortTest)
                .addGap(18, 18, 18)
                .addComponent(btn_sort_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa_test)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Up_test)
                .addGap(38, 38, 38)
                .addComponent(btn_cancel)
                .addGap(195, 195, 195))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(342, 342, 342)
                    .addComponent(jButton6)
                    .addContainerGap(398, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(408, Short.MAX_VALUE)
                    .addComponent(jButton7)
                    .addGap(332, 332, 332)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_xoa_test)
                    .addComponent(btn_TTDetail_test)
                    .addComponent(btn_Up_test)
                    .addComponent(btn_sort_Name)
                    .addComponent(btn_sortTest))
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jButton6)
                    .addContainerGap(128, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(137, Short.MAX_VALUE)
                    .addComponent(jButton7)
                    .addGap(118, 118, 118)))
        );

        btn_Tke_Test.addTab("Thông tin test Coivid", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_Tke_Test, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_Tke_Test, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showTable(ArrayList<nhankhau_cly> list){
        for(nhankhau_cly per : list){
            model1.addRow(new Object[]{
                per.getID_user(),per.getName(),per.getNoicachly(),per.getThoidiem(), per.getMucdo()
                    
            });
        }
     }
    public void showTable1(ArrayList<nhankhau_khaibao> list){
        for(nhankhau_khaibao per : list){
            model2.addRow(new Object[]{
                per.getID_user(),per.getName(),per.getVungdich(),per.getNgaykhaibao(), per.getBieuhien()
                    
            });
        }
 }
    public void showTable3(ArrayList<nhankhau_test> list){
        for(nhankhau_test per : list){
            model3.addRow(new Object[]{
                per.getID_user(),per.getName(),per.getHinhthuc(),per.getThoidiem(), per.getKetqua()
                    
            });
        }
 }
    
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        new General().setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel1ActionPerformed
        // TODO add your handling code here:
          new General().setVisible(true);
    }//GEN-LAST:event_btn_cancel1ActionPerformed

    private void btn_cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel2ActionPerformed
        // TODO add your handling code here:
          new General().setVisible(true);
    }//GEN-LAST:event_btn_cancel2ActionPerformed

    private void btn_update_clyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_clyActionPerformed
        // TODO add your handling code here:
            DefaultTableModel tblModel = (DefaultTableModel) tbl_tk_cly.getModel();
           nhankhau_cly per  = new nhankhau_cly();
           String ID=null,date;
           
        ID = tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 0).toString();
         per.setName(tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 1).toString());
        date = tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 3).toString();
        per.setNoicachly(tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 2).toString());
        per.setMucdo(tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 4).toString());
          
          String []data = {ID, per.getName(), per.getNoicachly(), date,per.getMucdo()};
         try {
            new Query_CSDL().editCSDL("thongtincachly",Integer.parseInt(ID),data);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_update_clyActionPerformed

    private void btn_update_kbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_kbActionPerformed
        // TODO add your handling code here:
            DefaultTableModel tblModel = (DefaultTableModel) tbl_Tke_kbao.getModel();
           nhankhau_khaibao per  = new nhankhau_khaibao();
           String ID=null,date;
           
        ID = tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 0).toString();
         per.setName(tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 1).toString());
        date = tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 3).toString();
        per.setVungdich(tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 2).toString());
        per.setBieuhien(tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 4).toString());
          
           String []data = {ID, per.getName(), per.getVungdich(), per.getBieuhien(),date};
         try {
            new Query_CSDL().editCSDL("thongtinkhaibao",Integer.parseInt(ID),data);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_update_kbActionPerformed

    private void btn_xoa_kbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa_kbActionPerformed
        // TODO add your handling code here:
              DefaultTableModel tblModel = (DefaultTableModel) tbl_Tke_kbao.getModel();
        int ID_user=0;
        if(tbl_Tke_kbao.getSelectedRowCount()==1){
            ID_user = (int)tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 0);
            try {
               if(JOptionPane.showConfirmDialog(null, "Delete this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                   tblModel.removeRow(tbl_Tke_kbao.getSelectedRow());
                     new Query_CSDL().xoaCSDL("thongtinkhaibao",ID_user);
               }
              
            } catch (SQLException ex) {
                Logger.getLogger(tt_cly.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
        else{
            if(tbl_Tke_kbao.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn để xoá  ");

            }
        }
    }//GEN-LAST:event_btn_xoa_kbActionPerformed

    private void btn_xoa_clyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa_clyActionPerformed
        // TODO add your handling code here:
               DefaultTableModel tblModel = (DefaultTableModel) tbl_tk_cly.getModel();
        int ID_user=0;
        if(tbl_tk_cly.getSelectedRowCount()==1){
            ID_user = (int)tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 0);
            try {
                  if(JOptionPane.showConfirmDialog(null, "Delete this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               tblModel.removeRow(tbl_tk_cly.getSelectedRow());
                new Query_CSDL().xoaCSDL("thongtincachly",ID_user);
                  }
            } catch (SQLException ex) {
                Logger.getLogger(tt_cly.class.getName()).log(Level.SEVERE, null, ex);
            }
         
           
        }
        else{
            if(tbl_tk_cly.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn để xoá  ");

            }
        }
    }//GEN-LAST:event_btn_xoa_clyActionPerformed

    private void btn_xoa_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa_testActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tblModel = (DefaultTableModel) tbl_tk_test.getModel();
        int ID_user=0;
        if(tbl_tk_test.getSelectedRowCount()==1){
            ID_user = (int)tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 0);
            try {
                 if(JOptionPane.showConfirmDialog(null, "Delete this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
              new Query_CSDL().xoaCSDL("thongtintestcovid",ID_user);
                 tblModel.removeRow(tbl_tk_test.getSelectedRow());
            }
      
               
            } catch (SQLException ex) {
                Logger.getLogger(tt_testCovid.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
        }
        else{
            if(tbl_tk_test.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn để xoá  ");

            }
        }
    }//GEN-LAST:event_btn_xoa_testActionPerformed

   
  
    private void btn_Up_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Up_testActionPerformed
        // TODO add your handling code here:
           DefaultTableModel tblModel = (DefaultTableModel) tbl_tk_test.getModel();
           nhankhau_test per  = new nhankhau_test();
           String ID=null,date;
           
        ID = tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 0).toString();
         per.setName(tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 1).toString());
        date = tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 3).toString();
        per.setHinhthuc(tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 2).toString());
        per.setKetqua(tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 4).toString());
          
         System.out.println(ID+ per.getName()+ per.getHinhthuc()+date + per.getKetqua());
       String []data = {ID, per.getName(), per.getHinhthuc(), date,per.getKetqua()};
         try {
            new Query_CSDL().editCSDL("thongtintestcovid",Integer.parseInt(ID),data);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_Up_testActionPerformed

    private void btn_TTDetail_kbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TTDetail_kbActionPerformed
        // TODO add your handling code here:
         if(tbl_Tke_kbao.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
         if(tbl_Tke_kbao.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn   ");

            }
           String ID=null,date;
           DefaultTableModel tblModel = (DefaultTableModel) tbl_Tke_kbao.getModel();  
           ID = tblModel.getValueAt(tbl_Tke_kbao.getSelectedRow(), 0).toString();
           System.out.println(ID);
         new tt_chitiet(ID).setVisible(true);
        
    }//GEN-LAST:event_btn_TTDetail_kbActionPerformed

    private void btn_TTDetail_clyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TTDetail_clyActionPerformed
        // TODO add your handling code here:
         if(tbl_tk_cly.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");

            }
            else{
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn   ");

            }
          String ID;
           DefaultTableModel tblModel = (DefaultTableModel) tbl_tk_cly.getModel();  
           ID = tblModel.getValueAt(tbl_tk_cly.getSelectedRow(), 0).toString();
           System.out.println(ID);
         new tt_chitiet(ID).setVisible(true);
        
    }//GEN-LAST:event_btn_TTDetail_clyActionPerformed

    private void btn_TTDetail_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TTDetail_testActionPerformed
        // TODO add your handling code here:\
         if(tbl_tk_test.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "bảng rỗng ");
            }
         if(tbl_tk_test.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(this, "làm ơn chọn một hàng đơn  ");

            }
          String ID;
           DefaultTableModel tblModel = (DefaultTableModel) tbl_tk_test.getModel();  
           ID = tblModel.getValueAt(tbl_tk_test.getSelectedRow(), 0).toString();
           System.out.println("gia tri :"+ID);
         new tt_chitiet(ID).setVisible(true);
    }//GEN-LAST:event_btn_TTDetail_testActionPerformed
    public void fillTable(ArrayList<nhankhau_khaibao> a){
        model2.setRowCount(0);
        list2= new  Query_CSDL().doc_CSDL("thongtinkhaibao", 0);
        for(nhankhau_khaibao per : a){
            model2.addRow(new String[]{String.valueOf(per.getID_user()), per.getName(),per.getVungdich(),
                String.valueOf(per.getNgaykhaibao()),per.getBieuhien()});
        }
        model2.fireTableDataChanged();
    }
    private void btn_sort_kbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sort_kbActionPerformed
        // TODO add your handling code here:
        ArrayList<nhankhau_khaibao> a = null;
       
        a = new Query_CSDL().doc_CSDL("thongtinkhaibao", 0);
        Collections.sort(a, new Comparator<nhankhau_khaibao>() {
            @Override
            public int compare(nhankhau_khaibao o1, nhankhau_khaibao o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        fillTable(a);
    
    }//GEN-LAST:event_btn_sort_kbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         ArrayList<nhankhau_khaibao> list = null;
       
        list = new Query_CSDL().doc_CSDL("thongtinkhaibao", 0);
    
              Collections.sort(list, (a, b)-> ( a.getID_user() - b.getID_user() ));
        fillTable(list);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_sort_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sort_IDActionPerformed
        // TODO add your handling code here:
           ArrayList<nhankhau_cly> list = null;
       
        list = new Query_CSDL().doc_CSDL("thongtincachly", 0);
    
              Collections.sort(list, (a, b)-> ( a.getID_user() - b.getID_user() ));
        fillTable1(list);
    }//GEN-LAST:event_btn_sort_IDActionPerformed

    private void btn_sort_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sort_nameActionPerformed
        // TODO add your handling code here:
            ArrayList<nhankhau_cly> a = null;
       
        a = new Query_CSDL().doc_CSDL("thongtincachly", 0);
        Collections.sort(a, new Comparator<nhankhau_cly>() {
            @Override
            public int compare(nhankhau_cly o1, nhankhau_cly o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        fillTable1(a);
        
    }//GEN-LAST:event_btn_sort_nameActionPerformed

    private void btn_sort_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sort_NameActionPerformed
        // TODO add your handling code here:
         ArrayList<nhankhau_test> a = null;
       
        a = new Query_CSDL().doc_CSDL("thongtintestcovid", 0);
        Collections.sort(a, new Comparator<nhankhau_test>() {
            @Override
            public int compare(nhankhau_test o1, nhankhau_test o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        fillTable3(a);
    }//GEN-LAST:event_btn_sort_NameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
 public void fillTable1(ArrayList<nhankhau_cly> a){
        model1.setRowCount(0);
        list1= new  Query_CSDL().doc_CSDL("thongtincachly", 0);
        for(nhankhau_cly per : a){
            model1.addRow(new String[]{String.valueOf(per.getID_user()), per.getName(),per.getNoicachly(),
                String.valueOf(per.getThoidiem()),per.getMucdo()});
        }
        model1.fireTableDataChanged();
    }
  public void fillTable3(ArrayList<nhankhau_test> a){
        model3.setRowCount(0);
        list3= new  Query_CSDL().doc_CSDL("thongtinkhaibao", 0);
        for(nhankhau_test per : a){
            model3.addRow(new String[]{String.valueOf(per.getID_user()), per.getName(),per.getHinhthuc(),
                String.valueOf(per.getThoidiem()),per.getKetqua()});
        }
        model3.fireTableDataChanged();
    }
    private void btn_sortTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortTestActionPerformed
        // TODO add your handling code here:
       
          ArrayList<nhankhau_test> list = null;
       
        list = new Query_CSDL().doc_CSDL("thongtintest", 0);
    
              Collections.sort(list, (a, b)-> ( a.getID_user() - b.getID_user() ));
        fillTable3(list);
       
        
    }//GEN-LAST:event_btn_sortTestActionPerformed

    
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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TTDetail_cly;
    private javax.swing.JButton btn_TTDetail_kb;
    private javax.swing.JButton btn_TTDetail_test;
    private javax.swing.JTabbedPane btn_Tke_Test;
    private javax.swing.JButton btn_Up_test;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_cancel1;
    private javax.swing.JButton btn_cancel2;
    private javax.swing.JButton btn_sortTest;
    private javax.swing.JButton btn_sort_ID;
    private javax.swing.JButton btn_sort_Name;
    private javax.swing.JButton btn_sort_kb;
    private javax.swing.JButton btn_sort_name;
    private javax.swing.JButton btn_update_cly;
    private javax.swing.JButton btn_update_kb;
    private javax.swing.JButton btn_xoa_cly;
    private javax.swing.JButton btn_xoa_kb;
    private javax.swing.JButton btn_xoa_test;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable tbl_Tke_kbao;
    private javax.swing.JTable tbl_tk_cly;
    private javax.swing.JTable tbl_tk_test;
    // End of variables declaration//GEN-END:variables
}
