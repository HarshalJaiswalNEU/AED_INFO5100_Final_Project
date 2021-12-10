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
public class Doctor extends User {

private String speciality;

    public Doctor(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob, String speciality) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    
}
