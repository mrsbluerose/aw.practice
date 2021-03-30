package com.udemy.bharath.corejavamadeeasy.innerclasses;

public class OuterClass {

	// Outer class variables
	private static int x = 50;
	private int y;

	// Outer class constructor
	OuterClass(int y) {
		this.y = y;
	}

	// static outer method
	static void staticOuterMethod() {
		System.out.println("OuterClass's Static Method");
	}

	// non static outer method
	void nonStaticOuterMethod() {
		System.out.println("Outer Class's non static method");
		
		//local inner class - must be defined inside a block or method
		class LocalInnerClass {
		
			void localInnerMethod() {
				System.out.println("Inside Local inner's method");
			}
		}
		//create instance of local inner class and use local inner method
		LocalInnerClass inner = new LocalInnerClass();
		inner.localInnerMethod();
	}

	// StaticInnerClass class
	static class StaticInnerClass {

		// static inner method
		static void staticInnerMethod() {
			System.out.println("StaticInnerClass's static method");
		}

		// non-static inner method
		void nonStaticInnerMethod() {
			System.out.println("Non static method inside the inner class");
		}

	}

	class NonStaticInnerClass {

		// Inner non static class variable
		private int y;

		// Inner non static class constructor
		NonStaticInnerClass(int y){
			this.y = y;
		}

		// non-static inner method
		void nonStaticMethod() {
			System.out.println("Non static Inner Classes non static method");
		}
		 //
		private void nonStaticMethod2() {
			System.out.println("Outer Class static x:" + OuterClass.x); //access outer static
			System.out.println("Outer Class non static y:" + OuterClass.this.y); //use "this" reference to access outer non static
			System.out.println("Inner Class y:" + this.y); 
		}
	}

	public static void main(String[] args) {

		/*
		 * Using outer class to access inner class
		 */

		// refer to static members as usual by using className.member. In this case,
		// outerClassName.innerClassName.member.
		OuterClass.staticOuterMethod();
		OuterClass.StaticInnerClass.staticInnerMethod();

		// refer to non-static members by creating an object of the inner class and
		// using dot operator.
		OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
		inner.nonStaticInnerMethod();

		// refer to non static outer class members
		OuterClass outerClass = new OuterClass(80); // enter int for constructor
		outerClass.nonStaticOuterMethod();

		// refer to non static inner class. Must use outerClassName.new <- keyword
		OuterClass.NonStaticInnerClass innerClass = outerClass.new NonStaticInnerClass(30);  // enter int for constructor
		innerClass.nonStaticMethod();
		innerClass.nonStaticMethod2();
		System.out.println(innerClass.y);
		

		/*
		 * Using inner class to access outer class
		 */
		//see nonSTaticMethod2() in InnerClass
	}

}
