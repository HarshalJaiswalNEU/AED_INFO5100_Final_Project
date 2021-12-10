/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise;

import components.Address;

/**
 *
 * @author harshaljaiswal
 */
public abstract class Enterprise {

    private String enterpriseName;
    private String registeryNumber;
    private Address address;

    public Enterprise(String enterpriseName, String registeryNumber, Address address) {
        this.enterpriseName = enterpriseName;
        this.registeryNumber = registeryNumber;
        this.address = address;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getRegisteryNumber() {
        return registeryNumber;
    }

    public void setRegisteryNumber(String registeryNumber) {
        this.registeryNumber = registeryNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
