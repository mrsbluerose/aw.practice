package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		//creates a list and adds int numbers
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		for (int i=0; i<10;i++) {
			list.add((int)(i+(Math.random()*100)));
		}
		System.out.println("List: " + list);
		//list.add(20.2);
		//list.add("Yo!");
		list.add(2, 500);
		System.out.println("New List: " + list);
		list.set(2, 600);
		System.out.println("New List: " + list);
		
		//creates another list and adds ints
		List<Integer> anotherList = new ArrayList<>();
		for (int i=0; i<5;i++) {
			anotherList.add((int)(i+((Math.random()*20))+1000));
		}
		System.out.println("Another List: " + anotherList);
		
		
		//adds second list to first list
		list.addAll(3,anotherList);
		System.out.println("Another List: " + list);
		
		//searches list for a number
		if(list.contains(600)) {
			Integer a = 600;
			System.out.println("List has 600 at position " + list.indexOf(a));
		} else {
			System.out.println("600 not found in list");
		}
		
		//Print list in columns
		System.out.println("List elements: ");
		System.out.println("Index\tNumber");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "\t" + list.get(i));
		}
		
		//Remove an element
		System.out.println("List elements: ");
		System.out.println("Index\tNumber");
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "\t" + list.get(i));
		}
		
			
	}

}
