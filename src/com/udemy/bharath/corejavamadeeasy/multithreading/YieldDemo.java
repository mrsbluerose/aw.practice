package com.udemy.bharath.corejavamadeeasy.multithreading;

public class YieldDemo {
	public static void main(String[] args) {
		YieldThread yt = new YieldThread();
		yt.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main thread");
		}
	}
}
