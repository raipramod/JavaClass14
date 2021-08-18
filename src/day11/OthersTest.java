package day11;

public class OthersTest {

	public static void main(String[] args) {
		AccessModifierDemo ob = new AccessModifierDemo ("Hello");
	//	ob.privateMethod();
		ob.defaultMethod();
		ob.protectedMethod();
		ob.publicMethod();
	}
}
