package com.udemy.bharath.corejavamadeeasy.multithreading;
//preferred approach because you can extend multiple classes

public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("Processed the checks");
	}

	public static void main(String[] args) {
		CheckProcessor cp = new CheckProcessor(); //<-- task in run method
		Thread t = new Thread(cp); // <-- creates thread with task
		t.start(); // <-- starts thread
	}

}
