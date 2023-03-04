package Exceptions.custom_exceptions;

public class AgeInvalidException  extends Exception 
{
	public AgeInvalidException() {
		super();
	}
	
	public AgeInvalidException(String message) {
		super(message);
	}
}

