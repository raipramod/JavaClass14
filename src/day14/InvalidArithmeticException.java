package day14;

public class InvalidArithmeticException extends RuntimeException{
	
	private static final long serialVersionID = 1L;
	
	public InvalidArithmeticException (String msg){
		super(msg);
	}

}
