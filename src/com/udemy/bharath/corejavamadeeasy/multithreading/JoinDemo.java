package com.udemy.bharath.corejavamadeeasy.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n;
	static int sum = 0;

	public static void main(String[] args) {
		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value");
		Scanner scanner = new Scanner(System.in);
		JoinDemo.n = scanner.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();
		try {
			jd.join(); //ensures this thread completes and enters dead state before the next thread executes.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

		System.out.println("sum of first " + JoinDemo.n + " Numbers is " + JoinDemo.sum);
		scanner.close();
	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
		}
	}
}
