package aw.practice.interviews;

public class CompressedString {
	
	
	public static void main(String[] args) {
		String str = "aaabbbkkkaddf";
		StringBuilder sb = new StringBuilder();
		char[] myArray = str.toCharArray();
		char c = myArray[0];
		int count = 1;
		
		for(int i=0; i<myArray.length; i++ ) {
			
			if(i<myArray.length-1) {
				if(c == myArray[i+1]) {
					count++;
				}
				else {
					sb.append(c + Integer.toString(count));
					c = myArray[i+1];
					count = 1;
				}
				if(i == myArray.length-2) {
					sb.append(c + Integer.toString(count));
				}
			}

			else {
				if(c!=myArray[i]) {
					sb.append(c + count);
				}
			}

		}
		System.out.println(sb.toString());
		
		
	}
}
