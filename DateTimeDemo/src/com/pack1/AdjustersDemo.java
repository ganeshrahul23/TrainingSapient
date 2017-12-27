package com.pack1;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
public class AdjustersDemo {

	public static void main(String[] args) {
		LocalDate ldt = LocalDate.now();
		System.out.println(ldt.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(ldt.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(ldt.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

	}

}
