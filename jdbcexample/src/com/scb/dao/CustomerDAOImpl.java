package com.scb.dao;

import com.scb.exceptions.CustomerNotFoundException;
import com.scb.exceptions.NoRecordFoundException;
import com.scb.model.Customer;
import com.scb.utility.QueryMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    private static final String url = "jdbc:postgresql://localhost:5432/jdbcexampledb";
    private static final String username = "postgres";
    private static final String password = "password";
    @Override
    public String addCustomer(Customer customer) {
        // 1. Connection
        // 2. Create a prepared statement
        PreparedStatement pstmt;
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            pstmt = conn.prepareStatement(QueryMapper.ADD_CUSTOMER);
            pstmt.setInt(1, customer.getCustomerId());
            pstmt.setString(2, customer.getName());
            pstmt.setString(3, customer.getMailId());
            pstmt.setString(4,customer.getContact());
            pstmt.setString(5,customer.getAccountType());
            int rows = pstmt.executeUpdate();
            if(rows>0) {
                return "Customer added successfully with id "+customer.getCustomerId();
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return "Unable to add customer";
    }

    @Override
    public Customer getCustomerById(Integer custId) throws CustomerNotFoundException {
        // 1. Connection
        // 2. Create a prepared statement
        PreparedStatement pstmt;
        Customer customer = null;
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            //"SELECT * FROM CUSTOMER WHERE CUSTOMERID = ?"
            pstmt = conn.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
            pstmt.setInt(1, custId);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()) {
                customer = new Customer();
                customer.setCustomerId(rs.getInt(1));
                customer.setName(rs.getString(2));
                customer.setMailId(rs.getString(3));
                customer.setContact(rs.getString(4));
                customer.setAccountType(rs.getString(5));
            }else{
                throw new CustomerNotFoundException("Customer not found with id "+custId);
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return customer;
    }

    @Override
    public List<Customer> getAllCustomers() throws NoRecordFoundException {

        List<Customer> customers = new ArrayList<>();
        try {
            // 1. Connection
            Connection conn = DriverManager.getConnection(url, username, password);
            // 2. Create a statement
            Statement stmt = conn.createStatement();
            ResultSet rs= stmt.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);

            while (rs.next()) {
                Customer customer = new Customer();
                //Retrieving customer data from ResultSet
                customer.setCustomerId(rs.getInt(1));
                customer.setName(rs.getString(2));
                customer.setMailId(rs.getString(3));
                customer.setContact(rs.getString(4));
                customer.setAccountType(rs.getString(5));
                //Add the retrieved customer to a list
                customers.add(customer);
            }
            if(customers.isEmpty()){
                throw new NoRecordFoundException("No customer record found");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
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