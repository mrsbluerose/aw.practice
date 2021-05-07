package aw.practice.interviews;

import java.util.ArrayList;

import java.util.List;

public class AreSame {
	
	public static boolean comp(int[] a, int[] b) {
		boolean areSame = false;
		int test = 0;
		if(a !=null && b !=null && a.length==b.length){
      List<Integer> list = new ArrayList<>();
		  for(int i=0;i<b.length;i++) {
			  list.add(b[i]);
		  }
			for(int i=0;i<a.length;i++) {
				test = a[i]*a[i];
				if(list.contains(test)) {
					areSame=true;
					list.remove(Integer.valueOf(test));
				}else {
					areSame = false;
					i=a.length;
				}
			}
		}else if(a==null && b==null) {
			areSame = true;
		}
		
		return areSame;
	}

	public static void main(String[] args) {
		int[] a = { 121, 144, 19, 161, 19, 144, 19, 11 };
		int[] b = { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };
		int[] c = null;
		int[] d = null;
		System.out.println(comp(a, b));
		System.out.println(comp(c, d));
	}
}
