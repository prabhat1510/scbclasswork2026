package jdbcapp.exceptions;

public class NameNotValidException extends Exception{
	String message;

	public NameNotValidException(String message) {
		super(message);
		
	}
	

}
