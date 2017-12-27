package com.pack1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;

public class ZonedDemo {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("default zone " + ldt);
		
		ZonedDateTime tokyo = ldt.atZone(ZoneId.of("Asia/Tokyo")).plusHours(9);
		System.out.println(tokyo);
		
		HijrahDate ramadan = HijrahDate.now();
		System.out.println(ramadan);

		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(2011, 7, 21);
		Period p = Period.between(ld1, ld);
		System.out.println(p.getYears());
	}

}
