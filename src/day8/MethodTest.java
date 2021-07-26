package day8;

public class MethodTest {

	public void sayHello() {
		System.out.println("say hello");
	}	
	
	public void displayInfo(String name, int age) {
		System.out.println("name is:"+ name);
		System.out.println("Age is: " + age);
	}
	
	public static void main(String[] args) {
		MethodTest obj = new MethodTest();
		obj.sayHello();
		String name = "ram";
		int age = 22;
		obj.displayInfo(name, age);
	}
}
