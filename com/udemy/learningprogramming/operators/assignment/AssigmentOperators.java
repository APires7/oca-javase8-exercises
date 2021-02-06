package com.udemy.learningprogramming.operators.assignment;

public class AssigmentOperators {
	
	public static void main(String[] args) {
//		int x = 1.0; // doesn't compile
//		short y = 19812345;
//		int z = 9f;
//		long t = 1923012345678910;
		
		int x = (int) 1.0;
		short y = (short) 19812345; // overflow
		int z = (int) 9f;
		long t = 1923012345678910L;
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		System.out.println("t= " + t);
		
		// overflow and underflow with byte (-128 to 127)
		byte myByte = 127;
		byte mySecondByte = -128;
		
		System.out.println("myByte= " + myByte);
		System.out.println("mySecondByte= " + mySecondByte);
		
		
		myByte++;
		System.out.println("myByte= " + myByte); // -128
		
		mySecondByte--;
		System.out.println("mySecondByte= " + mySecondByte); // 127
		
		
		short a = 10;
		short b = 5;
		
		// If I try to cast only one, doesn't compile because it will autopromote every variable in int
		// You need to cast every result in short to works
		short c = (short) (a * b);
		
		System.out.println("c= " + c);
	}

}
