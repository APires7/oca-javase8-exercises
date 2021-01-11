package com.arrays;

public class ArraysCasting {

	public static void main(String[] args) {
		int[] numeros = {0, 1, 2, 3};
		// Não tem como fazer casting de primitivos
		long numeros2[] = numeros;
		long numeros3[] = (long[]) numeros;
		
		// Quando é um cast de objetos funciona (String é um Object)
		String[] nomes = {"Allan", "Victor"};
		Object[] obj;
		
		obj = nomes;
		
		
		
		

	}

}
