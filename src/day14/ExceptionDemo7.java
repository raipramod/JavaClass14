package day14;

public class ExceptionDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vote(9);
		System.out.println("exit");
	}

	public static void vote(int age) {
		if(age >= 18) {
			System.out.println("you can vote....");
		} else {
			throw new  ArithmeticException("You can not vote...");	
	}

  }
}
