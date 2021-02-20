package com.udemy.learningprogramming.dates;

import java.util.Date;

public class DateAndDateTime {
	
	public static void main(String[] args) {
		
		java.sql.Date date = new java.sql.Date(2021, 02, 20);
		Date date2 = new Date();
		
		System.out.println(date);
		System.out.println(date2);
		
		date.after(date2);
		
		System.out.println(date);
		
		
	}

}
