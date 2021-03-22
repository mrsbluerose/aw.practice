package com.udemy.bharath.corejavamadeeasy.multithreading;

public class YieldThread extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Yield Thread");
			Thread.yield(); //<--waits for main thread to finish
		}
	}
}
