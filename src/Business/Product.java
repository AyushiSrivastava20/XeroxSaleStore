/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author abhishekashwathnarayanvenkat
 */
public class Product implements Comparable<Product>{
    
    private String prodName;
    private int targetPrice;
    private int modelNumber;
    private int avail;
    private int floorPrice;
    private int CeilingPrice;
    private static int count =0;
    private int temp;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    
    public Product() {
    count++;
    modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getCeilingPrice() {
        return CeilingPrice;
    }

    public void setCeilingPrice(int CeilingPrice) {
        this.CeilingPrice = CeilingPrice;
    }

    @Override
    public int compareTo(Product comparepro){
     int comparetemp=((Product)comparepro).getTemp();
     return comparetemp-this.temp;
    }
    
    
    
}
