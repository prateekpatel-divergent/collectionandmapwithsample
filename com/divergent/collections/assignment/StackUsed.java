package com.divergent.collections.assignment;

import java.util.Iterator;
import java.util.Stack;

public class StackUsed {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Ayush");
		st.push("sahil");
		st.push("Ravi");
		st.push("Ashish");
		st.push("Amit");
		
		st.forEach((str)->System.out.println(st));
	
		st.pop(); // Remove element into stack
		
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
