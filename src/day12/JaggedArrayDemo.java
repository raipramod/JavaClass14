package day12;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int [3][1];
		
		//oth row
		arr[0] = new int[1];
		arr[0][0] = 10;
		
		//1st row
		arr[1] = new int[2];
		arr[1][0] = 10;
		arr[1][1] = 20;
		
//		2nd row
		arr[2] = new int[3];
		arr[2][0] = 10;
		arr[2][1] = 20;
		arr[2][2] = 30;
		
		for (int [] ar: arr) {
			for (int i : ar) {
				System.out.println(i +" ");
				
			}
			System.out.println();
		}
	}
}
			

