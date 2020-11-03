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
public class Employee {
    private int eid;
    private String fname;
    private String lname;
    private String address;
    private String dob;
    private int salary;
    private long phone_no;
    private int pid;
    
    public Employee(int eid, String fname, String lname, String address, String dob, int salary, long phone_no, int pid) {
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.dob = dob;
        this.salary = salary;
        this.phone_no = phone_no;
        this.pid = pid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    
    
}
