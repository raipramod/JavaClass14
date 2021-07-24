package day7;

public class WhileLoopDemo {

	public static void main(String[] args) {
//		use while loop for uncertainty
		int n = 5;
		int i = 1;
		int sum = 0;
		
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of the Nth number is " + sum);
	}

}
