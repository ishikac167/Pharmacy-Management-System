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
public class Purchase {
    private int purchase_id;
    private String date_of_purchase;
    private int quantity;
    private int rate;
    private int amount;
    private String barcode;
    private String brand;
    private int customer_id;
    
    public Purchase(int purchase_id, String date_of_purchase, int customer_id, int quantity, int rate, int amount, String barcode, String brand) {
        this.purchase_id = purchase_id;
        this.date_of_purchase = date_of_purchase;
        this.customer_id = customer_id;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = amount;
        this.barcode = barcode;
        this.brand = brand;
    }

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public String getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(String date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    
    
}
