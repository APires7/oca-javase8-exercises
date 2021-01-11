package com.arrays;
/**
 * Vai printar 2 e -5
 * 
 * @author allan
 *
 */
public class ArraysTesteMesa {

	public static void main(String[] args) {

		int x[] = new int[3];
		for (x[1] = x.length - 1; x[1] >= 0; x[1]--) {
			System.out.println("---------------");
			for (int i : x)
				System.out.println(i);
			System.out.println("---------------");
			
			x[x[1]] = -5;
			System.out.println("Valor:" + x[1]);
			
			System.out.println("---------------");
			for (int i : x)
				System.out.println(i);
			System.out.println("---------------");
		}
	}
}
