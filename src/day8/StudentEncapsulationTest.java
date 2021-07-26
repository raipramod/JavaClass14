package day8;

public class StudentEncapsulationTest {
	
	public static void main(String[] args) {
		StudentEncapsulationDemo student = new StudentEncapsulationDemo();
		student.setName("Hari"); //set
		student.setRoll(11);
		
		System.out.println("Name is:" +student.getName()); //get
		System.out.println("Roll is: "+ student.getRoll());
		
		
	}

}
