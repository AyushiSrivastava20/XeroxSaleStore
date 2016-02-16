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
public class OrderItem {
    
    private Product product;
    private int quantity;
    private int customerPrice;
    private String status;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCustomerPrice() {
        return customerPrice;
    }

    public void setCustomerPrice(int customerPrice) {
        this.customerPrice = customerPrice;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
    
    @Override
    public String toString(){
        return product.getProdName();
    }
    public int getOrderItemTotal(){
        return getQuantity()*getCustomerPrice();
    }
    
}
