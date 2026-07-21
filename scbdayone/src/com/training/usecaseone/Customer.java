package com.training.usecaseone;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private String contact;
    private String accountType;

    public Customer(){

    }
    public Customer(int customerId, String name, String email,
                    String contact, String accountType) {

        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.accountType = accountType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {

        return "Customer Id = " + customerId +
                ", Customer Name = " + name +
                ", Customer Email = " + email +
                ", Customer Contact = " + contact +
                ", Account Type = " + accountType;
    }
}