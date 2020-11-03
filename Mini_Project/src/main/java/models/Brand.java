/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Shilpi
 */
public class Brand {
    private String brand_name;
    private int brand_id;
    private int company_id;
    private String barcode;
    private String drug;
    private String manufacture;
    private String expiry;
    private int quantity;
    private int price;
    
    public Brand(int brand_id, String drug, String barcode, int price, int quantity, int company_id, String expiry, String manufacture, String brand_name) {
        this.brand_id = brand_id;
        this.company_id = company_id;
        this.brand_name = brand_name;
        this.drug = drug;
        this.manufacture = manufacture;
        this.expiry = expiry;
        this.barcode = barcode;
        this.quantity = quantity;
        this.price = price;
        
        
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    
}
