package com.ocajexam.tutorial.exercises;

import java.util.ArrayList;
import java.util.List;

public class JavaSETest {

	public static void main(String[] args) {
		exercise1();
		exercise2();

	}

	/**
	 * What is the result? An IndexOutOfBoundsException is thrown at runtime.
	 */
	private static void exercise1() {
		List<Integer> elements = new ArrayList<>();

		elements.add(10);

		// IndexOutOfBoundsException
		int firstElement = elements.get(1);
		System.out.println(firstElement);
	}

	/**
	 * Which two code fragments can be inserted at Line n1, independently, enable to
	 * print Stand? Any value that isn't in the switch, like 14 and 18
	 */
	private static void exercise2() {
		int cardVal = 0;

		// Line n1
		switch (cardVal) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("HIT");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Double");
			break;
		case 15:
		case 16:
			System.out.println("Surrender");
			break;
		default:
			System.out.println("Stand");

		}
	}

}
