package com.training.daytwo.encapsulationex;


public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("john@gmail.com");
        Customer customer2 = new Customer();
        customer2.setCustomerId(2);
        customer2.setFirstName("Bill");
        customer2.setLastName("Clinton");
        customer2.setEmail("bill@clinton.com");
        Customer customer3 = new Customer();
        customer3.setCustomerId(3);
        customer3.setFirstName("Jane");
        customer3.setLastName("Doe");
        customer3.setEmail("john@thisthat.com");
        Customer[] customers =new Customer[5];
        customers[0] = customer;
        customers[1] = customer2;
        customers[2] = customer3;
        System.out.println(customer.getCustomerId());
        System.out.println(customer);
        System.out.println(customers);
        System.out.println("******************************");
        for(Customer c : customers){
            System.out.println(c);
        }



    }
}
