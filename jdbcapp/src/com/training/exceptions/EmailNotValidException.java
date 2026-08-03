package jdbcapp.exceptions;

public class EmailNotValidException extends Exception{
	String message;

	public EmailNotValidException(String message) {
		super(message);
		
	}
	

}
