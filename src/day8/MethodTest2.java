package day8;

public class MethodTest2 {

	public String greet() {
		String g ="Hello world";
		return g;
	}
	
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static void main(String[] args) {
		MethodTest2 obj = new MethodTest2();
		String gr = obj.greet();
		System.out.println(gr);
		
		int x = 3;
		int y = 4;
		int r = obj.sum(x, y);
		System.out.println("The sum of two number is:" + r);
		
	}
}
