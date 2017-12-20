package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sap.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Just a Hero for Fun\n");
		bw.write("Shadow Clone Jutsu\n");
		
		bw.close();
		fw.close();
		System.out.println("File is Appended...");
	}
}
