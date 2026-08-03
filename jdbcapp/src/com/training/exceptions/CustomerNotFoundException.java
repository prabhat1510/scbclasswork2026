package jdbcapp.exceptions;

public class CustomerNotFoundException extends Exception{
	String message;

	public CustomerNotFoundException(String message) {
		super(message);
		
	}
	

}
