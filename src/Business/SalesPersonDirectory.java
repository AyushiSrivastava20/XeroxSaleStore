/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayushi
 */
public class SalesPersonDirectory {
    
     private List<SalesPerson> salesPersonList;

    public SalesPersonDirectory() {
        
    salesPersonList = new ArrayList<SalesPerson>();
    
    }

    public List<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(List<SalesPerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }
    
     public SalesPerson addSalesPerson(){
        SalesPerson sp = new SalesPerson();
        salesPersonList.add(sp);
        return sp;
    }
    
    public void removeSalesPerson(SalesPerson s){
        salesPersonList.remove(s);
    }
}
