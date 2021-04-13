package com.mycompany.bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList();
    private int numberOfCustomer;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
    }

    public void addCustomer(String firstName, String lastName) {
        customers.add(new Customer(firstName, lastName));
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }
}
