package com.bharath.corejavamadeeasy.executorframework;

public class CheckProcessorTask implements Runnable {
	String name;

	public CheckProcessorTask(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " Check Processor has begun processing " + Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " completed " + Thread.currentThread().getName());

	}

}
