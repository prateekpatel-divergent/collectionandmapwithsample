package com.divergent.collections.assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedListUsed {

	public static void main(String[] args) {
		Logger log = Logger.getAnonymousLogger();
		List<String> list = new LinkedList<>();
		list.add("Ravi");
		list.add("Rahul");
		list.add("Shaym");
		list.add("Kapil");
		
		/**
		 * Iterate Linked List
		 */
		log.log(Level.INFO,"Iterate By Loop");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Linked List : "+itr.next());
		}
	}

}
