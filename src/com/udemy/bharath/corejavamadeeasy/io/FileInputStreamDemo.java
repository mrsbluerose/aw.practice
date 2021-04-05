package com.udemy.bharath.corejavamadeeasy.io;

/*
 * myFile.txt in src folder
 */

import java.io.*;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("myFile.txt"));
			System.out.println("File Opened");
			int i;

			while ((i = fis.read()) != -1) { //returns -1 if it has reached the end of file
				System.out.print((char) i); //the read() method returns bytes. Cast to char for the actual character
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); // remember to close resources in finally block
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File Closed");

		}
	}

}
