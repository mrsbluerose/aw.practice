package aw.practice;

import java.util.ArrayList;
import java.util.Stack;


public class Palindrome {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('b');
		list.add('a');
		
		System.out.println(isPalindrome(list));
	}

	private static boolean isPalindrome(ArrayList<Character> list) {
		boolean answer=false;
		Stack<Character> charStack = new Stack<>();
		for(Character c:list) {
			charStack.add(c);
		}
		for(Character c:list) {
			if (c != charStack.pop()) {
				answer=false;
				break;
			}
			else {
				answer=true;
			}
		}
		return answer;
	}

}
