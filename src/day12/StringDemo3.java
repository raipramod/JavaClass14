package day12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Good Morning";
		System.out.println(s1);
		System.out.println(s1.substring(5));

		System.out.println(s1.substring(0, 4));
		
		System.out.println(s1.charAt(5));
		System.out.println(s1.concat("Hello"));
		System.out.println("Hello, ".concat(s1));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("M"));
		System.out.println(s1.length());
		char [] ch = s1.toCharArray();
		System.out.println(ch[0]);
		
		String s2 = " Hello, I am Pramod ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
	}

}
