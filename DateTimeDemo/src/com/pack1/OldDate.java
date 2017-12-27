package com.pack1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class OldDate {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
		Date dt = new Date();
		System.out.println(df.format(dt));

	}

}
