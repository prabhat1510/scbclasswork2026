package jdbcapp.dao;

import java.util.List;

import jdbcapp.exceptions.CustomerNotFoundException;
import jdbcapp.model.Customer;

public interface CustomerDAO {
	//Create
	public String createCustomer(Customer customer);
	//Retrieve
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException;
	//Retrieve All
	public List<Customer> getAllCustomers();
	//Update
	public String updateCustoemr(Customer customer);
	//Delete
	public String deleteCustomerById(Integer custId) throws CustomerNotFoundException;
}
