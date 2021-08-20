package day13;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		try {
			System.out.println("try start....");
			int div = a/b;
			System.out.println("division is: " +div);
			System.out.println("try end.......");
		}catch(ArithmeticException ae) {
			System.out.println("inside catch...");
		}finally {
			System.out.println("inside finally.......");
		}
		
		System.out.println("more code...");
		System.out.println("more code........");
		System.out.println("Program terminated");


	}

}
