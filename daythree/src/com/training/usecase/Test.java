package com.training.usecase;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setContactNo("11111");
        customer.setCustomerName("John");
        customer.setCustomerId(1244465);
        System.out.println(customer);
        System.out.println(customer.getContactNo());
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerId());


    }
}
