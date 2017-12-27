package com.pack1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionDemo {

	public static void main(String[] args) {
		Instant ins = Instant.now();
		ZonedDateTime zt = ins.atZone(ZoneId.systemDefault());
		LocalDate dt = zt.toLocalDate();
		
		

	}

}
