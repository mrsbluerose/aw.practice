package com.udemy.bharath.corejavamadeeasy.io;
import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	double salary;
	transient int ssn; //this prevents ssn from being serialized
	
	public Employee(int id, String name, double salary, int ssn) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
	
	
}
