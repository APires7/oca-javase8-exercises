package com.udemy.learningprogramming.operators.equality;

public class EqualityOperators {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean c = a == b; // false
		boolean d = a != b; // true
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("d= " + d);
		
//		boolean g = true == 0; // doesn't compile
//		boolean h = false != "test"; doesn't compile
		
		boolean x = true;
		boolean y = false;
		boolean z = (y = true) && (x = false);
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
	}
}
