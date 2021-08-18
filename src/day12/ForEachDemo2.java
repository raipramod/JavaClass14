package day12;

public class ForEachDemo2 {

	public static void main(String[] args) {
		
		int [][] arr = {{4, 5, 6}, {7, 3, 2}, {8, 9, 1}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println("=====================");
		for (int []ar : arr ) {
			for(int i : ar) {
				System.out.println(i + " ");
			}
			System.out.println();
		}
	}

}
