package com.training.usecaseone;

import java.util.ArrayList;
import java.util.Random;

public class CustomerService {

    ArrayList<Customer> customerList = new ArrayList<>();
    Customer[] customers = new Customer[10];
    Random random = new Random();

    // Generate Customer Id
    private int generateCustomerId() {

        return 1000 + random.nextInt(9000);
    }

    // Add Customer
    public void addCustomer(String name,
                            String email,
                            String contact,
                            String accountType) {

        int id = generateCustomerId();

        Customer customer =
                new Customer(id, name, email, contact, accountType);

        customerList.add(customer);
        //customers[0]=customer;
        System.out.println("\nCustomer Added Successfully.");
        System.out.println("Generated Customer Id : " + id);
    }

    // Display Customers
    public void displayCustomers() {

        if(customerList.isEmpty()) {

            System.out.println("\nNo Customers Found.");
            return;
        }

        System.out.println("\nCustomer Details");

        for(Customer c : customerList) {

            System.out.println(c);
        }
    }

    // Search Customer

    public void searchCustomer(int id) {

        boolean found = false;

        for(Customer c : customerList) {

            if(c.getCustomerId() == id) {

                System.out.println("\nCustomer Found");
                System.out.println(c);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Customer Not Found.");
    }

    // Delete Customer

    public void deleteCustomer(int id) {

        Customer deleteCustomer = null;

        for(Customer c : customerList) {

            if(c.getCustomerId() == id) {

                deleteCustomer = c;
                break;
            }
        }

        if(deleteCustomer != null) {

            customerList.remove(deleteCustomer);
            System.out.println("Customer Deleted Successfully.");

        } else {

            System.out.println("Customer Not Found.");
        }

    }

}