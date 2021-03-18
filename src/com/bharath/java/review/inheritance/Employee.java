package com.bharath.java.review.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	protected void work() {
		System.out.println("common work for everyone");
	}
	
}
