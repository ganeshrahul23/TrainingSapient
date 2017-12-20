package com.sapient.text;

import java.io.*;
import java.io.FileReader;

public class ReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("sap.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		
		br.close();
		fr.close();
	}
}
