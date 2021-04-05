package com.udemy.bharath.corejavamadeeasy.io;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String s = "You are the creator.";
		String commas = "You, are, the, creator.";
		
		StringTokenizer st = new StringTokenizer(s);
		StringTokenizer st2 = new StringTokenizer(s,","); //has delimiter
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
