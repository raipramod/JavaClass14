package day13;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Good Morning");
		System.out.println(s1);
		s1.concat("Morning");
		System.out.println(s1);
		
		System.out.println("===============");
		
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		sb.append("Morning");
		System.out.println(sb);
		
		
		System.out.println("String Buffer Example");
		
		StringBuffer sbf = new StringBuffer("Good");
		System.out.println(sbf);
		sb.append("Morning");
		System.out.println(sbf);
		
		
		

	}

}
