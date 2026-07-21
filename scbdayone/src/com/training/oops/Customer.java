package com.training.oops;

public class Customer {
    private int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void displayCustomerInfo(){
        System.out.println("Customer Name : " + this.name);
        System.out.println("Customer ID : " + this.id);
    }
}
