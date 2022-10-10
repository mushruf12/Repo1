package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Date1 {
	
	public static void findDate() {
		
		LocalDate date = LocalDate.of(2022,1,26);
		System.out.println("The republic day:  "+ date);
		
		
		LocalDate date1 = LocalDate.of(2030,10,7);
		System.out.println(date1.getDayOfWeek());
		LocalDate nextWednesday = date1.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("next Wednesday from now is "+ nextWednesday);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDate();
	}

}
