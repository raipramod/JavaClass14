package day18;

public interface Demo3 {
	default void sayHello() {
		System.out.println("hello");
	}
	
	static void greet() {
		System.out.println("Good Morning........");
	}

}
