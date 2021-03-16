package com.bharath.java.review.multithreading;

public class MultiThreaded extends Thread{ //Thread class implements Runnable, and you have to override the run() method
	
	public static void main(String[] args) {
		
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		
		for(int j=1;j<=200; j++) {
			System.out.print("j: " + j + "\t");
//			if(j>0 && j%10 == 0) {
//				System.out.println("");
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void run() { //API: Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
		for(int i=1;i<=200; i++) {
			System.out.print("i: " + i + "\t");
//			if(i>0 && i%10 == 0) {
//				System.out.println("");
//			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
