package com.ocajexam.tutorial.exercises;

/**
 * Which statement, when inserted at Line n1, enables the code to compile? super(10)
 * 
 *
 */
class SuperClass {
	SuperClass(int x) {
		System.out.println("Super");
	}
}

class SubClass extends SuperClass {
	SubClass() {
		// Line n1
		super(10);
		System.out.println("Sub 2");
	}
}
