package com.divergent.collections.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListUsed {

	public static void main(String[] args) {
		Logger log = Logger.getAnonymousLogger();
		List<String> list = new ArrayList<String>();
		list.add("Ramu");
		list.add("shamu");
		list.add("sumit");
		list.add("Raju");
		log.log(Level.INFO, "Iterate by ForEach Loop");

		/**
		 * Iterate by forEach loop
		 */
		list.forEach((str) -> System.out.println(str));

		log.log(Level.INFO, "Iterate By While loop");

		/**
		 * Iterate by while loop with iterate
		 */
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
