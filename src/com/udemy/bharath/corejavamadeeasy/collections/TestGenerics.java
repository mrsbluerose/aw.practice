package com.udemy.bharath.corejavamadeeasy.collections;

public class TestGenerics {

	public static void main(String[] args) {

		AGenericClass<String> s = new AGenericClass<>("Mary");
		s.displayObjectDetails();
		System.out.println(s.getObject());
	}

}
