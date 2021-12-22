/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Hospital;

import Business.Components.Address;
import Business.Organization.User;
import java.util.Date;

/**
 *
 * @author Mayur
 */
public class Nurse extends User {
    
    private String hospname;
    
    
    
    public Nurse(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob,String hospname) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.hospname = hospname;

    }

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }
    
}
