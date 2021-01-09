package com.ocajexam.tutorial.exercises;

/**
 * What is the result? Writing...
 */
public class Programmer extends Writer {

	public static void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
	}

}

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}