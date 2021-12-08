/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Hospital;

import Business.Components.Address;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author harshaljaiswal
 */
public class Hospital extends Enterprise {

    private ArrayList<Doctor> doctordirectory;
    private ArrayList<Nurse> nursedirectory;
    private ArrayList<Patient> patientdirectory;

    public Hospital(String enterpriseName, String registeryNumber, String address, String username, String password) {
        super(enterpriseName, registeryNumber, address, username, password);

        this.doctordirectory = new ArrayList();
        this.nursedirectory = new ArrayList();
        this.patientdirectory = new ArrayList();

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
        doctordirectory.add(doc);
    }

    public void addNurse(Nurse nur) {
        nursedirectory.add(nur);
    }

    public void addPatient(Patient pat) {
        patientdirectory.add(pat);
    }
}
