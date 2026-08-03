package jdbcapp.service;

import java.util.List;

import jdbcapp.dao.CustomerDAO;
import jdbcapp.dao.CustomerDAOImpl;
import jdbcapp.exceptions.CustomerNotFoundException;
import jdbcapp.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	/**
	 * From service implementation class we have to make a call to 
	 * dao implementation class method	
	 */
	@Override
	public String createCustomer(Customer customer) {
		//Creating an object of CustomerDAOImpl class
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.createCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException{
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.getCustomerById(custId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.getAllCustomers();
	}

	@Override
	public String updateCustoemr(Customer customer) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.updateCustoemr(customer);
	}

	@Override
	public String deleteCustomerById(Integer custId) throws CustomerNotFoundException {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.deleteCustomerById(custId);
	}

}
