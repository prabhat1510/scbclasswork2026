package jdbcapp.exceptions;

public class AccountTypeNotValidException extends Exception{
	String message;

	public AccountTypeNotValidException(String message) {
		super(message);
		
	}
	

}
