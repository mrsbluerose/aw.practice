package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Z");
		list.add("A");
		list.add("D");
		list.add("W");
		
		System.out.println("Before: " + list);
		Collections.sort(list);
		System.out.println("After: " + list);
		//Collections.sort(list, new ComparatorDemo());
		System.out.println("After Descending: " + list);
		
		int result = Collections.binarySearch(list, "D");
		System.out.println("Index of element: " + result);
	}

}
