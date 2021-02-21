package com.udemy.learningprogramming.dates;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateExercises {
	
	public static void main(String[] args) {
		LocalDateTime d= LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("Short formater= " + d.format(f)); // 11:22
		
		f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("Medium formatter= " +  d.format(f)); // 7 de mar de 2014
		
		f = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Long formatter= " +  d.format(f)); // 7 de março de 2014
		
		f = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Full formatter= " +  d.format(f)); // sexta-feira, 7 de marco de 2014
		
		
		LocalDateTime d2 = LocalDateTime.of(2017, 5, 10, 11, 22, 33);
		Period p2 = Period.ofDays(1).ofYears(2); // Only ofYears will work
		d2 = d2.minus(p2);
		
		DateTimeFormatter f2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println("Short formater= " + d2.format(f2)); // 10/05/2015 11:22 or 5/10/15 11:22 AM
		
		f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("Medium formatter= " +  d2.format(f2)); // 10 de mai de 2015
		
		f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println("Long formatter= " +  d2.format(f2)); // 10 de maio de 2015
		
		f2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Full formatter= " +  d2.format(f2)); // domingo, 10 de maio de 2015
		
		
	}

}
