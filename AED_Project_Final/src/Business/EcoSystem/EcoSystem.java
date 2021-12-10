/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EcoSystem;

import Business.Directories.EnterpriseDirectories.HospitalDirectory;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Hospital;
import Business.Enterprise.Hospital.Nurse;
import Business.Enterprise.Hospital.Patient;
import java.util.ArrayList;

/**
 *
 * @author harshaljaiswal
 */
public class EcoSystem {
    private static EcoSystem business;
    private HospitalDirectory hospitaldirectory ;
    private ArrayList<Doctor> doctordirectory;
    private ArrayList<Nurse> nursedirectory;
    private ArrayList<Patient> patientdirectory;


    public EcoSystem() {
        hospitaldirectory = new HospitalDirectory();
        this.doctordirectory = new ArrayList();
        this.nursedirectory = new ArrayList();
        this.patientdirectory = new ArrayList();
    }
    
      public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
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

    public ArrayList<Doctor> getDoctordirectory() {
        return doctordirectory;
    }

    public void setDoctordirectory(ArrayList<Doctor> doctordirectory) {
        this.doctordirectory = doctordirectory;
    }

    public ArrayList<Nurse> getNursedirectory() {
        return nursedirectory;
    }

    public void setNursedirectory(ArrayList<Nurse> nursedirectory) {
        this.nursedirectory = nursedirectory;
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    

    public void addDoctor(Doctor doc) {
        try{
        doctordirectory.add(doc);
        }
        catch(Exception e){
            this.doctordirectory = new ArrayList();
            doctordirectory.add(doc);
            e.printStackTrace();
        }
    }

    public void addNurse(Nurse nur) {
        try{
        nursedirectory.add(nur);
        }
        catch(Exception e){
            this.nursedirectory = new ArrayList();
            nursedirectory.add(nur);
            e.printStackTrace();
        }
    }

    public void addPatient(Patient pat) {
        try{
        patientdirectory.add(pat);
        }
        catch(Exception e){
            this.patientdirectory = new ArrayList();
            patientdirectory.add(pat);
            e.printStackTrace();
        }
    }
}
