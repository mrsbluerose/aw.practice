package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new ComparatorDemo()); //uses comparator to sort
		
		set.add("abc");
		set.add("xyz");
		set.add("def");
		set.add("mno");
		
		for (String string : set) {
			System.out.println(string);
		}
		
		Set<StringBuffer> anotherSet = new TreeSet<>();
		
		anotherSet.add(new StringBuffer("abc"));
		anotherSet.add(new StringBuffer("xyz"));
		anotherSet.add(new StringBuffer("def"));
		anotherSet.add(new StringBuffer("mno"));
		
		for (StringBuffer obj : anotherSet) {
			System.out.println(obj);
		}
		
	}

}
