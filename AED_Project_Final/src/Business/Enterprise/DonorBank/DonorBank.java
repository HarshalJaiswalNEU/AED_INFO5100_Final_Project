/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.DonorBank;

import Business.Components.Address;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author harshaljaiswal
 */
public class DonorBank extends Enterprise {

    private ArrayList<Donor> donordirectory;
    private ArrayList<Blood> blooddirectory;
    private ArrayList<Organ> organdirectory;

    public DonorBank(String enterpriseName, String registeryNumber, String address, String username, String password) {
        super(enterpriseName, registeryNumber, address, username, password);

        this.donordirectory = new ArrayList();
        this.blooddirectory = new ArrayList();
        this.organdirectory = new ArrayList();
    }

    public ArrayList<Donor> getDonordirectory() {
        return donordirectory;
    }

    public void setDonordirectory(ArrayList<Donor> donordirectory) {
        this.donordirectory = donordirectory;
    }

    public ArrayList<Blood> getBlooddirectory() {
        return blooddirectory;
    }

    public void setBlooddirectory(ArrayList<Blood> blooddirectory) {
        this.blooddirectory = blooddirectory;
    }

    public ArrayList<Organ> getOrgandirectory() {
        return organdirectory;
    }

    public void setOrgandirectory(ArrayList<Organ> organdirectory) {
        this.organdirectory = organdirectory;
    }



}
