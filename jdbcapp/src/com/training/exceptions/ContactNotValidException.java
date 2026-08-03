package jdbcapp.exceptions;

public class ContactNotValidException extends Exception{
	String message;

	public ContactNotValidException(String message) {
		super(message);
		
	}
	

}
