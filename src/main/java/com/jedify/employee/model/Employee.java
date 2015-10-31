package com.jedify.employee.model;

/**
 * Created by j1013575 on 10/31/2015.
 */
public class Employee {
    private String name;
    private String id;
    private String address;
    private String company;

    public Employee(String name, String id, String address, String company) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
