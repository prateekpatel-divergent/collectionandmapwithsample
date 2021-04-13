package com.divergent.map.assigment;

import java.util.Map;
import java.util.TreeMap;

/**
 * In TreeMap we can not store Null key but store many null values
 * 
 * @author Divergent
 *
 */
public class TreeMapUsed {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(101, "jay");
		map.put(103, "Shamu");
		map.put(105, "Sakshi");
		map.put(107, "Kanchan");
//		map.put(null, "Sahil");     // Null Value gave error NullPointerException
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.remove(103);
		System.out.println("After remove");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		/**
		 * If we find unstroed key the give null
		 */
		System.out.println("Get Value : " + map.get(102));
	}

}
