package com;

import java.util.ArrayList;
import java.util.List;

public class QuestionsArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
			
		list.add("Allan");
		list.add("José");
		list.add("Jean");
		list.set(1, "Eduardo"); // changes the index 1
		
		for(String nome : list) {
			System.out.println(nome); // Allan, Eduardo, Jean
		}
		
		System.out.println("Removing index 0");
		
		list.remove(0); // Remove the name of index 0
		
		for(String nome : list) {
			System.out.println(nome); // Eduardo, Jean
		}
		
		System.out.println("Removing using String name");
		
//		list.remove("Jean"); // Remove the name of Jean in the list
		
//		for(String nome : list) {
//			System.out.println(nome); // Eduardo
//		}
		
		if(list.remove(new String("Jean"))) { // Removing Jean
			list.remove(0); // Removing Eduardo
		}
		
		for(String nome : list) {
			System.out.println(nome); // 
		}
		
			
			

	}

}
