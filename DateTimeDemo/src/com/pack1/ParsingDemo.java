package com.pack1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		String str = "12-Feb-2014";
		LocalDate ldt = LocalDate.parse(str,df);
		System.out.println(ldt);
		System.out.println(Instant.now());
	}

}
