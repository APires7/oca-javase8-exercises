package com.udemy.learningprogramming.classdesign.interfaces.implementation;

public interface Phone {
	
//	public static int DEFAULT_CODE = 55; // In interface always be public and static
	int DEFAULT_CODE = 55;
	
	public void dialNumber(int number);
	
	public boolean isCallInProgress();

}
