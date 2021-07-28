package day10;

public class Student {
	
	String name;
	int roll;
	
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
	public void display() {
		System.out.println("name is: "+ name);
		System.out.println("roll is: "+ roll);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student ("Ramesh", 23);
		s1.display();
	}

}
