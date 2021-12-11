/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Logistics;

import Business.Organization.User;
import java.util.Date;

/**
 *
 * @author Mayur
 */
public class Handler extends User {
    
    private String vehicleName;
    private String vehicleNum;
    
    public Handler(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob,String vehicleName,String vehicleNum) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.vehicleName = vehicleName;
        this.vehicleNum = vehicleNum;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }
    
    
    
    
}
