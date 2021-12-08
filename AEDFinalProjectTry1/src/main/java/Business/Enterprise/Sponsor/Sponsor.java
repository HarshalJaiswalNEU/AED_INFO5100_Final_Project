/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise.Sponsor;

import Business.Components.Address;
import Business.Enterprise.Enterprise;

/**
 *
 * @author harshaljaiswal
 */
public class Sponsor extends Enterprise{
    
    public Sponsor(String enterpriseName, String registeryNumber, Address address, String username, String password) {
        super(enterpriseName, registeryNumber, address, username, password);
    }
    
}
