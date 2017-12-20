package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sap.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Sapient RazorFish training held in Quintjet\n");
		bw.write("With Great Power Comes Great Responsibility\n");
		
		bw.close();
		fw.close();
		System.out.println("File is Created...");
	}

}
