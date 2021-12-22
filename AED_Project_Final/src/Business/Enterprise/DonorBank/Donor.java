/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.DonorBank;

import Business.Organization.User;
import java.util.Date;

/**
 *
 * @author Mayur
 */
public class Donor extends User {

    private String dbname;
    public Donor(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob,String dbname) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.dbname = dbname;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    
}
