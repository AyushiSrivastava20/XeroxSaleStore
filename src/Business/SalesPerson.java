/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ayushi
 */
public class SalesPerson implements Comparable<SalesPerson> {
    
    private String name;
    private int salesId;
    private String designation;
    private String contact;
    private int totalRevenue;
    private float commission;
    private int targetSold;
    private int belowTarget;
    
    
    
    private static int count =0;

    public SalesPerson(){
        salesId = ++count;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public int getTargetSold() {
        return targetSold;
    }

    public void setTargetSold(int targetSold) {
        this.targetSold = targetSold;
    }

    public int getBelowTarget() {
        return belowTarget;
    }

    public void setBelowTarget(int belowTarget) {
        this.belowTarget = belowTarget;
    }

    

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(SalesPerson comparesal){
     int comparetemp=((SalesPerson)comparesal).getTotalRevenue();
     return comparetemp-this.totalRevenue;
    }

  
    
    
}
