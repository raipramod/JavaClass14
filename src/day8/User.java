package day8;

public class User {
	
	String name; //Instance varibale
	int age;
	
	public void assignValue(String name, int age) { //local variable
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("Name is:" +name);
		System.out.println("Age is: " +age);
	}
	
	public static void main(String[] args) {
		User t = new User();
		t.assignValue("pramod", 24);
		t.displayInfo();
		
	}

}
