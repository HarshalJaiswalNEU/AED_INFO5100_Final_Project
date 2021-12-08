/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EcoSystem;

import Business.Directories.EnterpriseDirectories.HospitalDirectory;

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
    
}
