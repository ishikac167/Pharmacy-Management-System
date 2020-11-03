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
public class Company {
    private int company_id;
    private String company_name;
    private String company_address;
    private long company_phone;
    private int pharmacist_id;
    
    public Company(int company_id, String company_name, String company_address, long company_phone, int pharmacist_id) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_address = company_address;
        this.company_phone = company_phone;
        this.pharmacist_id = pharmacist_id;
                
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public long getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(long company_phone) {
        this.company_phone = company_phone;
    }

    public int getPharmacist_id() {
        return pharmacist_id;
    }

    public void setPharmacist_id(int pharmacist_id) {
        this.pharmacist_id = pharmacist_id;
    }
}
