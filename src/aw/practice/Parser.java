package aw.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Parser {
	boolean isBalanced(String s) {

		boolean answer = false;
		char characterToCheck;

		ArrayList<Character> characterList = new ArrayList<>();
		for (char c : s.toCharArray()) {
			characterList.add(c);
		}

		int size = characterList.size();

		HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
		bracketPairs.put('{', '}');
		bracketPairs.put('(', ')');

		// if it's odd numbered or starts with a closing bracket, skip everything and return false
		if (size % 2 != 0 || bracketPairs.containsValue(characterList.get(0))) { 
			size = 0;
		}

		for (int i = 0; i < size; i++) {
			if (i > 0) { // avoid out of bounds exception by starting on at least the second character
				char c = characterList.get(i); // current character selected in list
				if (bracketPairs.containsValue(c)) { // if it's a closed bracket
					characterToCheck = characterList.get(i - 1); // get previous list item
					if (c == bracketPairs.get(characterToCheck)) { // if the previous list item is the opening bracket
						answer = true;
						characterList.remove(i - 1); // remove the previous element
						characterList.remove(i - 1); // remove c (that has been shifted into the previous elements spot)
						size = characterList.size(); // set the new list size
						if (i > 2) {
							i = i - 2;// start at point before the two elements removed
						} else {
							i = 0; //start over from beginning
						}

					} else {
						answer = false;
						break;
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Parser parser = new Parser();
		String a = "{}()"; // true
		String b = "{()}"; // true
		String c = "{})"; // false
		String d = "}{()"; // false
		String e = "{({)"; // false
		String f = "{((()))}"; // true
		String g = "()()()(){"; // false

		System.out.println("Should be TRUE a: " + parser.isBalanced(a));
		System.out.println("Should be TRUE b: " + parser.isBalanced(b));
		System.out.println("Should be false c: " + parser.isBalanced(c));
		System.out.println("Should be false d: " + parser.isBalanced(d));
		System.out.println("Should be false e: " + parser.isBalanced(e));
		System.out.println("Should be TRUE f: " + parser.isBalanced(f));
		System.out.println("Should be false g: " + parser.isBalanced(g));
	}

}
