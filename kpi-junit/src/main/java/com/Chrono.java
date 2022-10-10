package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {
	public static void checkingChronoEnum() {
		LocalDate date = LocalDate.now();
		System.out.println("Current date is : "+ date);
		
		LocalDate year = date.plus(2,ChronoUnit.YEARS);
		System.out.println("next to next year is "+year);
		
		LocalDate nextMonth = date.plus(1,ChronoUnit.MONTHS);
		System.out.println("The next month is " + nextMonth);
		
		LocalDate nextWeek = date.plus(1,ChronoUnit.WEEKS);
		System.out.println("The next week is " + nextWeek);
		
		
		
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		checkingChronoEnum();
	}

}
