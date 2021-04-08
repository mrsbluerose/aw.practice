package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.PriorityQueue;
import java.util.Queue;



public class ProrityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<>();
		
		System.out.println(q.peek()); // returns "null" if empty
		//System.out.println(q.element()); throws exception if empty
		
		for (int i = 0; i < 20; i++) {
			q.offer(i);
		}
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q);
	}
	
	


}
