/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EcoSystem;

import Business.Directories.EnterpriseDirectories.HospitalDirectory;
import Business.Enterprise.DonorBank.Donor;
import Business.Enterprise.DonorBank.DonorBank;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Hospital;
import Business.Enterprise.Hospital.Nurse;
import Business.Enterprise.Hospital.Patient;
import Business.Enterprise.Lab.Technician;
import Business.Enterprise.Logistics.Handler;
import Business.Enterprise.Logistics.Vehicle;
import Business.Organization.DonateEntity;
import Business.Organization.User;
import java.util.ArrayList;

/**
 *
 * @author harshaljaiswal
 */
public class EcoSystem {

    private static EcoSystem business;
    private HospitalDirectory hospitaldirectory;
    private ArrayList<Doctor> doctordirectory;
    private ArrayList<Donor> donordirectory;
    private ArrayList<DonorBank> donorbankdirectory;
    private ArrayList<Nurse> nursedirectory;
    private ArrayList<Patient> patientdirectory;
    private ArrayList<DonateEntity> donateEntityList;
    private ArrayList<Handler> handlerdirectory;
    private ArrayList<Vehicle> vehicledirectory;
    private ArrayList<Technician> techdirectory;

    public EcoSystem() {
        hospitaldirectory = new HospitalDirectory();
        this.doctordirectory = new ArrayList();
        this.nursedirectory = new ArrayList();
        this.patientdirectory = new ArrayList();
        this.donateEntityList = new ArrayList();
        this.handlerdirectory = new ArrayList();
        this.vehicledirectory = new ArrayList();
        this.techdirectory = new ArrayList();
        this.donordirectory = new ArrayList();
        this.donorbankdirectory = new ArrayList();
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
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
        System.out.println("addHospital() in ecosystem: " + hosp.getEnterpriseName());
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

    public ArrayList<Handler> getHandlerdirectory() {
        return handlerdirectory;
    }

    public void setHandlerdirectory(ArrayList<Handler> handlerdirectory) {
        this.handlerdirectory = handlerdirectory;
    }

    public ArrayList<Vehicle> getVehicledirectory() {
        return vehicledirectory;
    }

    public void setVehicledirectory(ArrayList<Vehicle> vehicledirectory) {
        this.vehicledirectory = vehicledirectory;
    }

    public ArrayList<Technician> getTechdirectory() {
        return techdirectory;
    }

    public void setTechdirectory(ArrayList<Technician> techdirectory) {
        this.techdirectory = techdirectory;
    }

    public void addDoctor(Doctor doc) {
        try {
            doctordirectory.add(doc);
        } catch (Exception e) {
            this.doctordirectory = new ArrayList();
            doctordirectory.add(doc);
            e.printStackTrace();
        }
    }

    public void addNurse(Nurse nur) {
        try {
            nursedirectory.add(nur);
        } catch (Exception e) {
            this.nursedirectory = new ArrayList();
            nursedirectory.add(nur);
            e.printStackTrace();
        }
    }

    public void addPatient(Patient pat) {
        try {
            patientdirectory.add(pat);
        } catch (Exception e) {
            this.patientdirectory = new ArrayList();
            patientdirectory.add(pat);
            e.printStackTrace();
        }
    }

    public Object loginCheck(String usr, String pass) {

        for (Doctor d : doctordirectory) {
            System.out.println("LoginCheck(doc): " + d.getUname() + " " + d.getPswd());
            if (d.getUname().equals(usr) && d.getPswd().equals(pass)) {
                return d;
            }
        }
         for (Hospital ho : hospitaldirectory.getHospitalList()) {
            System.out.println("LoginCheck(ho): " + ho.getUsername() + " " + ho.getPassword());
            if (ho.getUsername().equals(usr) && ho.getPassword().equals(pass)) {
                System.out.println("LoginCheck(): matched");
                return ho;
            }
        }

        for (Patient p : patientdirectory) {
            System.out.println("LoginCheck(doc): " + p.getUname() + " " + p.getPswd());
            if (p.getUname().equals(usr) && p.getPswd().equals(pass)) {
                return p;
            }
        }

       
        for (DonorBank don : donorbankdirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (don.getUsername().equals(usr) && don.getPassword().equals(pass)) {
                return don;
            }
        }
        for (Handler don : handlerdirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (don.getUname().equals(usr) && don.getPswd().equals(pass)) {
                return don;
            }
        }

        for (Technician tech : techdirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (tech.getUname().equals(usr) && tech.getPswd().equals(pass)) {
                return tech;
            }
        }

        for (Donor don : donordirectory) {
            //System.out.println("LoginCheck(doc): " + don.getUname() + " " + don.getPswd());
            if (don.getUname().equals(usr) && don.getPswd().equals(pass)) {
                return don;
            }
        }
        return null;
    }

    public void deleteDoctor(String doctorUName) {
        for (Doctor d : doctordirectory) {
            if (d.getUname().equals(doctorUName)) {
                doctordirectory.remove(d);
                return;
            }
        }
    }

    public void deleteNurse(String NurseUName) {
        for (Nurse n : nursedirectory) {
            if (n.getUname().equals(NurseUName)) {
                nursedirectory.remove(n);
                return;
            }
        }
    }

    public void deletePatient(String PatientUName) {
        for (Patient p : patientdirectory) {
            if (p.getUname().equals(PatientUName)) {
                patientdirectory.remove(p);
                return;
            }
        }
    }

    public void addDonateEntity(DonateEntity de) {
        try {
            donateEntityList.add(de);

        } catch (Exception e) {
            this.donateEntityList = new ArrayList();
            donateEntityList.add(de);
        }
    }

    public void addDonor(Donor donor) {
        try {
            donordirectory.add(donor);
        } catch (Exception e) {
            this.donordirectory = new ArrayList();
            donordirectory.add(donor);

        }
    }

    public void addDonorBank(DonorBank donor) {
        try {
            donorbankdirectory.add(donor);
        } catch (Exception e) {
            this.donorbankdirectory = new ArrayList();
            donorbankdirectory.add(donor);
            e.printStackTrace();
        }
    }

    public Doctor findDoctorByUserName(String usrName) {
        for (Doctor d : doctordirectory) {
            if (d.getUname().equals(usrName)) {
                return d;
            }
        }
        return null;
    }

    public ArrayList<Donor> getDonordirectory() {
        try {
            return donordirectory;
        } catch (Exception e) {
            this.donordirectory = new ArrayList();
            return donordirectory;
        }

    }

    public void setDonordirectory(ArrayList<Donor> donordirectory) {
        this.donordirectory = donordirectory;
    }

    public ArrayList<DonorBank> getDonorbankdirectory() {
        return donorbankdirectory;
    }

    public void setDonorbankdirectory(ArrayList<DonorBank> donorbankdirectory) {
        this.donorbankdirectory = donorbankdirectory;
    }

    public ArrayList<DonateEntity> getDonateEntityList() {
        return donateEntityList;
    }

    public void setDonateEntityList(ArrayList<DonateEntity> donateEntityList) {
        this.donateEntityList = donateEntityList;
    }

    public void addHandler(Handler handler) {
        try {
            handlerdirectory.add(handler);
        } catch (Exception e) {
            this.handlerdirectory = new ArrayList();
            handlerdirectory.add(handler);

        }
    }

    public void addVehicle(Vehicle vehicle) {
        try {
            vehicledirectory.add(vehicle);
        } catch (Exception e) {
            this.vehicledirectory = new ArrayList();
            vehicledirectory.add(vehicle);

        }
    }

    public void addTech(Technician tech) {
        try {
            techdirectory.add(tech);
        } catch (Exception e) {
            this.techdirectory = new ArrayList();
            techdirectory.add(tech);

        }
    }

    public void deleteDonorBYuserName(String doctorUName) {
        for (Donor n : donordirectory) {
            if (n.getUname().equals(doctorUName)) {
                donordirectory.remove(n);
                return;
            }
        }
    }

    public User findPatientByUserName(String patUname) {
        for (Patient p : patientdirectory) {
            if (p.getUname().equals(patUname)) {
                return p;
            }
        }
        for (Donor p : donordirectory) {
            if (p.getUname().equals(patUname)) {
                return p;
            }
        }
        return null;
    }

    public Vehicle getVehicleByNumber(String vecNo) {

        System.out.println("vec no:" + vecNo.substring(0, vecNo.indexOf("|")));
        for (Vehicle v : vehicledirectory) {
            if (v.getVehnum().matches(vecNo.substring(0, vecNo.indexOf("|")))) {
                return v;

            }
        }
        return null;
    }

    public void deleteDonorBank(String donorBankUName) {

        for (DonorBank n : donorbankdirectory) {
            System.out.println("donorb " + n.getUsername());
            if (n.getUsername().equals(donorBankUName)) {
                System.out.println("found");
                donorbankdirectory.remove(n);
                return;
            }
        }
    }

    public void deleteDonor(String donorName) {
        for (Donor n : donordirectory) {
            if (n.getUname().equals(donorName)) {
                donordirectory.remove(n);
                return;
            }
        }
    }

    public void deleteHandler(String HUname) {

        for (Handler n : handlerdirectory) {
            if (n.getUname().equals(HUname)) {
                handlerdirectory.remove(n);
                return;
            }
        }
    }

    public void deleteVehicle(String vNumber) {

        for (Vehicle n : vehicledirectory) {
            if (n.getVehnum().equals(vNumber)) {
                vehicledirectory.remove(n);
                return;
            }
        }
    }

    public void generateRequesting(String donateEntity, String handler, String tech, Hospital rec, String doc, String recPat) {
        Handler h = findHandlerByUname(handler);
        Technician t = findTechnicianByUname(tech);
        Doctor d = findDoctorByUserName(doc);
        Patient p = (Patient) findPatientByUserName(recPat);
        for (DonateEntity de : donateEntityList) {
            try {
                if (de.getId().equals(donateEntity)) {
                    de.setHandler(h);
                    de.setTechnician(t);
                    de.setReceiverEnterprise(rec);
                    de.setReceiverDoctor(d);
                    de.setReceiverPatient(p);
                    de.setStatus("Requested");
                    return;
                }
            } catch (Exception e) {

            }
        }

    }

    private Handler findHandlerByUname(String handler) {
        for (Handler d : handlerdirectory) {
             System.out.println("print :"+d.getUname());
            if (d.getUname().toLowerCase().equals(handler.toLowerCase())) {
                System.out.println("print found:"+d.getUname());
                return d;
            }
        }
        return null;
    }

    private Technician findTechnicianByUname(String tech) {
        for (Technician d : techdirectory) {
            if (d.getUname().equals(tech)) {
                return d;
            }
        }
        return null;
    }

}
