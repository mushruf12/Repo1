package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	
	public static void LocalDateTimeApi() {
		LocalDate date = LocalDate.now();
		System.out.println("The current date is "+ date);
		
		LocalTime time = LocalTime.now();
		System.out.println("The current time is "+ time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("The current date and time is "+ current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
		
		System.out.println("in formatted manner"+formatedDateTime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int hour = current.getHour();
		int year = current.getYear();
		System.out.println("Month : "+month+" day: "+day+" Seconds : "+seconds+" hour :"+hour+"year :"+year);
		
		
	}

}
