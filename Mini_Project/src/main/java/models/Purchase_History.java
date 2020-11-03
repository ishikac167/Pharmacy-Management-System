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
public class Purchase_History {
    
    private int purchase_id;
    private String date_of_purchase;
    private int total_amount;
    private String payment_mode;
    
    public Purchase_History(int purchase_id, String date_of_purchase, int total_amount, String payment_mode) {
        this.purchase_id = purchase_id;
        this.date_of_purchase = date_of_purchase;
        this.total_amount = total_amount;
        this.payment_mode = payment_mode;
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

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(String payment_mode) {
        this.payment_mode = payment_mode;
    }
}
