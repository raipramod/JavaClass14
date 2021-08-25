package day16;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {4, 3, 5, 7, 9, 1};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 6));
		
		List<Integer> list = Arrays.asList(10, 20, 12);
		System.out.println(list);
		
		
	}

}
