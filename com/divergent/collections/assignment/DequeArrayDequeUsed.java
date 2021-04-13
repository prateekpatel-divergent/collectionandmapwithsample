package com.divergent.collections.assignment;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArrayDequeUsed {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Gautam");
		deque.add("Roshan");
		deque.add("Sohan");
		deque.add("shyam");
		
		deque.forEach((str)->System.out.println("Array Deque:- "+str));

		System.out.println("After Remove in deque element");
		deque.remove();
		deque.forEach((str)->System.out.println("Array Deque:- "+str));
	}

}
