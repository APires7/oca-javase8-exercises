package com.udemy.learningprogramming.classdesign.classinheritance;

public class Main {

	public static void main(String[] args) {
//		BorderCollie borderCollie = new Dog(); // does not compile
//		Dog dog = new Animal(); // does not compile
//		Dog dog = (Animal) new Animal(); // does not compile

		BorderCollie border = new BorderCollie();
		border.age = 5;
		border.type = "Dog"; // compile
		border.height = 10.0; // compile but have warning
//		border.test = "Test"; // test is private variable
		int variable = border.age2;
//		border.age2 = 10; // does not compile

		BorderCollie border2 = new BorderCollie();
		double height = border2.height; // compile but have warning

		Dog dog = new Dog();
		dog.age = 10;
		
//		System.out.println(1);
		
		

	}

}
