package com.Faissal;

import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customers> customers;

    public Branches(String name, ArrayList<Customers> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customers> customers) {
        this.customers = customers;
    }
}
