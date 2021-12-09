/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EcoSystem;

import Business.Directories.EnterpriseDirectories.HospitalDirectory;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Hospital;

/**
 *
 * @author harshaljaiswal
 */
public class EcoSystem {
    private HospitalDirectory hospitaldirectory ;
    
    public EcoSystem() {
        hospitaldirectory = new HospitalDirectory();
    }

    public HospitalDirectory getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(HospitalDirectory hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }

    public void addHospital(Hospital hosp) {
        System.out.println("addHospital() in ecosystem: "+hosp.getEnterpriseName());
        hospitaldirectory.addHospital(hosp);
    }

    public void addDoctor(Doctor doctor, String hospitalName) {
        
        for(Hospital hosp :hospitaldirectory.getHospitalList()){
            if(hosp.getEnterpriseName() == hospitalName){
                hosp.addDoctor(doctor);
                System.out.println("addDoctor() "+ hosp.getDoctordirectory().get(0).getName());
                return;
            }
            
        }
    }
}
