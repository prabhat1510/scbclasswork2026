package com.scb.service;

import com.scb.dao.CustomerDAO;
import com.scb.dao.CustomerDAOImpl;
import com.scb.exceptions.CustomerNotFoundException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public String addCustomer(Customer customer) {
        //CustomerDAO customerDAO = new CustomerDAOImpl();
        return  customerDAO.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(Integer custId) throws CustomerNotFoundException {
        //CustomerDAO customerDAO = new CustomerDAOImpl();
        Customer customer = customerDAO.getCustomerById(custId);
        if(customer == null){
            throw new CustomerNotFoundException("Customer not found");
        }
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() throws NoRecordFoundException {
        //CustomerDAO customerDAO = new CustomerDAOImpl();
        List<Customer> customers = customerDAO.getAllCustomers();
        if(customers == null || customers.isEmpty()){
            throw new NoRecordFoundException("No customers found");
        }
        return customers;
    }

    @Override
    public String updateCustomer(Customer customer) throws CustomerNotFoundException {
        return "";
    }

    @Override
    public String deleteCustomerById(Integer custId) throws CustomerNotFoundException {
        return "";
    }
}
