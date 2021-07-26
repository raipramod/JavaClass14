package day8;

public class StaticNonStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.greet();
		
		System.out.println(StaticAndNonStatic.age);
		StaticAndNonStatic.sayHi();
	}

}
