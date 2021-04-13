package com.divergent.map.assigment;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * In LinkedHashMap Used it have a 
 * @author Divergent
 *
 */
public class LinkedHashMapUsed {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(101, "jay");
		map.put(103, "Shamu");
		map.put(105, "Sakshi");
		map.put(107, "Kanchan");
		map.put(null, "Sahil");
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Show only Key");
		System.out.println("Keys: "+map.keySet());
		
		System.out.println("Only value show");
		System.out.println("Values : "+map.values());
		
		System.out.println("Key Pairs : "+map.entrySet());
		
		System.out.println(map.remove(103));
	}

}
