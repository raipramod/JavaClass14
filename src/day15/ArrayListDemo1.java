package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(23);
		System.out.println(lst);
		
		lst.add(1, 35);
		System.out.println(lst);
		lst.set(2, 35);
		System.out.println(lst);
		lst.remove(3);
		System.out.println(lst);
		System.out.println(lst.contains(20));
		System.out.println(lst.contains(35));

	}

}
