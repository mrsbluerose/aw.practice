package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> s = new TreeSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			s.add(i*10);
		}
		
		s.remove(20);
		System.out.println(s);
		System.out.println(s.ceiling(20));
		System.out.println(s.higher(20));
		System.out.println(s.floor(20));
		System.out.println(s.lower(20));
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);
		System.out.println(s.descendingSet());
		
	}

}
