package com.udemy.bharath.corejavamadeeasy.multithreading;

public class EvenNumbersThread implements Runnable{
int maxNumber;

	
EvenNumbersThread(int maxNumber){
		this.maxNumber = maxNumber;
	}
	
	public void run() {
		for(int i=0;i<=maxNumber;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
