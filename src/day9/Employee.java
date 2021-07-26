package day9;

public class Employee {
	// Instance variable or member data or non static, properties, attributes, or simply data
	
	String name;
	int empId;
	
	public Employee(String n, int eId) {
		name = n;
		empId = eId;
		System.out.println("Constructor called");
	}
	
	public void displayInfo() {
		System.out.println("Name is: " +name);
		System.out.println("employee Id is: " +empId);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("ram", 12);
		e1.displayInfo();
		
		Employee e2 = new Employee("sita", 11);
		e1.displayInfo();
		
		
	}
}
