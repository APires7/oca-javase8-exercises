package com.udemy.learningprogramming.strings.equality;

public class UnderstandigEquality {
	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("Java");

		System.out.println(one == two); // false
		System.out.println(one == three); // true

		String x = "Java";
		String y = "Java";

		System.out.println(x == y);

		String a = "Java";
		String b = " Java".trim();

		System.out.println(a == b); // false

		String c = "Java";
		String d = " Ja".trim() + "va";

		System.out.println(c == d); // false

		String e = "Java";
//		System.out.println(e == three); // doesn't compile
		System.out.println(e == three.toString());
	}
}
