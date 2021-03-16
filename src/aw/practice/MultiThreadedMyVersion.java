package aw.practice;

public class MultiThreadedMyVersion extends Thread{ //Thread class implements Runnable, and you have to override the run() method
	
	public static void main(String[] args) {
		
		MultiThreadedMyVersion mt = new MultiThreadedMyVersion();
		
		mt.start();
		
		
		for(int j=1;j<=200; j++) {
			System.out.println("j: " + j);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
	public void run() { //API: Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
		for(int i=1;i<=200; i++) {
			System.out.println("\ti: " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
