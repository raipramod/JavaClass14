package day12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Nepal";
		String s2 = "Nepal";
		
		String s3 = new String("Nepal");
		String s4 = new String("Nepal");
		
		System.out.println(s1 == s2); // true 
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // false
		
		System.out.println(s1.equals(2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s3.equals(s4)); //true
		
		String s5 = "Nepal";
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		

	}

}
