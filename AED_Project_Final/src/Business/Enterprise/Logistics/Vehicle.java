/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Logistics;

/**
 *
 * @author Mayur
 */
public class Vehicle {
    
    private String vehname;
    private String vehnum;
    private String vtype;
    private String description;

    public Vehicle(String vehname, String vehnum, String vtype, String description) {
        this.vehname = vehname;
        this.vehnum = vehnum;
        this.vtype = vtype;
        this.description = description;
    }
    
    

    public String getVehname() {
        return vehname;
    }

    public void setVehname(String vehname) {
        this.vehname = vehname;
    }

    public String getVehnum() {
        return vehnum;
    }

    public void setVehnum(String vehnum) {
        this.vehnum = vehnum;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
