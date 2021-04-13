package com.divergent.collections.assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetUsed {

	/**
	 * LinkedHashSet remove duplicate data 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Ajay");
		set.add("Raj");
		set.add("Ajay");
		set.add("Vijay");
		set.forEach((str) -> System.out.println(str));

	}

}
