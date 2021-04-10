package aw.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class UsingArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for(Integer i: numbers) {
			System.out.println(i);
		}
		System.out.println(numbers.contains(4));
		
		LinkedList<Integer> numberLinked = new LinkedList<>();
		numberLinked.add(1);
		numberLinked.add(2);
		numberLinked.add(3);
		numberLinked.add(4);
		numberLinked.add(5);

		for(Integer i: numberLinked) {
			System.out.println(i);
		}	
		
		//testing a change
	}
}
