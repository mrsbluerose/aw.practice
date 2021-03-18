package com.bharath.java.review.inheritance;

public class Manager extends Employee {

	String[] projects;
	
	public Manager(int id, String name, String dept, double salary, String[] projects) {
		super(id, name, dept, salary);
		this.projects = projects;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is working on projects");
		for(String p:projects) {
			System.out.println(p);
		}
	}
}
