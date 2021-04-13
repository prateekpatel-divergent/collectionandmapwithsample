package com.divergent.collections.assignment;

import java.util.Iterator;
import java.util.Vector;

public class VectorUsed {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		/**
		 * Iterate Integer by loop
		 */
		v.forEach((num)->System.out.println("Number of Vector "+num));
		
		/**
		 * iterate number by loop
		 */
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println("\n"+itr.next());
		}
	}

}
