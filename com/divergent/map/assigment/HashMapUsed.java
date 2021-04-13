package com.divergent.map.assigment;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapUsed {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Raj");
		map.put(102, "Rahul");
		map.put(103, "shayam");
		map.put(104, "ant");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("Sort by key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("Sort by Value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}

}
