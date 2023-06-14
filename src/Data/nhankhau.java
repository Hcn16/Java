/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class nhankhau {
    private String SoHGD,name,gioitinh, CMT, addr; 
    Date ngaysinh;
    int ID_user;
    
    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }


   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getID_user() {
        return ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
    }

 

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSoHGD() {
        return SoHGD;
    }

    public void setSoHGD(String SoHGD) {
        this.SoHGD = SoHGD;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private int age;
    
}
