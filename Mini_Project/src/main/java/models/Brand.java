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
    private long price;
    
    public Brand(String brand_name, int brand_id, int company_id, String barcode, String drug, String manufacture, String expiry, int quantity, long price) {
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

    public Brand(String brand_id, String company_id, String brand_name, String drug, String manufacture, String expiry, String barcode, String quantity, String price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBrand_name() {
        return brand_name;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getDrug() {
        return drug;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    
    
}
