package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		for (int i=0; i<10;i++) {
			list.add((int)(i+(Math.random()*100)));
		}
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		List<String> anotherList = new LinkedList<>();
		anotherList.add("abc");
		anotherList.add("xyz");
		anotherList.add("def");
		anotherList.add("mno");
		
		ListIterator<String> listIterator = anotherList.listIterator();

		System.out.println("Forwards");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("Backwards");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

}
