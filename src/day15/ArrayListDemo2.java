package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(23);
		System.out.println(lst);
		
		int sum = 0;
		for (int i = 0; i < lst.size(); i++) {
			sum = sum + lst.get(i);
		}
		System.out.println("sum is: " +sum);
		
		System.out.println("===================");
		for (int l: lst) {
			System.out.println(l);
		}
		System.out.println("*********************");
		Iterator<Integer> it = lst.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("========================");
		ListIterator<Integer> lit = lst.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println();
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}

}
