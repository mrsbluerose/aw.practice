package aw.practice.interviews;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {

	public static int simpleArraySum(List<Integer> ar) {
	    // Write your code here
	    int sum = 0;
	    for(Integer e: ar) {
	    	sum +=e;
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(10);
		ar.add(11);
		
		int sum = simpleArraySum(ar);
		System.out.println(sum);
	}
}
