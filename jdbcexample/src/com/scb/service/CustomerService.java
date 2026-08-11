package com.scb.service;

import com.scb.exceptions.CustomerNotFoundException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Customer;

import java.util.List;

public interface CustomerService {
    //Create
    public String addCustomer(Customer customer);
    //Retrieve
    public Customer getCustomerById(Integer custId) throws CustomerNotFoundException;
    //Retrieve All
    public List<Customer> getAllCustomers() throws NoRecordFoundException;
    //Update
    public String updateCustomer(Customer customer) throws CustomerNotFoundException;
    //Delete
    public String deleteCustomerById(Integer custId) throws CustomerNotFoundException;
}
