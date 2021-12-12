 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Hospital.Doctor;
import Business.Enterprise.Hospital.Nurse;
import Business.Enterprise.Hospital.Patient;
import Business.Enterprise.Lab.Technician;
import Business.Enterprise.Logistics.Handler;

/**
 *
 * @author harshaljaiswal
 */
public class DonateEntity {

    public String id;
    public Doctor donorDoctor;
    public Doctor receiverDoctor;
    public Patient receiverPatient;
    public User donorPatient;
    public Nurse nurse;
    public Enterprise donorEnterprise;
    public Enterprise receiverEnterprise;
    public String type;
    public String bloodGroup;
    public String entityName;
    public String Status;
    public Handler Handler;
    public Technician technician;

    public DonateEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Doctor getDonorDoctor() {
        return donorDoctor;
    }

    public void setDonorDoctor(Doctor donorDoctor) {
        this.donorDoctor = donorDoctor;
    }

    public Doctor getReceiverDoctor() {
        return receiverDoctor;
    }

    public void setReceiverDoctor(Doctor receiverDoctor) {
        this.receiverDoctor = receiverDoctor;
    }

    public Patient getReceiverPatient() {
        return receiverPatient;
    }

    public void setReceiverPatient(Patient receiverPatient) {
        this.receiverPatient = receiverPatient;
    }

    public User getDonorPatient() {
        return donorPatient;
    }

    public void setDonorPatient(User donorPatient) {
        this.donorPatient = donorPatient;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Enterprise getDonorEnterprise() {
        return donorEnterprise;
    }

    public void setDonorEnterprise(Enterprise donorEnterprise) {
        this.donorEnterprise = donorEnterprise;
    }

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Handler getHandler() {
        return Handler;
    }

    public void setHandler(Handler Handler) {
        this.Handler = Handler;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
    

}
