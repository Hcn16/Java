
package Controller;

import Data.nhankhau;
import Data.nhankhau_cly;
import Data.nhankhau_khaibao;
import Data.nhankhau_test;
import java.awt.HeadlessException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.General;
import view.login;


public class Query_CSDL {
    //Kết nối tơi CSDL;
    private Connection conn;
    public void Connect(){
        String url = "jdbc:mysql://localhost:3306/project_cnpm";
        var user = "root";
        var password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("ket noi thanh cong");
        } catch (SQLException e) {
        }
      
    }
    
    ////////
    // login he thong
    public boolean login(String user , String pass) throws SQLException{
            
	
        Connect();
	////Xử lí ngoại lệ khi đầu vào là rỗng
            StringBuilder sb = new StringBuilder();
            
            if(user.equals("")){
                sb.append("userName not emtpy\n");               
            }

            if(pass.equals("")){
                sb.append("password not emtpy");               
            }

            if(sb.length() > 0){
                JOptionPane.showMessageDialog(null, sb.toString(), "Invalidation",
                        JOptionPane.ERROR_MESSAGE);
            }
          
            
              
	///Lấy dữ liệu từ CSDL 
            String sql = "SELECT ID_user,username, password FROM login";
            Statement pst = conn.createStatement();
            
             ResultSet rs = pst.executeQuery(sql);
              ArrayList <String>list = new ArrayList<>();
              ArrayList <String>list2 = new ArrayList<>();
              ArrayList <Integer>list3 = new ArrayList<>();
              
              String name,password;
              int id;
             

       
        try {
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
                
                name= (rs.getString("username"));   
                password= (rs.getString("password"));
                id= Integer.parseInt(rs.getString("ID_user"));
                list.add(name);
                list2.add(password);   
                list3.add(id);
                }           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        int check=0;
         for(int i=0 ; i<list.size();i++){
             if(list.get(i).equals(user)){
                 if(list2.get(i).equals(pass)){        
                 JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                General in = new General();
                in.setVisible(true);
                new login().setVisible(false);
                check=1;
                return true;
                
             }
             }
           
             
         }
            if(check == 0){
            JOptionPane.showMessageDialog(null, "Đăng nhập không thành công");
            
            }
           
            
            conn.close();
            return false;
        }

    
  
    // doc CSDL theo ID 
    public ArrayList doc_CSDL(String table,int ID){
        Connect();
        ArrayList list;
    try {
        String sql = "SELECT *FROM";

        sql += " " + table;
         
        // Nếu chọn bảng nhân khẩu 
        if(table.equals("nhankhau") && ID ==0){
          list = new ArrayList<nhankhau>();
     
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
                nhankhau per = new nhankhau();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setGioitinh(rs.getString("gioitinh"));
                per.setNgaysinh(rs.getDate("ngaysinh"));   
                per.setCMT(rs.getString("CMT"));
                per.setAddr(rs.getString("addr"));
                list.add(per);
            } 
                  return list;
        }
        
        // Nếu chọn bảng nhân khẩu cách ly
        if(table.equals("thongtincachly") && ID ==0){
          list = new ArrayList<nhankhau_cly>();
     
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
                nhankhau_cly per = new nhankhau_cly();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setMucdo(rs.getString("mucdo"));
                per.setNoicachly(rs.getString("noicachly"));
                per.setThoidiem(rs.getDate("thoidiem"));
                list.add(per);
            } 
                  return list;
        }
        
          // Nếu chọn bảng nhân khẩu khai báo
        if(table.equals("thongtinkhaibao") && ID ==0){
          list = new ArrayList<nhankhau_khaibao>();
     
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
                nhankhau_khaibao per = new nhankhau_khaibao();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
               per.setBieuhien(rs.getString("bieuhien"));
               per.setNgaykhaibao(rs.getDate("ngaykhaibao"));
               
              per.setVungdich(rs.getString("vungdich"));
                list.add(per);
            } 
                  return list;
        }
        
          // Nếu chọn bảng nhân khẩu thông tin test Covid
        if(table.equals("thongtintestcovid") && ID ==0){
          
          list = new ArrayList<nhankhau_test>();
     
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
                nhankhau_test per = new nhankhau_test();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setHinhthuc(rs.getString("hinhthuc"));
                per.setThoidiem(rs.getDate("thoidiem"));
                per.setKetqua(rs.getString("ketqua"));
                list.add(per);
            } 
                  return list;
        }
        
        System.out.println(sql);
          // Nếu chọn bảng co dieu kien
        if(table.equals("nhankhau") || table.equals("thongtincachly") || 
                table.equals("thongtintestcovid") || table.equals("thongtinkhaibao") && ID !=0 ){
  
          
            
            sql += " where ID_user ="+ID;
            System.out.println(sql);
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
            if(table == "nhankhau"){
                 list = new ArrayList<nhankhau>();
                while (rs.next()){
                nhankhau per = new nhankhau();
                per.setID_user(rs.getInt("ID_user"));
                per.setSoHGD(rs.getString("soHGD"));
                per.setName(rs.getString("name"));
                per.setGioitinh(rs.getString("gioitinh"));
                per.setNgaysinh(rs.getDate("ngaysinh"));   
                per.setCMT(rs.getString("CMT"));
                per.setAddr(rs.getString("addr"));
                list.add(per);
                return list;
                }
            }
            else if(table == "thongtintestcovid"){
                  list = new ArrayList<nhankhau_test>();
                   
                while (rs.next()){
                nhankhau_test per = new nhankhau_test();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setHinhthuc(rs.getString("hinhthuc"));
                per.setThoidiem(rs.getDate("thoidiem"));
                per.setKetqua(rs.getString("ketqua"));
                list.add(per);
            } 
                 return list;
            } 
            
            else if(table == "thongtincachly"){
                list = new ArrayList<nhankhau_cly>();                             
                while (rs.next()){
                nhankhau_cly per = new nhankhau_cly();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setMucdo(rs.getString("mucdo"));
                per.setNoicachly(rs.getString("noicachly"));
                per.setThoidiem(rs.getDate("thoidiem"));
                list.add(per);
            } 
                  return list;
        }
            
            else if (table == "thongtinkahibao"){
                  list = new ArrayList<nhankhau_test>();
                   
                while (rs.next()){
                nhankhau_test per = new nhankhau_test();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setHinhthuc(rs.getString("hinhthuc"));
                per.setThoidiem(rs.getDate("thoidiem"));
                per.setKetqua(rs.getString("ketqua"));
                list.add(per);
            } 
                  return list;
                  }
                 
        }
        
        
        
    } catch (SQLException e) {
        
    }
        return null;
  
    }
    
    // doc CSDL theo name
     public ArrayList doc_CSDL_name(String table1,String name1){
        Connect();
        ArrayList list;
    try {
        String sql = "SELECT * FROM ";

        sql += " " + table1;
           if(table1.equals("nhankhau") || table1.equals("thongtincachly") || 
                table1.equals("thongtintestcovid") || table1.equals("thongtinkhaibao") && name1 != null ){
  
          
            
            sql += " WHERE name = '" + name1 + "'";
            
             //tạo đối tượng thực thi câu lệnh
            Statement ps1 = conn.createStatement();
           
            ResultSet rs = ps1.executeQuery(sql);
           
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
            if(table1 == "nhankhau" && name1 !=null){
                 list = new ArrayList<nhankhau>();
                while (rs.next()){
                nhankhau per = new nhankhau();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setGioitinh(rs.getString("gioitinh"));
                per.setNgaysinh(rs.getDate("ngaysinh"));   
                per.setCMT(rs.getString("CMT"));
                per.setAddr(rs.getString("addr"));
                list.add(per);
                return list;
                }
            }
            else if(table1 == "thongtintestcovid"){
                  list = new ArrayList<nhankhau_test>();
                   
                while (rs.next()){
                nhankhau_test per = new nhankhau_test();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setHinhthuc(rs.getString("hinhthuc"));
                per.setThoidiem(rs.getDate("thoidiem"));
                per.setKetqua(rs.getString("ketqua"));
                list.add(per);
            } 
                 return list;
            } 
               
            else if(table1.equals("thongtincachly") && name1 !=null){
                list = new ArrayList<nhankhau_cly>();                             
                while (rs.next()){
                nhankhau_cly per = new nhankhau_cly();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));              
                per.setNoicachly(rs.getString("noicachly"));
                per.setThoidiem(rs.getDate("thoidiem"));
                per.setMucdo(rs.getString("mucdo"));
                list.add(per);
                } 
                  return list;
        }
            
            else if (table1 == "thongtinkhaibao"){
                  list = new ArrayList<nhankhau_khaibao>();
                   
                while (rs.next()){
                nhankhau_khaibao per = new nhankhau_khaibao();
                per.setID_user(rs.getInt("ID_user"));
                per.setName(rs.getString("name"));
                per.setBieuhien(rs.getString("bieuhien"));
                per.setVungdich(rs.getString("vungdich"));
                per.setNgaykhaibao(rs.getDate("ngaykhaibao"));
            
                list.add(per);
            } 
                  return list;
                  }
                 
        }
        
        
        
    } catch (SQLException e) {
        
    }
        return null;
  
    }

        
    
    //phần INSERT vào CSDL
    
    public boolean addCSDL(String table, String []data) throws SQLException {
        //ghi data vao CSDL
        Connect();
       //  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_cnpm", "root", "");
        
     
        try {
            
            String sql = "INSERT INTO ";
            sql += " " + table;
            
            
              if("nhankhau".equals(table)){
                sql += "(ID_user,soHGD,name, gioitinh , ngaysinh, CMT,addr) "
                            + "VALUES (?,?,?,?,?,?,?)";
            //tạo doi tượng thực thi câu lệnh
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, data[0]);
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);                 
            ps.setString(4, data[3]);
            ps.setDate(5, Date.valueOf(data[4]));
            ps.setString(6, data[5]);
            ps.setString(7, data[6]);
            ps.executeUpdate();
               
            return true;
            }
            if("thongtincachly".equals(table)){
                sql += "(ID_user,name, noicachly, thoidiem, mucdo) "
                            + "VALUES (?,?,?,?,?)";
            //tạo doi tượng thực thi câu lệnh
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, data[0]);
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);        
            ps.setDate(4, Date.valueOf(data[3]));
            ps.setString(5, data[4]);
            ps.executeUpdate();
               
            return true;
            }
            
            if("login".equals(table)){
                sql += " (ID_user, username, password) "
                            + " VALUES (?,?,?)";
                 //tạo doi tượng thực thi câu lệnh
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, data[0]);
            ps.setString(2, data[1]);     
            ps.setInt(3, Integer.parseInt(data[2]));        
            
            
            ps.executeUpdate();
                return true;
            
            }
            //thong tin khai bao        
            if("thongtinkhaibao".equals(table)){
                sql += "(ID_user,name,vungdich, bieuhien, ngaykhaibao) "
                            + "VALUES (?,?,?,?,?)";
            //tạo doi tượng thực thi câu lệnh
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, data[0]);
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);        
            
            ps.setString(4, data[3]);
            ps.setDate(5, Date.valueOf(data[4]));
            ps.executeUpdate();
             System.out.println("thnh cong");
            return true;
            }
            
            //thong tin test
            if("thongtintestcovid".equals(table)){
                sql += "(ID_user,name, hinhthuc, thoidiem, ketqua) "
                            + "VALUES (?,?,?,?,?)";
            //tạo doi tượng thực thi câu lệnh
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, data[0]);
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]); 
            try{
            ps.setDate(4, Date.valueOf(data[3]));
            }
            catch(SQLException ev){
                    JOptionPane.showMessageDialog(null, "Nhập sai đinh dạng ngày tháng");
                    }
            ps.setString(5, data[4]);
            ps.executeUpdate();
            return true;
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
        }    
        return false;
        
    }
    
    //phần DELETE trong CSDL
    public void xoaCSDL(String table,int ID) throws SQLException {
        //xoa data vao CSDL
       Connect();
        String sql = "DELETE  FROM";
       if( table == "thongtintestcovid"){
       
        sql += " " + table+" WHERE ID_user =?";
        try {
        PreparedStatement ps = conn.prepareStatement(sql);
        
       ps.setInt(1,ID);
      ps.executeUpdate();
      
       }catch(Exception e){
           e.printStackTrace();
       }
       }
       
       if( table == "thongtinkhaibao"){
       
         sql += " " + table+" WHERE ID_user =?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);        
            ps.setInt(1,ID);
             ps.executeUpdate();
       
      
       }catch(Exception e){
           e.printStackTrace();
       }
    }
        
        //thong tin cach ly 
          if( table == "thongtincachly"){
         sql += " " + table+" WHERE ID_user =?";
        try {
        PreparedStatement ps = conn.prepareStatement(sql);
        
       ps.setInt(1,ID);
             ps.executeUpdate();
       
      
       }catch(Exception e){
           e.printStackTrace();
       }
        
    }
    }
    
    //phần EDIT trong CSDL_Cly
    public void editCSDL(String table,int t, String  []data) throws SQLException {
        //xoa data vao CSDL
      
        Connect();
            String sql = "UPDATE ";
            sql += " " + table+" set";
            
        if("thongtintestcovid".equals(table)){
           
        try {

            String sql1 = " ID_user =?, name = ?, hinhthuc =?, thoidiem =?, ketqua =?" + " where ID_user ="+t ;
              sql += sql1 ;
              System.out.println(sql);
            PreparedStatement ps = conn.prepareStatement(sql);         
            ps.setInt(1, t);       
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);
            ps.setDate(4, Date.valueOf(data[3]));
            ps.setString(5, data[4]);
          
            
        if(JOptionPane.showConfirmDialog(null, "Save this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             ps.executeUpdate();
            }
      
        }catch(Exception e){
           e.printStackTrace();
       }
        
        
    }
        
        if(table == "thongtinkhaibao"){
                   
        try {

            String sql1 = " ID_user =?, name = ?, vungdich =? , bieuhien =?, ngaykhaibao =?"
                    + " where ID_user ="+t;
            sql += sql1;
            PreparedStatement ps = conn.prepareStatement(sql);         
            ps.setInt(1, t); 
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);            
            ps.setString(4, data[3]);
            ps.setDate(5, Date.valueOf(data[4]));
          
            
       if(JOptionPane.showConfirmDialog(null, "Save this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
           System.out.println("đã update thành công");
             ps.executeUpdate();
       }
      
       }catch(Exception e){
           e.printStackTrace();
       }
        
        
    }
           if(table == "login"){
               
        try {

            String sql1 = " ID_user =?, username = ?, password =?"
                    + " where ID_user ="+t;
            sql += sql1;
            PreparedStatement ps = conn.prepareStatement(sql);         
            ps.setInt(1, Integer.parseInt(data[0]));
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);            
         
            
       if(JOptionPane.showConfirmDialog(null, "Xác nhân thay đôi MK ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             ps.executeUpdate();
       }
      
       }catch(Exception e){
           e.printStackTrace();
       }
           }
        
        
         if(table == "thongtincachly"){
               
        try {

            String sql1 = " ID_user =?, name = ?, noicachly=? , thoidiem =?, mucdo =?"
                    + " where ID_user ="+t;
            sql += sql1;
            PreparedStatement ps = conn.prepareStatement(sql);         
            ps.setInt(1, Integer.parseInt(data[0]));
            ps.setString(2, data[1]);     
            ps.setString(3, data[2]);            
            ps.setString(5, data[4]);
            ps.setDate(4, Date.valueOf(data[3]));
          
            
       if(JOptionPane.showConfirmDialog(null, "Save this person ?","Confirm",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
             ps.executeUpdate();
       }
      
       }catch(Exception e){
           e.printStackTrace();
       }
        
        
    }
}

    //phần DELECTED trong CSDL
    public boolean timkiem(String table,int ID) throws SQLException  {
        //doc data vao CSDL
            Connect();
        ArrayList <Integer>list = new ArrayList<>();
           String sql = "SELECT ID_user FROM ";
       sql += table;
        int t=0;
        try {
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
               
                t = (rs.getInt("ID_user"));  
                list.add(t);
                }          
        } catch (Exception e) {
            e.printStackTrace();
        }
         for(int search : list){
             if(search == ID){
                 JOptionPane.showMessageDialog(null, "tim thay ");
                 return true;
             }
         }
           JOptionPane.showMessageDialog(null, "khong tim thay ");
              
        return false;
    }

 //phần DELECTED trong CSDL
    public boolean timkiem_name(String table,String name) throws SQLException  {
        //doc data vao CSDL
             Connect();
             
        // chuẩn hoá chuỗi name
        name = name.trim();
        System.out.println(name);
        while (name.indexOf("  ") != -1) name = name.replaceAll("  "," ");
          System.out.println(name);
      
        ArrayList <String>list = new ArrayList<>();
           String sql = "SELECT name FROM ";
       sql += table;
        String name1=null;
        try {
            //tạo đối tượng thực thi câu lệnh
            Statement ps = conn.createStatement();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.isBeforeFirst() == false){
                JOptionPane.showMessageDialog(null, "khong co gi trong bảng");       
            }
                while (rs.next()){
               
                name1 = (rs.getString("name"));  
                list.add(name1);
                }          
        } catch (Exception e) {
            e.printStackTrace();
        }
         for(String search : list){
             if(search.equals(name)){
                 System.out.println(search +"\n");
                 JOptionPane.showMessageDialog(null, "tim thay ");
                
                 return true;
                 
             }
         }
           JOptionPane.showMessageDialog(null, "khong tim thay ");
          
        return false;
    }

}
