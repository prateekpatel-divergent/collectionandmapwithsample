package com.divergent.collections.assignment;

import java.util.HashSet;

public class HashSetUsed {

	/**
	 * In Hashset it remove duplicate data
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Ajay");
		set.add("Raj");
		set.add("Ajay");
		set.add("Vijay");
		set.forEach((str) -> System.out.println(str));
	}

}
