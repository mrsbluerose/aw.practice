package com.udemy.bharath.corejavamadeeasy.multithreading;

public class OddNumbersThread implements Runnable {
	
	int maxNumber;

	
	OddNumbersThread(int maxNumber){
		this.maxNumber = maxNumber;
	}
	
	public void run() {
		for(int i=0;i<=maxNumber;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			if(i%2>0 && i!=0) {
				System.out.println(i);
			}
		}
	}
}
