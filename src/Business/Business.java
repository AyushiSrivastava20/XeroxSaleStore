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
public class Business {
   
    private MasterOrderCatalog masterOrderCatalog;
    private SalesPersonDirectory salesPersonDirectory;
    private CustomerDirectory customerDirectory;
    private Supplier supplier;
    
    public Business(){
      
        
        masterOrderCatalog= new MasterOrderCatalog();
        salesPersonDirectory = new SalesPersonDirectory();
        customerDirectory = new CustomerDirectory();
        supplier = new Supplier();
        
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
    
}
