package day16;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hMap = new HashMap<>();
		hMap.put(100, "Anil");
		hMap.put(102, "Shoraj");
		hMap.put(104, "Pramod");
		hMap.put(105, "Bimal");
		hMap.put(108, "Puja");
		System.out.println("hash map is: " + hMap);
		for(Map.Entry<Integer, String> st :hMap.entrySet()) {
			System.out.println(st.getKey() + st.getValue());
		}
		
		Map<Integer, String> lMap = new LinkedHashMap<>();
		lMap.put(100, "Anil");
		lMap.put(102, "Shoraj");
		lMap.put(104, "Pramod");
		lMap.put(105, "Bimal");
		lMap.put(108, "Puja");
		System.out.println("hash map is: " + lMap);
		for(Map.Entry<Integer, String> st :hMap.entrySet()) {
			System.out.println(st.getKey() + st.getValue());
		}
		
		Map<Integer, String> tMap = new TreeMap<>();
		tMap.put(100, "Anil");
		tMap.put(102, "Shoraj");
		tMap.put(104, "Pramod");
		tMap.put(105, "Bimal");
		tMap.put(108, "Puja");
		System.out.println("hash map is: " + tMap);
		for(Map.Entry<Integer, String> st :hMap.entrySet()) {
			System.out.println(st.getKey() + st.getValue());
		}
		
	}
}
