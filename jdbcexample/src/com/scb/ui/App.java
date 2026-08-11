package com.scb.ui;

import com.scb.exceptions.CustomerNotFoundException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Customer;
import com.scb.service.CustomerService;
import com.scb.service.CustomerServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //To access the service layer create an object of CustomerServiceImpl class
        CustomerService customerService = new CustomerServiceImpl();

        Customer customer = new Customer();
        customer.setCustomerId(111);
        customer.setAccountType("Savings");
        customer.setContact("9999106219");
        customer.setName("John Doe");
        customer.setMailId("john@gmail.com");


        //Create a customer
        String message = customerService.addCustomer(customer);
        System.out.println(message);

        //Retrieve All
        try {
            List<Customer> customers =customerService.getAllCustomers();
            System.out.println(customers);

        } catch (NoRecordFoundException e) {
            System.out.println(e.getMessage());
        }
        try{
            //Retrieve By Id
            Customer customer1 = customerService.getCustomerById(111);
        }
        catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
