package com.udemy.bharath.corejavamadeeasy.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args){

//		FileReader fr = null;  //don't need with try with resources
//		BufferedReader br = null;  //don't need with try with resources
		
		int count = 0;
		
		try(FileReader fr = new FileReader("myFile.txt");  //This is "try with resources, and java automatically closes these resources
				BufferedReader br = new BufferedReader(fr);) {
			
//			fr = new FileReader("myFile.txt");  //don't need with try with resources
//			br = new BufferedReader(fr);  //don't need with try with resources
//			
			
			String line;
			
			while((line=br.readLine()) !=null) {
				
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			
			System.out.println("Number of words in file: " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} finally {  //don't need with try with resources
//			try {
//				fr.close();
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}

}
