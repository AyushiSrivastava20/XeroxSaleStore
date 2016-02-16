/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ayushi
 */
public class Order {
    
    private static int count=0;
    private ArrayList<OrderItem>  orderItemList;
    private int orderNumber;
    private SalesPerson salesPerson;
    private Customer customer;
    
    public Order(){
        orderNumber = ++count;
        orderItemList = new ArrayList<OrderItem>();
    }
    
    public int getOrderNumber(){
        return orderNumber;
    }
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    public OrderItem addOrderItem(Product p, int q, int price, String status){
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setCustomerPrice(price);
        o.setStatus(status);
        orderItemList.add(o);
        return o;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

   
     public int getOrderTotal(){
         
         int sum=0;
         for(OrderItem oi : getOrderItemList()){
             sum = sum + oi.getOrderItemTotal();
             
         }
        return sum;
     }
    
}
