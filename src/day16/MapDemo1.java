package day16;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> students = new HashMap<>();
		students.put(100, "Anil");
		students.put(102, "Shoraj");
		students.put(104, "Pramod");
		students.put(105, "Bimal");
		students.put(108, "Puja");
		System.out.println(students);
		System.out.println(students.get(105));
		System.out.println(students.containsKey(102));
		System.out.println(students.containsValue("Puja"));
		System.out.println(students.size());
		System.out.println(students.isEmpty());
		
		for (Map.Entry<Integer, String> st : students.entrySet()){
			System.out.println(st.getKey() + " " + st.getValue());
		}
		
		//students.forEach(new BiConsumer<Integer, String>());
		
		System.out.println("==================================");
		students.forEach(new BiConsumer <Integer, String>() {
			
			@Override
			public void accept(Integer t, String u) {
				System.out.println(t + "  " + u);
				
			}
			
		});
		
		System.out.println(students.values());

	}
}