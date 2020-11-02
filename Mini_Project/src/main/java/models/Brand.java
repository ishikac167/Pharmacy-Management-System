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
    private String brand_id;
    private String company_id;
    private String barcode;
    private String drug;
    private String manufacture;
    private String expiry;
    private String quantity;
    private String price;
    
    public Brand(String brand_name, String brand_id, String company_id, String barcode, String drug, String manufacture, String expiry, String quantity, String price) {
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

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
