package com.divergent.collections.assignment;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueUsed {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Shaym lal");
		queue.add("Ravi Kumar");
		queue.add("Ak Shiva Lala");
		queue.add("Raj");
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue.peek());
		
		System.out.println("Iterate Queue elements");
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.remove();
		System.out.println("Iterate after remove");
		queue.forEach((str)->System.out.println(str));

		queue.poll();
		System.out.println("Iterate After poll ");
		queue.forEach((str1)->System.out.println(str1));
	}

}
