package com.training.usecase;


import java.util.Random;

public class CustomerService {

    private Customer[] customers = new Customer[10];
    private final static String namePattern="[A-Za-z ]+";
    private final static String emailPattern="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private final static String contactNoPattern="\\d{10}";

    Random random = new Random();
    private int counter = 0;

    // Generate Customer Id
    private int generateCustomerId() {
        counter++;
        return 1000 + random.nextInt(9000);
    }
    public String addCustomer(Customer customer) throws InvalidNameException, InvalidEmailException, InvalidContactNoException {
        validateCustomer(customer);
        customer.setCustomerId(this.generateCustomerId());
        customers[counter] = customer;
        return "Customer added successfully";
    }
    public Customer searchCustomer(Integer customerId) throws CustomerNotFoundException {
         for(Customer customer : customers){
             if(customer.getCustomerId().equals(customerId)){
                 return customer;
             }else{
                 throw new CustomerNotFoundException("Customer with customer id "+customerId+" not found");
             }
         }
        return null;
    }
    public Customer[] customers(){
        return customers;
    }

    public void validateCustomer(Customer customer) throws InvalidEmailException,InvalidContactNoException, InvalidNameException {
        validateEmail(customer.getEmail());
        validateName(customer.getCustomerName());
        validateContactNo(customer.getContactNo());
    }

    private void validateContactNo(String contactNo) throws InvalidContactNoException {
        if(!contactNo.matches(CustomerService.contactNoPattern)) {
            throw new InvalidContactNoException("Invalid contact number");
        }
    }

    private void validateName(String customerName) throws InvalidNameException {
        if(!customerName.matches(CustomerService.namePattern)) {
            throw new InvalidNameException("Customer name is invalid");
        }
    }

    private void validateEmail(String email) throws InvalidEmailException {
        if(!email.matches(CustomerService.emailPattern)) {
            throw new InvalidEmailException("Customer email is invalid");
        }

    }
}
