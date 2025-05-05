package exceptionhandlingconcept;

public class NonEligibleException extends RuntimeException {
	
	public NonEligibleException(String msg) {
		super(msg);
	}

}
