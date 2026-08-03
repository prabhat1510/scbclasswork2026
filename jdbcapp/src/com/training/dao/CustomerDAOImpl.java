package jdbcapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcapp.exceptions.CustomerNotFoundException;
import jdbcapp.model.Customer;
import jdbcapp.utility.DBConnectionUtil;
import jdbcapp.utility.QueryMapper;

/**
 * In this class we will write logic to establish connection with DB Logic
 * execute our sql query After that from result set we will retrieve data
 * Postgresql Server is running on localhost:5432 username : postgres password :
 * password name of the db : scb2024
 * 
 * @author UD SYSTEMS
 *
 */
public class CustomerDAOImpl implements CustomerDAO {
	private static final String url = "jdbc:postgresql://localhost:5432/scbmy2024";
	private static final String username = "postgres";
	private static final String password = "password";

	@Override
	public String createCustomer(Customer customer) {
		// Step 1 : Create a connection object using DB credentials and DriverManager
		// 1. Connection
		Connection conn = DBConnectionUtil.getDBConnection();
		// 2. Create a prepared statement
		PreparedStatement pstmt;
		//String sql = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?)";
		try {
			//pstmt = conn.prepareStatement(sql);
			pstmt = conn.prepareStatement(QueryMapper.ADD_CUSTOMER);
			pstmt.setInt(1, customer.getCutsomerId());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getMailId());
			pstmt.setString(4, customer.getContact());
			pstmt.setString(5, customer.getAccountType());
			int rows = pstmt.executeUpdate();
			if(rows>0) {
				return "Customer added successfully with id "+customer.getCutsomerId();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Unable to add customer";
	}

	// Retrieve customer data from DB of a specific customer
	@Override
	public Customer getCustomerById(Integer custId) throws CustomerNotFoundException {
		// 1. Connection
		Connection conn = DBConnectionUtil.getDBConnection();
		// Connection connection = DriverManager.getConnection(url,username , password);
		// 2. Create a statement
		Statement stmt;
		Customer customer = null;
		try {
			stmt = conn.createStatement();
			// ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER WHERE CUSTOMERID =
			// "+custId);
			ResultSet rs = stmt.executeQuery(QueryMapper.GET_CUSTOMER_BY_ID + custId);
			if (rs.next()) {
				customer = new Customer();
				customer.setCutsomerId(rs.getInt("customerid"));
				customer.setName(rs.getString("name"));
				customer.setMailId(rs.getString("mailid"));
				customer.setContact(rs.getString("contact"));
				customer.setAccountType(rs.getString("accounttype"));
			} else {
				throw new CustomerNotFoundException("Customer with id " + custId + " doesn't exists");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = null;
		try {
			// Connection object
			// Connection conn = DriverManager.getConnection(url, username, password);
			Connection conn = DBConnectionUtil.getDBConnection();
			// creating a statement
			Statement stmt = conn.createStatement();
			// executing the statement query and getting result set
			ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
			customers = new ArrayList<Customer>();
			// Retrieving data from result set
			while (rs.next()) {
				// Creating an object
				Customer customer = new Customer();
				// Setting data from result set to customer object
				customer.setCutsomerId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setMailId(rs.getString(3));
				customer.setContact(rs.getString(4));
				customer.setAccountType(rs.getString(5));

				customers.add(customer);
			}
			rs.close();
			stmt.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public String updateCustoemr(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomerById(Integer custId) throws CustomerNotFoundException {
		Connection conn = DBConnectionUtil.getDBConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(QueryMapper.DELETE_CUSTOMER_BY_ID);
			pstmt.setInt(1, custId);
			
			int rows = pstmt.executeUpdate();
			if(rows>0) {
				return "Customer with id "+custId+" deleted successfully";
				
			}else {
				throw new CustomerNotFoundException("Customer with id "+custId+" dosen't exists. Unable to delete");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
