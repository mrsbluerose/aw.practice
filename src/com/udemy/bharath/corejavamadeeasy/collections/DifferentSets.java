package com.udemy.bharath.corejavamadeeasy.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {

		Random obj = new Random();
		
		//HashSet<Integer> set = new HashSet<>();
		//LinkedHashSet<Integer> set = new LinkedHashSet<>();
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.println(number);
			
		}
		
		//All sets remove any duplicates in the list
		
		//System.out.println("HashSet elements" + set); //random order
		//System.out.println("LinkedHashSet elements" + set); //maintains order of original input
		System.out.println("TreeHashSet elements" + set);  //sorts in ascending order
	}

}
