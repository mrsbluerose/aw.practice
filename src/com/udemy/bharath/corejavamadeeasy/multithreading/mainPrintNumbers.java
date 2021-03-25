/*
 * Create two thread classes and a main class. 
 * One class calculates even numbers up to 10. 
 * The other class calculates odd numbers up to ten. 
 * Print them out from 0 to 10.
 */
package com.udemy.bharath.corejavamadeeasy.multithreading;

public class mainPrintNumbers {
	
	static final int MAX_NUMBER = 10;

	public static void main(String[] args) {
		EvenNumbersThread ent = new EvenNumbersThread(MAX_NUMBER);
		OddNumbersThread ont = new OddNumbersThread(MAX_NUMBER);
		
		Thread t1= new Thread(ent);
		Thread t2 = new Thread(ont);
		t1.start();
		t2.start();
		
	}

}
