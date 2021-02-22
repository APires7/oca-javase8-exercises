package com;

import java.util.ArrayList;
import java.util.List;

public class QuestionsArrayListTwo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Array");
		list.set(0, "List"); // changes the value of index

		System.out.println(list); // Only prints List

		List<String> list2 = new ArrayList<>();

		list2.add("Array");
		list2.add(0, "List");

		System.out.println(list2); // [List, Array]

		// Another methods in list
		List<Integer> listInteger = new ArrayList<>();

		listInteger.add(100);
		listInteger.add(new Integer(100));
		listInteger.add(85);
		listInteger.add(90 + 10);

		System.out.println(listInteger.get(0) == listInteger.get(1));
		System.out.println(listInteger.get(0) == listInteger.get(3));
		System.out.println(listInteger.get(1) == listInteger.get(3));

		listInteger.remove(new Integer(100));

		System.out.println(listInteger);

		System.out.println("--------------------");

		List<String> dryFruits = new ArrayList<>();
		dryFruits.add("Walnut");
		dryFruits.add("Apricot");
		dryFruits.add("Almond");
		dryFruits.add("Date");

		for (String dryFruit : dryFruits) {
			if (dryFruit.startsWith("A")) { // Runtime exception
				dryFruits.remove(dryFruit);
			}
		}

		System.out.println(dryFruits);

	}

}
