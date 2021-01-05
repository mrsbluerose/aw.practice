package aw.practice;

import java.util.Stack;

public class Parser {
	boolean isBalanced(String s) {
			
	        boolean answer = false;
	        char[] open = {'{','('};
	        char[] closed = {'}', ')'};
	        Stack<Character> = new Stack<>();
	        
	        char[] cArray = s.toCharArray();
	        for(int i=0; i<cArray.length; i++) {
	        	if(cArray[i]== '{' || cArray[i]== '(') {
	        		
	        	}
	        }
	        
	        return answer;
	    }
	

	public static void main(String[] args) {
		Parser parser = new Parser();
		String s = "{}()";
		String a = "{()}";
		String b = "{})";

		System.out.println(parser.isBalanced(s));
		System.out.println(parser.isBalanced(a));
		System.out.println(parser.isBalanced(a));
	}

}
