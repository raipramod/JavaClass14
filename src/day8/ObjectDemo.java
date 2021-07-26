package day8;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		new ObjectDemo (); // anonymous object
		ObjectDemo obj = new ObjectDemo ();
		ObjectDemo obj1;
		obj1 = new ObjectDemo();
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(new ObjectDemo());
		
		System.out.println("day8.ObjectDemo@" + Integer.toHexString(obj.hashCode()));
		

	}

}
