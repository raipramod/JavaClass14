package day11;

public class AccessModifierDemo {
	String defaultVar = "This is default variable";
	public String publicVar = "this is public variable";
	protected String protectedVar = "This is protected variable";
	private String PrivateVar = "This is private variable";
	
	void defaultMethod() {
		System.out.println("This is default method");
	}

	public void publicMethod() {
		System.out.println("This is public method");
	}
	
	protected void protectedMethod() {
		System.out.println("This is protected method");
	}
	
	private void privateMethod() {
		System.out.println("This is private method");
	}
	
}
