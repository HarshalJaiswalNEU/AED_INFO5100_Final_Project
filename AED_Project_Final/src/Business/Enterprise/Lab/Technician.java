/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Lab;

import Business.Organization.User;
import java.util.Date;

/**
 *
 * @author Mayur
 */
public class Technician extends User {
    
    private String labname;
    
    public Technician(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob,String labname) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.labname = labname;
    }

    public String getLabname() {
        return labname;
    }

    public void setLabname(String labname) {
        this.labname = labname;
    }
    
    
}
