package aw.practice;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Character> myList = new LinkedList<>();
		myList.add('A');
		myList.add('C');
		myList.add('D');
		myList.add('E');
		myList.add('F');
		myList.add('G');

		for(int i=0; i<myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println("");
		
		myList.remove(myList.size()/2);
		
		for(int i=0; i<myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
	}

}
