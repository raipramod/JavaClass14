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
	
	public AccessModifierDemo () {
		System.out.println("This is public constructor");
	}
	
	void AccessModifierDemoin (int a){
		System.out.println("this is default constructor");
	}
	
	protected AccessModifierDemo (String s) {
		System.out.println("this is protected constructor");
	}
	
	private AccessModifierDemo(int a, int b) {
		System.out.println("This is private constructor");
	}
	
	public static void main(String[] args) {
		AccessModifierDemo ob = new AccessModifierDemo (4, 5);
		ob.privateMethod();
		ob.defaultMethod();
		ob.protectedMethod();
		ob.publicMethod();
	}
}

