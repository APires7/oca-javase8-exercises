package com.ocajexam.tutorial.exercises;

import java.util.ArrayList;
import java.util.List;

public class JavaSETest {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();

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

	/**
	 * What is the result? Box
	 */
	private static void exercise3() {
		List<String> items = new ArrayList<>();
		items.add("Pen");
		items.add("Pencil");
		items.add("Box");
		for (String i : items) {
			// Returns the index within this string of the first occurrence of the specified
			// character, starting the search at the specified index
			if (i.indexOf("P") == 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * What is the result? Compilation fails, because catch of ArithmeticException
	 * should be first than Exception
	 */
	private static void exercise4() {
		int x = 10;
		int y = 2;
		try {
			for (int z = 2; z >= 0; z--) {
				int ans = x / z;
				System.out.print(ans + " ");
			}
		} catch (Exception e1) {
			System.out.println("E1");
//		} catch (ArithmeticException e1) {
//			System.out.println("E2");
		}
	}

	/**
	 * What is the result? 4
	 */
	private static void exercise5() {
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		s1.substring(4);
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
	}

}
