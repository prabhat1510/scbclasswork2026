package jdbcapp.ui;

import java.util.List;

import jdbcapp.exceptions.CustomerNotFoundException;
import jdbcapp.model.Customer;
import jdbcapp.service.CustomerService;
import jdbcapp.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		//This class method main is acting as user interface
		//Scanner sc = new Scanner(System.in);
		
		//set data to customer object  // input data
		CustomerService service = new CustomerServiceImpl();
		List<Customer> listOfCustomers = service.getAllCustomers();
		System.out.println(listOfCustomers);
		
		try {
			Customer cust = service.getCustomerById(1);
			System.out.println(cust);
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("*************INSERT CUSTOMER ********************");
		Customer customer = new Customer();
		customer.setCutsomerId(4);
		customer.setName("Bill");
		customer.setMailId("Bill@gmail.com");
		customer.setContact("999999889");
		customer.setAccountType("Saving");
		String message = service.createCustomer(customer);
		System.out.println(message);
		
		System.out.println("*************DELETE CUSTOMER ********************");
		String msg;
		try {
			msg = service.deleteCustomerById(2);
			System.out.println(msg);
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
