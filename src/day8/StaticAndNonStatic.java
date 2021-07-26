package day8;

public class StaticAndNonStatic {
	
	String name = "ram"; //use the variable 
	static int age = 32;
	
	public void greet() { // use method 
		System.out.println("hello , Good Morning....");
	}

	public static void sayHi() {
		System.out.println("Hi, How are ou?");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// use object to access the variable and method inside of class
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.greet();
		
		System.out.println(age);
		sayHi();

	}

}
