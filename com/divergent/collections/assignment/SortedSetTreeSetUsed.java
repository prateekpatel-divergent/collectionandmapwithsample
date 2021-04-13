package com.divergent.collections.assignment;

import java.util.TreeSet;

public class SortedSetTreeSetUsed {

	/**
	 * Tree Set is a sorted element and remove dulpicate element
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("jay");
		set.add("Raj");
		set.add("Ajay");
		set.add("Vijay");
		set.add("Raj");
		set.forEach((str) -> System.out.println(str));
	}

}
