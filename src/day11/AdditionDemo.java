package day11;

//Compile time polymorphism / static binding
//which is achieved by overloading of method 

public class AdditionDemo {
	
	public void sum(int a, int b) {
		int r = a + b;
		System.out.println("1. sum is:" +r);
		
	}
	
	public void sum(double a, double b) {
		double r = a + b;
		System.out.println("2. sum is:" +r);
		
	}
	
	
	public void sum(int a, int b, int c) {
		int r = a + b + c;
		System.out.println("3. sum is:" +r);
		
	}
	public static void main(String[] args) {
		AdditionDemo obj = new AdditionDemo();
		obj.sum(3.6, 6.5);
	}
}
