package com.udemy.bharath.corejavamadeeasy.collections;

public class AGenericClass<T> {

	T obj;
	
	AGenericClass(T obj){
		this.obj = obj;
	}
	
	public void displayObjectDetails() {
		System.out.println("The type of object: " + obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}
}
