package day7;

public class ForLoopDemo {

	public static void main(String[] args) {
//		for (initialization; condition; update(increment/decrement)
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the nth number is " + sum);
	}

}
