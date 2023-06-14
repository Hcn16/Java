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
public class nhankhau_cly extends nhankhau{
    String noicachly, mucdo;
    Date thoidiem;
    
    public String getNoicachly() {
        
        return noicachly;
    }

    public void setNoicachly(String noicachly) {
        this.noicachly = noicachly;
    }

    public Date getThoidiem() {
        return thoidiem;
    }

    public void setThoidiem(Date thoidiem) {
        this.thoidiem = thoidiem;
    }

    public String getMucdo() {
        return mucdo;
    }

    public void setMucdo(String mucdo) {
        this.mucdo = mucdo;
    }
   
}
