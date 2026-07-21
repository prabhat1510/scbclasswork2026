package com.training.oops;

public class CustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        System.out.println(customer.name);
        //System.out.println(customer.id);
        customer.setId(15);
        System.out.println(customer.getId());
        Customer customer1= new Customer();
        Customer customer2= new Customer();
        //Array of Customer class objects
        Customer[] customers = new Customer[3];
        customers[0]=customer1;
        customers[1]=customer;
        customers[2]=customer2;
    }
}
