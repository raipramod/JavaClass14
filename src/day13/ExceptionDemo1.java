package day13;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		int div = a /b;
		System.out.println("division is: " + div);
		
		String s = null;
		System.out.println(s.charAt(0));
		
		String n1 = "10";
		String n2 = "20";
		String sum = n1+n2;
		System.out.println("sum is: "+sum);
		
			

	}

}
