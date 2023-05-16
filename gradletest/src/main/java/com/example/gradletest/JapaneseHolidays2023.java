package com.example.gradletest;

import one.cafebabe.businesscalendar4j.BusinessCalendar;
import static one.cafebabe.businesscalendar4j.BusinessCalendar.JAPAN;
import java.time.LocalDate;

public class JapaneseHolidays2023 {
	public static void main(String[] args) {
		BusinessCalendar.newBuilder().holiday(JAPAN.PUBLIC_HOLIDAYS).build()
			.getHolidaysBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31))
			.forEach(System.out::println);
	}
}
