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
public class Customer implements Comparable<Customer> {
    
    private String name;
    private String organization;
    private String Customer_ID;
    private int temp1;
    
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public int getTemp1() {
        return temp1;
    }

    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    
    
    @Override
    public String toString(){
        return name;
    }
   
    @Override
    public int compareTo(Customer comparecus){
     int comparetemp=((Customer)comparecus).getTemp1();
     return comparetemp-this.temp1;
    }
}
