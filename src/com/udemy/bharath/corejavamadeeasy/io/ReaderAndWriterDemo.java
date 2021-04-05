package com.udemy.bharath.corejavamadeeasy.io;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception { // lazy add throws general exception

		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("myFile.txt");
		fw = new FileWriter("newFile.txt");
		
		int ch;
		
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
	}

}
