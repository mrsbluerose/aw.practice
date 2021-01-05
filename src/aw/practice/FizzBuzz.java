package aw.practice;

public class FizzBuzz {

	public static int fizzBuzz(int n) {
		if(n%3==0) {
			if(n%5==0) {
				System.out.println("FizzBuzz/n");
			} else {
				System.out.println("Fizz/n");
			}
		} else if(n%5==0) {
			System.out.println("Buzz/n");
		} else {
			System.out.println(n + "/n");
		}
		
		return 000;
		
	}
	
	public static void main(String args) {
		int i =15;
		System.out.println(fizzBuzz(i));
	}
	
}
