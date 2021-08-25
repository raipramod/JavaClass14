package day15;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = new LinkedList<>();
		lst.add(10);
		lst.add(20);
		lst.add(23);
		System.out.println(lst);
		lst.add(1, 35);
		System.out.println(lst);
		lst.set(2, 45);
		System.out.println(lst);
		lst.remove(3);
		System.out.println(lst);
		System.out.println(lst.contains(20));
		System.out.println(lst.contains(35));
		System.out.println(lst.get(1));
		System.out.println(lst.size());
		lst.clear();
		System.out.println(lst);
		System.out.println(lst.isEmpty());
		
		

	}

}
